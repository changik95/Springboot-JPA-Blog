package ArraySolt;


// 1+2+3+4+5=15
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[] = new int[5];
		
		//�Է¹��� ������ �迭�� ����
		for (int i = 0; i < num.length; i++) {
			System.out.print("�����Է�:");
			num[i] = scan.nextInt();
		}
			
		//�迭 ���� ��� ���� �հ�
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		
		
		//�迭�� ��� ������ ���
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"+");
		}
				
			
		
		System.out.print("=" + sum);
		
	}

}
