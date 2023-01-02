package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest1 {

	public static void main(String[] args) { //��ȣ�� �ϳ��� ���� ����, Ŭ���� �޼ҵ� Ʈ����ĳġ ���
//��Ʈ�� ��ü ����, �ʿ��Ѱ� �аų� ���� �������� �� �ݱ�.
		FileReader in = null;  //���� ������ ����, �ڹ����α׷��� �ʱ�ȭ �������� ���� ���Ұ�.
		int ch;
		
		// ��Ʈ�� ����
		try {
			in = new FileReader("C:\\abc3\\workspace\\JavaIO\\src\\io\\FileTest.java");
		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
			return;
		}
		
		// �б�
		try {
			while((ch = in.read()) != -1) { // read �ѱ��ھ� �о�ͼ� ����
				System.out.print((char)ch);
			}
				
		} catch (IOException e) {
			System.out.println("�б� ����");
			return;
		}
		
		// ��Ʈ�� �ݱ�
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
