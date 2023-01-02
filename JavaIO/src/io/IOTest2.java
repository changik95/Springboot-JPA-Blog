package io;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest2 {

	public static void main(String[] args) {
		FileReader in = null;
		BufferedReader br = null; //���ϸ����� ������µ� �߰��� ���۸� ����ϰ� int -> string���ιٲ�
		//���۴� ä�ð����� ���鶧 ����ϸ�����
		String ch;
		
		//��Ʈ�� ����
		try {
			in = new FileReader("C:\\abc3\\workspace\\JavaIO\\src\\exception\\ExceptionTest1.java");
			br = new BufferedReader(in); //����߰�
		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
			return;
		}
		
		//�б�
		try {
			while((ch = br.readLine()) != null) {
			System.out.println(ch); //readLine�� ����Ű������ �о���ϱ� ln���� �ؾ���
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
