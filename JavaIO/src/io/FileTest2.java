package io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String path = null; 	//경로 입력받을 변수
		File file = null; 		//입력받은 경로로 파일 객체 생성
		String filenames[]; 	//배열 반환
		File files[];
		//경로를 입력받는다. (예: C:\Java)
		System.out.print("경로입력:");
		 path = scan.nextLine();
		 
		//실제로 있는 경로인지 확인하고 없으면 프로그램 종료
		 file = new File(path);
		 if(!file.isDirectory()) {
			 System.out.println("경로 오류");
			 return;
		 }
		 filenames = file.list();   //File 객체가 가리키는 경로의 파일 목록
			
		 
		 //저장된 폴더와 파일의 목록을 화면에 출력
		 for (String s : filenames) {
			 System.out.println(s);
		 }
		
		 files = file.listFiles();
		 for (File f : files) {
			 System.out.println(f.getName() + " " + f.length() + " bytes");
		 }
		
		
		
		
		
		
		
	}

}
