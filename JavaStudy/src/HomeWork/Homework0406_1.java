package HomeWork;
import java.util.Scanner;
public class Homework0406_1 {

	public static void main(String[] args) {
		/* �ʸ� �Է¹���. int 
		60�ʸ� �Է¹����� 1��  60���� ������ 0
		��ð� ��� �������� ����Ͽ� ���
		�� �Է� : 3672
		1�ð� 1�� 12��
		��������ڸ� �̿��ϼ��� / %�����ڰ� ��������
		ū���� -> �������� / ������ �ʴ�?
			*/
/*		Scanner scan = new Scanner(System.in);
		int a,b,c;
		int t;
		System.out.print("�ʸ� �Է��ϼ���.");
		t = scan.nextInt();
		
		a = t / 3600;
		t = t / 3600;
		b = t / 60;
		t = t / 60;
		c = t / 1;
		System.out.print(a + "��" + b + "��" + c + "��");
		
*/
		
	Scanner scan = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("�ʸ� �Է��ϼ���.");
		a = scan.nextInt();

	
		b = a % 3600;
		c = b % 60;
		a = a / 3600;
		b = b / 60;
		c = c / 1;
		System.out.print(a + "��" + b + "��" + c + "��");
/*		Scanner scan = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("�ʸ� �Է��ϼ���.");
		c = scan.nextInt();
		
		a = c / 3600;
		c = c % 3600;
		
		b = c / 60;
		c = c % 60;
		
		System.out.println(a + "��" + b + "��" + c + "��");
	
	*/	
		
		
	}

}
