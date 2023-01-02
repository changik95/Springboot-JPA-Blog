package io;

import static java.lang.System.in;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

//String 단위으 문자열 출력
//try catch없이 호출한곳으로 떠넘기기
public class IOTest7 {

	public static void main(String[] args) throws Exception{ //최상위를 쓰면 모든예외 다 처리됨
		Scanner scan = new Scanner(System.in);
		BufferedWriter bw = null;
		String s = null;
		
		bw = new BufferedWriter(new FileWriter("string.txt"));
		
		while (true) {
			s =scan.nextLine();
			if  (s.isEmpty()) break;
			//if (s.equals(""))
			//if (s.length() == 0)
			
			bw.write(s);
			bw.newLine();//한칸 내림
		}
			
		
		
		
		bw.close(); //flush를 포함 연결하고 끊어줌

	//	System.out.println(File.pathSeparator); //경로 여러개적을때 세미콜론으로 구분 윈도우따라 다름
	//	System.out.println(File.separator);
		
		
		
		
		
		
		
		
		
		
	}

}
