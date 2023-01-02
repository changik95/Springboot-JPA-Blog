package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int sum = 0;
		
		System.out.println("정수를 입력하세요.");
			try {
				while(true) {
					a = scan.nextInt();
					sum += a;
				}
			}
			catch (InputMismatchException ex) {
				System.out.println("프로그램을 종료합니다");
			}
		System.out.println("합계는 : " + sum);
		
		
		
		
		
	}

}



/* 문제2
 *  정수를 입력하세요.(개수 지정되지 않음)
 * 1
 * 2
 * 3
 * 4
 * 5
 * ----- 숫자 아닌게 들어올시 끝나고 합계냄
 * 15
 * 
 * 
 * 
 */




