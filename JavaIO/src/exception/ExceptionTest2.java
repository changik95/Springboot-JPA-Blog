package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//정수 2개를 입력받아 계산하여 결과를 출력

public class ExceptionTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c = 0;
		
			System.out.println("정수를 입력하세요.");
		while(true) {
			try {
				a = scan.nextInt();
				break;
			}
			catch (InputMismatchException ex) {
				System.out.println("다시 입력하세요.");
				scan.nextLine(); //무한 반복방지
				//continue; 있으나 마나
			}
		}
			
			
			System.out.println("정수를 입력하세요.");
		while(true) {
			try {
				b = scan.nextInt();
				break;
			}
			catch (InputMismatchException ex) {
				System.out.println("다시 입력하세요.");
				scan.nextLine(); //무한 반복방지
				//continue; 있으나 마나
			}
		}
		
		try {
			c = a / b;
		}
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			c = 0;
		}
		System.out.println("결과는 : " + c);
		
		
		
	
	
	
	}

}
