package exception;

import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = null;
		int n = 0;
		String ar[] = new String[3];
		
		try {
			System.out.print("�����Է�:");
			s = scan.next();
			n = Integer.parseInt(s);
			ar[0] = s;
			System.out.println("�Է¹��� ��: "+ n);
		}	
		catch (NumberFormatException e) {
			System.out.println("������ �Է��ϼ���.");
			//return;
			System.exit(0);
		} // Ʈ���̰� ���ΰ� ĳġ�� �޾��� ĳġ�� ������ �޾Ƶ���
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ������ �Ѿ����ϴ�.");
		}
		finally { //���� ���� �־ ������ �����
			System.out.println("finally");
		}
		
		
		System.out.println("���α׷��� ��");
		
		
		
	}

}
