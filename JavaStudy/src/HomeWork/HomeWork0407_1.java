package HomeWork;
/* �����ڿ���
 ��ǰ������ �Է¹޾� 5������, 1������, 5õ����, õ����,5�����,100�������� ���� ���徿 �ʿ����� �ּҰ����� ���Ѵ�.
 ���� ex :
 ��ǰ���� : 67500 ����
 �� �Է°� ����ϰ� �ϸ� ��.
 5�� 1 ,���� 1, 5õ�� 1, 1õ��2,500�� 1,100�� 0
 
 */
import java.util.Scanner;

public class HomeWork0407_1 {
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);	
		int a,b,c,d,e,f,g;
		//a 5��, b 1��, c 5õ, d 1õ, e 500��,f 100��
		
		System.out.println("������ �Է��ϼ���");
		g = scan.nextInt();
		
		f = g;
		a = f / 50000;
		f = f % 50000;
		
		b = f / 10000;
		f = f % 10000;
		
		c = f / 5000;
		f = f % 5000;
		
		d = f / 1000;
		f = f % 1000;
		
		e = f / 500;
		f = f % 500;
		
		System.out.println("ȯ���� �ݾ� : " + g +"��");
		System.out.println("5������ " + a + "��");
		System.out.println("1������" + b + "��");
		System.out.println("5õ����" + c + "��");
		System.out.println("1õ����" + d + "��");
		System.out.println("500����" + e + "��");
		System.out.println("100����" + f + "��");
		
		
	
	}

}
