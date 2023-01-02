package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

//문자단위의 출력
public class IOTest4 {

	public static void main(String[] args) {
		int a = 100; //메모장은 숫자는 다 특정 문자값이라 생각함.
		char b = 'B';
		char c = '거'; // 가가 엄청 뒷 숫자라 표현못함
		
		FileWriter out = null;
		
		try {
			out = new FileWriter("d.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			out.write(a);
			out.write(b);
			out.write(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			out.close();
		} catch (IOException e ) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
