package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int sum = 0;
		
		System.out.println("������ �Է��ϼ���.");
			try {
				while(true) {
					a = scan.nextInt();
					sum += a;
				}
			}
			catch (InputMismatchException ex) {
				System.out.println("���α׷��� �����մϴ�");
			}
		System.out.println("�հ�� : " + sum);
		
		
		
		
		
	}

}



/* ����2
 *  ������ �Է��ϼ���.(���� �������� ����)
 * 1
 * 2
 * 3
 * 4
 * 5
 * ----- ���� �ƴѰ� ���ý� ������ �հ賿
 * 15
 * 
 * 
 * 
 */




