package ArraySolt;
//��Ʈ 10ĭ�迭��
//���� ���� �־��ְ�
//���簪���
//����ҵ����հ����
import java.util.Scanner;
public class ArrayTest4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A[] = new int[10];
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			A[i]=(int)(Math.random() * 10) + 1;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(A[i]+",");
		}
		System.out.println();
			
		for(int i = 0; i < 10; i++) {
			sum = sum + A[i];
		}
		
		int s,max,min;
		
		
		
		s = 0;
		max = A[0];
		min = A[0];
		double avg;
		
		for (int i = 0; i < A.length; i++) {
			s += A[i];
			max = A[i] > max ? A[i] : max;
			min = A[i] < min ? A[i] : min;
		}
		avg = (double)sum / A.length;
		
		System.out.println("�հ�:" + sum);
		System.out.println("���:" + avg);
		System.out.println("�ִ밪:" + max);
		System.out.println("�ּҰ�:" + min);
		
		
		
		
	}

}
