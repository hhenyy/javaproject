package p2023_08_07;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 키보드로 입력한 문장을 파일(result.txt)로 저장하는 프로그램을 작성하세요?
// 키보드 입력 : BufferedReader
// 파일 출력 : FileWriter

		System.out.println("문장을 입력하세요?");

		BufferedReader br = 
	new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = br.readLine(); //readLine()<-예외처리 형식을 요구함,하지않으면 형식상오류

			FileWriter fw = new FileWriter("result.txt");
			fw.write(input);

			fw.close();
			System.out.println("저장 성공~!!");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
