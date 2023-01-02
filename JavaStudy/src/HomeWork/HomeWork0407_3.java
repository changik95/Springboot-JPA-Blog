package HomeWork;
/*
 정수 2개와 연산자를 입력받아 계산결과를 출력한다.
 실행 ex : 정수 1: 10
 		 정수 2: 5
 		 연산자 (+, -, /, *) : /
 결과는	 10 / 5 = 2 이렇게 나오면 됨   스위치 문으로 
 switch(s) {
 	case "+":
 	case "-":
 	case "/":
 	case "*":
 
 */
import java.util.Scanner;
public class HomeWork0407_3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a,b,c;
		String d;
		
		System.out.println("정수를 입력하세요.");
		a = scan.nextInt();
		System.out.println("정수를 입력하세요.");
		b = scan.nextInt();
		System.out.println("연산자를 정하십시오. +  -  *  /");
		d = scan.next();
		
		switch(d) {
		case "+" :
			System.out.println("a + b = " + (a + b) );
			break;
		case "-" :
			System.out.println("a - b = " + (a - b) );
			break;
		case "*":
			System.out.println("a * b = " + (a * b) );
			break;
		case "/":
			System.out.println("a / b = " + (a / b) );
			break;
		default:
			System.out.println("입력 오류입니다.");
			break;
		}
	}

}
