package io;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest2 {

	public static void main(String[] args) {
		FileReader in = null;
		BufferedReader br = null; //파일리더는 상관없는데 추가로 버퍼를 사용하고 int -> string으로바꿈
		//버퍼는 채팅같은거 만들때 사용하면좋음
		String ch;
		
		//스트림 생성
		try {
			in = new FileReader("C:\\abc3\\workspace\\JavaIO\\src\\exception\\ExceptionTest1.java");
			br = new BufferedReader(in); //기능추가
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			return;
		}
		
		//읽기
		try {
			while((ch = br.readLine()) != null) {
			System.out.println(ch); //readLine은 엔터키전까지 읽어오니까 ln으로 해야함
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
