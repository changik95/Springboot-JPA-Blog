package io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String path = null; 	//��� �Է¹��� ����
		File file = null; 		//�Է¹��� ��η� ���� ��ü ����
		String filenames[]; 	//�迭 ��ȯ
		File files[];
		//��θ� �Է¹޴´�. (��: C:\Java)
		System.out.print("����Է�:");
		 path = scan.nextLine();
		 
		//������ �ִ� ������� Ȯ���ϰ� ������ ���α׷� ����
		 file = new File(path);
		 if(!file.isDirectory()) {
			 System.out.println("��� ����");
			 return;
		 }
		 filenames = file.list();   //File ��ü�� ����Ű�� ����� ���� ���
			
		 
		 //����� ������ ������ ����� ȭ�鿡 ���
		 for (String s : filenames) {
			 System.out.println(s);
		 }
		
		 files = file.listFiles();
		 for (File f : files) {
			 System.out.println(f.getName() + " " + f.length() + " bytes");
		 }
		
		
		
		
		
		
		
	}

}
