package Method;

import java.util.Scanner;

public class Test_0428 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a[] = new int[10];
		int sum = 0;
		double avg;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("������ �Է��ϼ���"); //���� �Է�
			a[i] = scan.nextInt();
			sum = sum + a[i];
		}
		avg = (double)sum / 10;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("�迭["+i+"] : " + a[i]);  // �迭 ��� 
		}
		
		System.out.println("��� : " + avg); //��հ� ���
		System.out.print("��հ� 10 �̻� ���̳��� �� :");
		
		for(int i = 0; i < 10; i++) {
			if(avg + 10 <= a[i]) {
				System.out.print(a[i]+" ");  //�� ���
			}
			else if(avg - 10 >= a[i]) {
				System.out.print(a[i]+" "); //�� ���
			}
		}
			
				
		
		
		
		
	}

}
