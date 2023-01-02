package Method;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		double avg = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("정수입력");
			list.add(scan.nextInt());
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("배열["+i+"] : "+list.get(i));
		}
		System.out.println();
//		for (int i = 0; i < list.size(); i++) {
//			avg += list.get(1);
//		}
		
		for (int n : list) { //향상된 포문(읽기전용포문)
			avg += n;
		}
		avg /= list.size();
		
		System.out.println("평균 : " + avg);
		
		System.out.print("평균과 10 이상 차이나는 수 : ");
		
		for (int n : list) {
			//if(avg + n <= 10||avg - n >= 10) {
			if(Math.abs(avg - n) >= 10) { //abs는 절대값
				System.out.print(n + " ");
			}
				
		}
		
		
		
		
		
		
		
		
	}

}
