package Method;

import java.util.Scanner;

public class Test_0428_3 {

	public static void main(String[] args) {	//������ �̹� ���������� �����̶� �Ȱ��� ����� ����ϴ°���, �ƴϸ� �ٸ� ������ ������ �Է��ص� �۵��ϴ� 
		Scanner scan = new Scanner(System.in);	//���α׷��� ¥�°��� �� ���� �ΰ� ��������ϴ� 0428_3(�����̶��Ȱ���) , 0428_3_2(���α׷�) �̷��� �� 2���Դϴ�
		int a,c,d;
		String b;

		System.out.print("�Է��� ���� (2/8/10/16) : ");
		a = scan.nextInt();		
		if(a != 2 && a != 8 && a != 10 && a != 16) {
			System.out.print("Input error.");
			return;
		}
		System.out.print("���� �Է� (2����) : " +"\n");
		b = scan.next();
		System.out.print("��ȯ�� ���� (2/8/10/16) : ");
		c = scan.nextInt();		

		System.out.print(b+"(2) -> ");
		
		System.out.print(Integer.parseInt(b,2)+"(10) -> ");
		
		d = Integer.parseInt(b,2);
		
		System.out.print(Integer.toHexString(d)+"(16)");			
			
			
		
	}
}