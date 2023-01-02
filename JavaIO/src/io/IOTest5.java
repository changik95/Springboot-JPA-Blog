package io;

// buffer ����� ��Ƽ� �Ѳ����� �����

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IOTest5 {

	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		String inName = null;
		String outName = null;
		int n;
		File infile = null;
		File outfile = null;
		Scanner scan = new Scanner(System.in);
		
		//���� ���ϸ��� �Է¹޴´�.
		while (true) {
			System.out.println("���ϸ��� �Է����ּ���");
			inName = scan.nextLine();
			infile = new File(inName);
			if (infile.isFile()) break;
			System.out.println("������ �����ϴ�");
		}
		//�纻 ���ϸ��� �Է¹޴´�. ���� -> �纻 
		//�ٸ� ������ ������� �̸��̸� �ٽ� �Է¹޴´�.
		while (true) {
			System.out.println("������ ���ϸ��� �Է����ּ���");
			outName = scan.nextLine();
			outfile = new File(outName);
			if (!outfile.isFile()) break;
			System.out.println("�ߺ��� ���ϸ��Դϴ�.");
		}
		//���� ���� (�������κ��� 1����Ʈ �о �纻���� 1����Ʈ ����)
		try{
			in = new FileInputStream(infile);
			out = new FileOutputStream(outfile); //���⼭ ������ ����
			
			while ((n = in.read()) != -1) { //1����Ʈ�� ����
				out.write(n); //�������� ��� out���� �־���
				
			}
			//��Ʈ�� �ݱ�, ����Ǿ����ϴ�(�޼������)
			in.close(); 
			out.close();
			System.out.println(inName + " -> " + outName + "������ ����Ǿ����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
