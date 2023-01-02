package HomeWork;
/* 연산자연습
 상품가격을 입력받아 5만원권, 1만원권, 5천원권, 천원권,5백원권,100원권으로 각각 몇장씩 필요한지 최소개수를 구한다.
 실행 ex :
 상품가격 : 67500 엔터
 초 입력과 비슷하게 하면 됌.
 5만 1 ,만원 1, 5천원 1, 1천원2,500원 1,100원 0
 
 */
import java.util.Scanner;

public class HomeWork0407_1 {
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);	
		int a,b,c,d,e,f,g;
		//a 5만, b 1만, c 5천, d 1천, e 500원,f 100원
		
		System.out.println("가격을 입력하세요");
		g = scan.nextInt();
		
		f = g;
		a = f / 50000;
		f = f % 50000;
		
		b = f / 10000;
		f = f % 10000;
		
		c = f / 5000;
		f = f % 5000;
		
		d = f / 1000;
		f = f % 1000;
		
		e = f / 500;
		f = f % 500;
		
		System.out.println("환전할 금액 : " + g +"원");
		System.out.println("5만원권 " + a + "장");
		System.out.println("1만원권" + b + "장");
		System.out.println("5천원권" + c + "장");
		System.out.println("1천원권" + d + "장");
		System.out.println("500원권" + e + "개");
		System.out.println("100원권" + f + "개");
		
		
	
	}

}
