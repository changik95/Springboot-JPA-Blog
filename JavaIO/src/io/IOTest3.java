package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//byte������ ���
public class IOTest3 {

	public static void main(String[] args) {
		int a = 100; //�޸����� ���ڴ� �� Ư�� ���ڰ��̶� ������.
		char b = 'B';
		char c = '��'; // ���� ��û �� ���ڶ� ǥ������
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream("d.txt");
		} catch (FileNotFoundException e) {
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
