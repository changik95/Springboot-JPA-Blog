package HomeWork;
import java.util.Scanner;
public class Homework0406_2 {

	public static void main(String[] args) {
		
		/*if�� ����
		 �¾ �ظ� �Է¹޴´�. if������
		 �츦 ����Ѵ�
		 �¾ �� : 2000
		 ����Դϴ�. 
		 */
		Scanner scan = new Scanner(System.in);
		int y;
		
		System.out.print("������ �Է��ϼ���.");
		y = scan.nextInt();
		
		if(y % 12 == 4 ) {
		System.out.println("��");
	    }

		else if(y % 12 == 5) {
			System.out.println("��");
		}
		else if(y % 12 == 6 ) {
			System.out.println("ȣ����");
		}
		else if(y % 12 == 7) {
			System.out.println("�䳢");
		}
		else if(y % 12 == 8) {
			System.out.println("��");
		}
		else if(y % 12 == 9) {
			System.out.println("��");
		}
		else if(y % 12 == 10) {
			System.out.println("��");
		}
		else if(y % 12 == 11) {
			System.out.println("��");
		}
		else if(y % 12 == 0) {
			System.out.println("������");
		}
		else if(y % 12 == 1) {
			System.out.println("��");
		}
		else if(y % 12 == 2) {
			System.out.println("��");
		}
		else {
			System.out.println("����");
		}
	}

		
}
