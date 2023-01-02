package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOTest8_2 {

	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		BufferedWriter out = null;
		String filename = null;
		File file = null;
		int lineNum = 0;
		String line = null;
		String text = null;
		String yn = null;
		
		System.out.println("내용을 입력하세요. 종료는 첫 칸에서 enter.");
		text = "";
		while (true) {
			System.out.print(++lineNum + ": ");
			line = scan.nextLine();
			if (line.equals("")) break;
			text += line;
			text += "\n";
		}
	
		System.out.print("저장하시겠습니까(y/n)");
		yn = scan.nextLine();
		if (yn.equalsIgnoreCase("n")) return;
		
		while (true) {
			System.out.print("저장할 파일명 : ");
			filename = scan.nextLine();
			file = new File(filename);
			if (!file.isFile()) break;
			System.out.print("이미 사용중인 파일입니다. 덮어쓰시겠습니까? (y/n)");
			yn = scan.nextLine();
			if (yn.equalsIgnoreCase("y")) break;
		}
		
		try {
			out = new BufferedWriter(new FileWriter(file));
			out.write(text);
			out.close();
		} catch  (IOException e) {
			e.printStackTrace();
		}
		System.out.println(filename + "파일이 저장되었습니다.");
	
	
	
	
	}//메인

}
	
				
			
		
	
	
	
	
	


/*-----------------------------------------------
 * 내용을 입력하세요. 종료는 첫 칸에서 enter.
 * 1: 안녕하세요 ( 반복문으로 하면됨, 행번호 계속바뀌어야함)
 * 2: abcde
 * 3: 12345
 * 4: 
 * 
 * 저장하시겠습니까? *(y/n) n 입력시 파일삭제 y시 파일명으로 넘어감
 * 
 * 저장할 파일명 : a.txt
 * 이미 사용중인 파일명입니다. 덮어쓰시겠습니까? (Y/N) 중 입력 n시 
 * 저장할 파일명 : b.txt
 * 이미 사용중인 파일명입니다. 덮어쓰시겠습니까? (Y/N) 중 입력 y시
 * b.txt 파일이 저장되었습니다. 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */ 
