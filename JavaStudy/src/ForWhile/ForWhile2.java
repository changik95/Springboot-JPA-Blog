package ForWhile;
import java.util.Scanner;
public class ForWhile2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		int sum = 0;
//���� 2���� �Է¹޾� �� ������ ��� ���� �հ�
	
		System.out.println("������ �Է��ϼ���");
		a = scan.nextInt();
		System.out.println("������ �Է��ϼ���");
		b = scan.nextInt();
		
/*		if(a < b) {
			
		while (a <= b) {
			sum = sum + a;
			a++;
		}
		}
		else if(a > b) {
			while(a >=b) {
			sum = sum + a;
			a--;
			}
		}
		System.out.println("�հ�� : "+sum);
	*/	
		sum = 0;

		if (a < b) {
			do {
				sum = sum + a;
				a++;
			}while(a <= b);
		}
		else if(a > b) {
			do {
				sum = sum + a;
				a--;
			}while(a >= b);
		}
		
		
	System.out.println("�հ�� : "+sum);

	}

}