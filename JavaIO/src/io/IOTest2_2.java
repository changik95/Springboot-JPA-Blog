package io;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest2_2 {

	public static void main(String[] args) {
		FileReader in = null;
		int ch;
		
		//��Ʈ�� ����
		try {
		in = new FileReader("C:\\abc3\\workspace\\javaO\\src\\exception\\ExceptionTest1.java");
		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
			return;
		}
		
		//�б�
		try {
			while((ch = in.read()) != -1) {
			System.out.print((char)ch);
			}
		} catch (IOException e) {
			System.out.println("�б� ����");
			return;
		}
		//��Ʈ�� �ݱ�
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
