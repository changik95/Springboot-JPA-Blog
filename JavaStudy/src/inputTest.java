//Ű����� �Է¹޾� ����ϴ� ����

import java.util.Scanner;		//Scanner Ŭ������ ����ϱ� ����

public class inputTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // Scanner ��ü ����
		
		int a, b, c;
		
		System.out.print("�����Է�:");
		a = scan.nextInt();					//Scanner ��ü�� �̿��� �����Է¹���
		System.out.print("�����Է�:");
		b = scan.nextInt();
		
		c = a + b;
		System.out.println("�հ�� " + c);
	
	}

}
