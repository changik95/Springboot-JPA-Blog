package Method;

import java.util.Scanner;

public class Test_0428_3_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,c,d;
		String b;

		System.out.print("�Է��� ���� (2/8/10/16) : "); //�����Է� ������ a
		a = scan.nextInt();		
		if(a != 2 & a != 8 & a != 10 & a != 16) {
			System.out.print("Input error.");
			return;
		}
		
		
		System.out.print("���� �Է� ("+ a +"����)"+ " : " + "\n"); //�����Է� ������ b
		b = scan.next();
		
		if(a == 2) {
			if(b == "0" && b == "1") {
			}
			else {
				System.out.println("2������ ���� 0�� 1�� �������ּ���");
				return;
			}
		}
		
		System.out.print("��ȯ�� ���� (2/8/10/16) : "); //������ȯ ������ c
		c = scan.nextInt();		

		System.out.print(b+"("+ a+")"+ "-> ");
		
			
		
		
		//��ȯ �ߺ��� ����
			if(a == 2 && c == 2) {
				System.out.println("��ȯ �� �ʿ䰡 �����ϴ�.");
				return;
			}
			if(a == 8 && c == 8) {
				System.out.println("��ȯ �� �ʿ䰡 �����ϴ�.");
				return;
			}
			if(a == 10 && c == 10) {
				System.out.println("��ȯ �� �ʿ䰡 �����ϴ�.");
				return;
			}
			if(a == 16 && c == 16) {
				System.out.println("��ȯ �� �ʿ䰡 �����ϴ�.");
				return;
			}

			
			//2���� ��ŸƮ -> ��ȯ
			
			if(a == 2 && c == 8) {
				System.out.print(Integer.parseInt(b,2)+"(10) -> ");
				d = Integer.parseInt(b,2);
				System.out.print(Integer.toOctalString(d)+"(8)");			
			}
			
			if(a == 2 && c == 10) {
				System.out.print(Integer.parseInt(b,2)+"(10)");
			}
			
			if(a == 2 && c == 16) {
				System.out.print(Integer.parseInt(b,2)+"(10) -> ");
				d = Integer.parseInt(b,16);
				System.out.print(Integer.toHexString(d)+"(16)");			
			}
				
			
			// 8���� ��ŸƮ -> ��ȯ
			if (a == 8 && c == 2) {
				System.out.print(Integer.parseInt(b,8)+"(10) -> ");
				d = Integer.parseInt(b,8);
				System.out.print(Integer.toBinaryString(d)+"(2)");
			}
			if (a == 8 && c == 10) {
				System.out.print(Integer.parseInt(b,8)+"(10)");
			}
			if (a == 8 && c == 16) {
				System.out.print(Integer.parseInt(b,8)+"(10) -> ");
				d = Integer.parseInt(b,8);
				System.out.print(Integer.toHexString(d)+"(16)");
			}
			
			// 10���� ��ŸƮ -> ��ȯ
			if (a == 10 && c == 2) {
				d = Integer.parseInt(b,10);
				System.out.print(Integer.toBinaryString(d) +"(2)");
			}
			if (a == 10 && c == 8) {
				d = Integer.parseInt(b,10);
				System.out.print(Integer.toOctalString(d) +"(8)");
			}
			if (a == 10 && c == 16) {
				d = Integer.parseInt(b,10);
				System.out.print(Integer.toHexString(d) +"(16)");
			}
			
			// 16���� ��ŸƮ -> ��ȯ
		
			if (a == 16 && c == 2) {
				System.out.print(Integer.parseInt(b,16)+"(10) -> ");
				d = Integer.parseInt(b,16);
				System.out.print(Integer.toBinaryString(d) +"(2)");
			}
			
			if (a == 16 && c == 8) {
				System.out.print(Integer.parseInt(b,16)+"(10) -> ");
				d = Integer.parseInt(b,16);
				System.out.print(Integer.toOctalString(d) +"(8)");
			}
			
			if (a == 16 && c == 10) {
				System.out.print(Integer.parseInt(b,16)+"(10)");
			}
			
			
			
			
		
	}
}