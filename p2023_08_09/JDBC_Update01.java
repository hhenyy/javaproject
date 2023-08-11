package p2023_08_09;

import java.sql.*;
import java.io.*;  // 도스 콘솔 창에서 사용자 입력을 받아들이기 위해 BufferedReader 

class  JDBC_Update01{
public static void main(String[] args) {

  String driver = "oracle.jdbc.driver.OracleDriver";
  String url = "jdbc:oracle:thin:@localhost:1521:xe";

  Connection con = null;
  PreparedStatement pstmt =  null;

  String sql;        //키보드 변수값
  String name, email, tel ;
  int ino;
  
     try{
      Class.forName(driver);
      con = DriverManager.getConnection(url, "scott", "tiger" );      

      //---JDBC_Insert 추가된 내용-------
      // 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println(" customer 테이블에 값 갱신하기 .....");
      System.out.print("수정할 회원의 회원번호를 입력? ");
      ino = Integer.parseInt(br.readLine()); //int형으로 자료형변환
      
      System.out.print("변경할 이름을 입력:");
      name = br.readLine();            //테이블에 추가할 name 필드 값을 입력 받음
      System.out.print("변경할 이메일 입력: ");
      email = br.readLine();             //테이블에 추가할 email 필드 값을 입력 받음
      System.out.print("변경할 전화번호 입력: ");
      tel = br.readLine();               //테이블에 추가할 tel 필드 값을 입력 받음     

	  sql = "UPDATE customer SET name=?,email = ?, tel = ? where no = ?"; //Statement문과 차이점:값이 들어갈자리에 ?로 들어감
	  pstmt = con.prepareStatement( sql );
	  pstmt.setString(1, name);
	  pstmt.setString(2, email);
	  pstmt.setString(3, tel);
	  pstmt.setInt(4, ino);
      int result=pstmt.executeUpdate(); 
      if(result==1){
    	  System.out.println("데이터 수정 성공");
      }else{
    	  System.out.println("데이터 수정 실패");
      }
	}
    catch(Exception e){
      System.out.println("데이터베이스 연결 실패!");
    }
    finally{
      try{
        if( pstmt != null ) pstmt.close();
        if( con != null )  con.close();
      }
      catch(Exception e){ 
        System.out.println( e.getMessage());
      }
    }
  }
} 
