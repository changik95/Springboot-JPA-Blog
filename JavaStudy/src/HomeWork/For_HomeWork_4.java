package HomeWork;
/* ���� 10���� �Է¹޾� �հ� ���ϱ� 
 * ��)1,1,1,1,1,1,1,1,1,1 = �հ�� 10�Դϴ�
 * 
 */
import java.util.Scanner;
public class For_HomeWork_4 {

	public static void main(String[] args) { //Ŭ����
		Scanner scan = new Scanner(System.in); //�޼ҵ�
		int a = 0, sum = 0; //����
		

		for (int b = 0; b < 10; b++) {
			System.out.println("������ �Է��ϼ���.");
			a = scan.nextInt();
			sum += a;
		
		}
		System.out.println("�հ�� : " + sum);
						
		
			
		
		
	}

}
