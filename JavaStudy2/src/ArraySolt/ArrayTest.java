package ArraySolt;
import java.util.Scanner;
/*
 * �迭���Ұ��� : 4
 * 
 * ���� 1�Է�:
 * ���� 1�Է�:
 * ���� 1�Է�:
 * ���� 1�Է�:
 * 1+2+3+4=10 
 * 
 */

public class ArrayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num[];
		int sum = 0;
		int a;
		
//		System.out.print("�迭 ���� ����:");
//		a = scan.nextInt();
//		num = new int[a];
//		
//		
//		for(int i = 0; i < num.length; i++) {
//			System.out.print("�����Է�:");
//			num[i] = scan.nextInt();
//		}
//		for(int i = 0; i <= num.length; i++) {
//				sum = sum + i;
//		}
//	
//		for(int i = 0; i < num.length; i++) {
//				System.out.print(num[i]);
//				System.out.print(i < num.length-1?"+":"=");
//		}
//	
//			System.out.print(sum);
//				
		int[] array = {1,2,3,4,5};
		
		for (Integer i : array) { //foreach
			System.out.println(i);
		}
				
	}

}
