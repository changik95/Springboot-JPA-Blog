package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest1 {

	public static void main(String[] args) { //괄호는 하나의 지역 영역, 클래스 메소드 트라이캐치 등등
//스트림 객체 생성, 필요한걸 읽거나 쓰고 마지막엔 꼭 닫기.
		FileReader in = null;  //굳이 선언한 이유, 자바프로그램은 초기화 하지않은 변수 사용불가.
		int ch;
		
		// 스트림 생성
		try {
			in = new FileReader("C:\\abc3\\workspace\\JavaIO\\src\\io\\FileTest.java");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			return;
		}
		
		// 읽기
		try {
			while((ch = in.read()) != -1) { // read 한글자씩 읽어와서 리턴
				System.out.print((char)ch);
			}
				
		} catch (IOException e) {
			System.out.println("읽기 오류");
			return;
		}
		
		// 스트림 닫기
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
