package io;

// buffer 출력은 모아서 한꺼번에 출력함

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IOTest5 {

	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		String inName = null;
		String outName = null;
		int n;
		File infile = null;
		File outfile = null;
		Scanner scan = new Scanner(System.in);
		
		//원본 파일명을 입력받는다.
		while (true) {
			System.out.println("파일명을 입력해주세요");
			inName = scan.nextLine();
			infile = new File(inName);
			if (infile.isFile()) break;
			System.out.println("파일이 없습니다");
		}
		//사본 파일명을 입력받는다. 원본 -> 사본 
		//다른 파일이 사용중인 이름이면 다시 입력받는다.
		while (true) {
			System.out.println("복사할 파일명을 입력해주세요");
			outName = scan.nextLine();
			outfile = new File(outName);
			if (!outfile.isFile()) break;
			System.out.println("중복된 파일명입니다.");
		}
		//파일 복사 (원본으로부터 1바이트 읽어서 사본으로 1바이트 저장)
		try{
			in = new FileInputStream(infile);
			out = new FileOutputStream(outfile); //여기서 파일이 생김
			
			while ((n = in.read()) != -1) { //1바이트씩 읽음
				out.write(n); //읽은값을 계속 out에다 넣어줌
				
			}
			//스트림 닫기, 복사되었습니다(메세지출력)
			in.close(); 
			out.close();
			System.out.println(inName + " -> " + outName + "파일이 복사되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
