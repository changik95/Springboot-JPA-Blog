package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//���� 2���� �Է¹޾� ����Ͽ� ����� ���

public class ExceptionTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c = 0;
		
			System.out.println("������ �Է��ϼ���.");
		while(true) {
			try {
				a = scan.nextInt();
				break;
			}
			catch (InputMismatchException ex) {
				System.out.println("�ٽ� �Է��ϼ���.");
				scan.nextLine(); //���� �ݺ�����
				//continue; ������ ����
			}
		}
			
			
			System.out.println("������ �Է��ϼ���.");
		while(true) {
			try {
				b = scan.nextInt();
				break;
			}
			catch (InputMismatchException ex) {
				System.out.println("�ٽ� �Է��ϼ���.");
				scan.nextLine(); //���� �ݺ�����
				//continue; ������ ����
			}
		}
		
		try {
			c = a / b;
		}
		catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			c = 0;
		}
		System.out.println("����� : " + c);
		
		
		
	
	
	
	}

}
