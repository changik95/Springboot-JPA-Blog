package io;

import static java.lang.System.in;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

//String ������ ���ڿ� ���
//try catch���� ȣ���Ѱ����� ���ѱ��
public class IOTest7 {

	public static void main(String[] args) throws Exception{ //�ֻ����� ���� ��翹�� �� ó����
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
			bw.newLine();//��ĭ ����
		}
			
		
		
		
		bw.close(); //flush�� ���� �����ϰ� ������

	//	System.out.println(File.pathSeparator); //��� ������������ �����ݷ����� ���� ��������� �ٸ�
	//	System.out.println(File.separator);
		
		
		
		
		
		
		
		
		
		
	}

}
