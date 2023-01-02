package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOTest8 {

	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		BufferedWriter bw = null;
		FileWriter bs = null;
		String chat;
		String a = null;
		String Y = "Y";
		String N = "N";
		bw = new BufferedWriter(new FileWriter("string.txt"));
		FileInputStream in = null;
		FileOutputStream out = null;
		File infile = null;
		File outfile = null;
		String inName = null;
		String outName = null;
		int n;
	while(true) {
			System.out.print("���ڸ� �Է����ּ���");
		for(int i = 1; i < 100; i++ ) {
			chat = scan.nextLine();
			bw.write (i+": "+chat+"\n");
			System.out.println(i+": " + chat);
			if(chat.isEmpty()) {
				bw.close();
				break;
			}
		}
		while (true) {
			System.out.println("�ӽ� ���ϸ��� �Է����ּ���");
			inName = scan.nextLine();
			infile = new File(inName);
			if (infile.isFile()) break;
			System.out.println("������ �����ϴ�");
		}
		while(true) {
			System.out.println("������ �����Ͻðڽ��ϱ�? (Y/N)");
			a = scan.nextLine();
			if(a.equals(Y)) {//if1
				System.out.println("������ ���ϸ��� �Է����ּ���");
				outName = scan.nextLine();
				outfile = new File(outName);
				if (outfile.isFile() == true) {//if2
					System.out.println("�̹� ������� ���ϸ� �Դϴ�. ����ðڽ��ϱ�?(Y/N)");
					a = scan.nextLine();
					if(a.equals(Y)) {
						try{
							in = new FileInputStream(infile);
							out = new FileOutputStream(outfile); //���⼭ ������ ����
							
							while ((n = in.read()) != -1) { //1����Ʈ�� ����
								out.write(n); //�������� ��� out���� �־���
							}
							//��Ʈ�� �ݱ�, �����Ǿ����ϴ�(�޼������)
							in.close();
							out.close();
							System.out.println(outName + "������ �����Ǿ����ϴ�.");
						} catch (IOException e) {
							e.printStackTrace();
						}
						break;
					}
					else if(a.equals(N)){
						System.out.println("������ ����ϼ̽��ϴ�."); 
						break;
					}
					else{
						System.out.println("�߸� �Է��ϼ̽��ϴ� �ٽ� �Է��ϼ���.");
						continue;
					}
				}//if2
			
				}//if1
			else if(a.equals(N)){
				System.out.println("������ ����ϼ̽��ϴ�."); 
				break;
			}
			else{
				System.out.println("�߸� �Է��ϼ̽��ϴ� �ٽ� �Է��ϼ���.");
				continue;
			}
		
		
		}//while2���� ��
		
		
		
		break;
	}//ù while��
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
