package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

//���ڴ����� ���
public class IOTest4 {

	public static void main(String[] args) {
		int a = 100; //�޸����� ���ڴ� �� Ư�� ���ڰ��̶� ������.
		char b = 'B';
		char c = '��'; // ���� ��û �� ���ڶ� ǥ������
		
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
