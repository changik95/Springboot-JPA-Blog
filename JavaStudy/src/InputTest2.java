import java.util.Scanner;		//Scanner Ŭ������ ����ϱ� ����

public class InputTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // Scanner ��ü ����
		
		int a, b, c; //��������
		
		System.out.print("��ǰ�ݾ�:");
		a = scan.nextInt();					//Scanner ��ü�� �̿��� ������ �����Է¹޾� ����
		System.out.print("�����ݾ�:");
		b = scan.nextInt();					//Scanner ��ü�� �̿��� ������ �����Է¹޾� ����
		
		c = b - a;	// ���
		System.out.println(" �Ž������� " + c);	// ��� ���

		
		
		
		
		
	}

}




