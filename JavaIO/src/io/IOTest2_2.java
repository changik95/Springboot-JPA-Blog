package io;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest2_2 {

	public static void main(String[] args) {
		FileReader in = null;
		int ch;
		
		//스트림 생성
		try {
		in = new FileReader("C:\\abc3\\workspace\\javaO\\src\\exception\\ExceptionTest1.java");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			return;
		}
		
		//읽기
		try {
			while((ch = in.read()) != -1) {
			System.out.print((char)ch);
			}
		} catch (IOException e) {
			System.out.println("읽기 오류");
			return;
		}
		//스트림 닫기
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
