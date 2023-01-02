package Method;

import java.util.Scanner;

public class Test_0428 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a[] = new int[10];
		int sum = 0;
		double avg;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("정수를 입력하세요"); //정수 입력
			a[i] = scan.nextInt();
			sum = sum + a[i];
		}
		avg = (double)sum / 10;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("배열["+i+"] : " + a[i]);  // 배열 출력 
		}
		
		System.out.println("평균 : " + avg); //평균값 계산
		System.out.print("평균과 10 이상 차이나는 수 :");
		
		for(int i = 0; i < 10; i++) {
			if(avg + 10 <= a[i]) {
				System.out.print(a[i]+" ");  //차 계산
			}
			else if(avg - 10 >= a[i]) {
				System.out.print(a[i]+" "); //차 계산
			}
		}
			
				
		
		
		
		
	}

}
