package p2023_07_13;

public class Oper04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비교 연산자: >,>=,<,<=,==(같다), !=(같지않다)
		//비교 연산자의 결과가 참이면 true, 거짓이면 false 값을 리턴한다.
		
		String str1="자바";
		String str2="자바";
		String str3=new String("자바");  //new연산자로 String객체?만들수있음, "자바"라는 값을 heap메모리에 저장
		
		//비교 연산자로 주소값을 비교
		if(str1==str2) {
			System.out.println("같은 주소");  //같은주소
		}else {
			System.out.println("다른 주소");
		}
		if(str1==str3) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");  //다른주소 
		}
		
		//값을 비교
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.equals(str3)); //true
	}

}
