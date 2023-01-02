package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOTest8_2 {

	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		BufferedWriter out = null;
		String filename = null;
		File file = null;
		int lineNum = 0;
		String line = null;
		String text = null;
		String yn = null;
		
		System.out.println("������ �Է��ϼ���. ����� ù ĭ���� enter.");
		text = "";
		while (true) {
			System.out.print(++lineNum + ": ");
			line = scan.nextLine();
			if (line.equals("")) break;
			text += line;
			text += "\n";
		}
	
		System.out.print("�����Ͻðڽ��ϱ�(y/n)");
		yn = scan.nextLine();
		if (yn.equalsIgnoreCase("n")) return;
		
		while (true) {
			System.out.print("������ ���ϸ� : ");
			filename = scan.nextLine();
			file = new File(filename);
			if (!file.isFile()) break;
			System.out.print("�̹� ������� �����Դϴ�. ����ðڽ��ϱ�? (y/n)");
			yn = scan.nextLine();
			if (yn.equalsIgnoreCase("y")) break;
		}
		
		try {
			out = new BufferedWriter(new FileWriter(file));
			out.write(text);
			out.close();
		} catch  (IOException e) {
			e.printStackTrace();
		}
		System.out.println(filename + "������ ����Ǿ����ϴ�.");
	
	
	
	
	}//����

}
	
				
			
		
	
	
	
	
	


/*-----------------------------------------------
 * ������ �Է��ϼ���. ����� ù ĭ���� enter.
 * 1: �ȳ��ϼ��� ( �ݺ������� �ϸ��, ���ȣ ��ӹٲ�����)
 * 2: abcde
 * 3: 12345
 * 4: 
 * 
 * �����Ͻðڽ��ϱ�? *(y/n) n �Է½� ���ϻ��� y�� ���ϸ����� �Ѿ
 * 
 * ������ ���ϸ� : a.txt
 * �̹� ������� ���ϸ��Դϴ�. ����ðڽ��ϱ�? (Y/N) �� �Է� n�� 
 * ������ ���ϸ� : b.txt
 * �̹� ������� ���ϸ��Դϴ�. ����ðڽ��ϱ�? (Y/N) �� �Է� y��
 * b.txt ������ ����Ǿ����ϴ�. 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */ 
