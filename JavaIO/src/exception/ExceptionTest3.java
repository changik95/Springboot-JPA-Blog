package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[10];
		int sum = 0;
		
		System.out.println("������ �Է��ϼ���.");
		for(int i = 0; i < a.length; i++){
			try {
				a[i] = scan.nextInt();
				sum = sum + a[i];
			}
			catch (InputMismatchException ex) {
				scan.nextLine();
				i -= 1;
			}
		}
		System.out.println("�հ�� : " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}




/* ����1
 * �������Է��ϼ���. ����10���� �հ�
 * ����� �ԷµȰ� �� 10��������
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */














