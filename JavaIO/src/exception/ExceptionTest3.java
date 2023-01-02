package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[10];
		int sum = 0;
		
		System.out.println("정수를 입력하세요.");
		for(int i = 0; i < a.length; i++){
			try {
				a[i] = scan.nextInt();
				sum = sum + a[i];
			}
			catch (InputMismatchException ex) {
				scan.nextLine();
				i -= 1;
			}
		}
		System.out.println("합계는 : " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}




/* 문제1
 * 정수를입력하세요. 정수10개의 합계
 * 제대로 입력된게 총 10개여야함
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */














