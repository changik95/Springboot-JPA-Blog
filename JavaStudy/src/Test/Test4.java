package Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		BufferedWriter bw = null;
		String s = null;
		String yn = null;
		bw = new BufferedWriter(new FileWriter("text.txt"));
		
		while (true) {
			System.out.print("���ڿ� �Է� : ");
			s = scan.nextLine();
			bw.write(s);
			bw.newLine();//��ĭ ����
			System.out.print("��� �Է��Ͻðڽ��ϱ�? (y/n) ");
			yn = scan.nextLine();
			if (yn.equalsIgnoreCase("y")) {
				continue;
			}
			else if(yn.equalsIgnoreCase("n")) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}
			
		bw.close();
		
		
		
	}

}
