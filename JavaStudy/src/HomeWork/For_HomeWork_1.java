package HomeWork;
//���� 2���� �Է¹޾� �� ������ ��� ���� �հ�
// ex ) 1�� 5 �Է��ϸ� �հ� 15�� ���;��� 1�̸������� 5���������� �����ؾ���
// ex2) 10�� 5�� �Է��ϸ� �հ� 45�� ���;���
import java.util.Scanner;
public class For_HomeWork_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		int sum = 0;
		System.out.println("������ �Է��ϼ���");
		a = scan.nextInt();
		System.out.println("������ �Է��ϼ���");
		b = scan.nextInt();
		//a , b�� ��ĳ�ʿ� �Է��� ����  , c�� ���� ���� a���� �־��ֱ� ���� ����   
			c = a;
			if(c < b) {
				for (c = a; c <= b; c++) {  
					sum = sum + c;
				}
				System.out.println("�հ�� : " +sum);
			}	
			
				else if(c > b) {
					for (c = a; c >= b; c--) {
					sum = sum + c;	
					}
				}	
				else if(c == b) {
						System.out.println("�Է��Ͻ� ������ �����մϴ�. ");
					}
			System.out.println("�հ�� : " +sum);
			
			/*
			 *	int a, b, min, max, sum, i,; 
			 * 
			 * System.out.print("�����Է�:");
			 * a = scan.nextInt();
			 * System.out.print("�����Է�:");
			 * b = scan.nextInt();
			 * 
			 * sum = 0;
			 * min = (a > b) ? b : a;
			 * max = (a > b) ? a : b;
			 * 
			 * for(i = min; i<= max; i++){
			 * 		sum += i;
			 * }
			//System.out.println("���� 1 :" + a);
			//System.out.println("���� 2 :" + b);
			//System.out.println("���� 3 :" + sum);
			 *
			 */
			
		
		
	}
		
}
				
		
	

