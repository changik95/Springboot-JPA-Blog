package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOTest8 {

	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		BufferedWriter bw = null;
		FileWriter bs = null;
		String chat;
		String a = null;
		String Y = "Y";
		String N = "N";
		bw = new BufferedWriter(new FileWriter("string.txt"));
		FileInputStream in = null;
		FileOutputStream out = null;
		File infile = null;
		File outfile = null;
		String inName = null;
		String outName = null;
		int n;
	while(true) {
			System.out.print("글자를 입력해주세요");
		for(int i = 1; i < 100; i++ ) {
			chat = scan.nextLine();
			bw.write (i+": "+chat+"\n");
			System.out.println(i+": " + chat);
			if(chat.isEmpty()) {
				bw.close();
				break;
			}
		}
		while (true) {
			System.out.println("임시 파일명을 입력해주세요");
			inName = scan.nextLine();
			infile = new File(inName);
			if (infile.isFile()) break;
			System.out.println("파일이 없습니다");
		}
		while(true) {
			System.out.println("파일을 저장하시겠습니까? (Y/N)");
			a = scan.nextLine();
			if(a.equals(Y)) {//if1
				System.out.println("저장할 파일명을 입력해주세요");
				outName = scan.nextLine();
				outfile = new File(outName);
				if (outfile.isFile() == true) {//if2
					System.out.println("이미 사용중인 파일명 입니다. 덮어쓰시겠습니까?(Y/N)");
					a = scan.nextLine();
					if(a.equals(Y)) {
						try{
							in = new FileInputStream(infile);
							out = new FileOutputStream(outfile); //여기서 파일이 생김
							
							while ((n = in.read()) != -1) { //1바이트씩 읽음
								out.write(n); //읽은값을 계속 out에다 넣어줌
							}
							//스트림 닫기, 생성되었습니다(메세지출력)
							in.close();
							out.close();
							System.out.println(outName + "파일이 생성되었습니다.");
						} catch (IOException e) {
							e.printStackTrace();
						}
						break;
					}
					else if(a.equals(N)){
						System.out.println("저장을 취소하셨습니다."); 
						break;
					}
					else{
						System.out.println("잘못 입력하셨습니다 다시 입력하세요.");
						continue;
					}
				}//if2
			
				}//if1
			else if(a.equals(N)){
				System.out.println("저장을 취소하셨습니다."); 
				break;
			}
			else{
				System.out.println("잘못 입력하셨습니다 다시 입력하세요.");
				continue;
			}
		
		
		}//while2번쨰 끝
		
		
		
		break;
	}//첫 while문
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
