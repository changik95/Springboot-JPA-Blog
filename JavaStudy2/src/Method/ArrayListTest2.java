package Method;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		double avg = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("�����Է�");
			list.add(scan.nextInt());
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("�迭["+i+"] : "+list.get(i));
		}
		System.out.println();
//		for (int i = 0; i < list.size(); i++) {
//			avg += list.get(1);
//		}
		
		for (int n : list) { //���� ����(�б���������)
			avg += n;
		}
		avg /= list.size();
		
		System.out.println("��� : " + avg);
		
		System.out.print("��հ� 10 �̻� ���̳��� �� : ");
		
		for (int n : list) {
			//if(avg + n <= 10||avg - n >= 10) {
			if(Math.abs(avg - n) >= 10) { //abs�� ���밪
				System.out.print(n + " ");
			}
				
		}
		
		
		
		
		
		
		
		
	}

}
