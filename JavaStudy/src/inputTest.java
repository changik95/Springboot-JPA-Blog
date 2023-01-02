//키보드로 입력받아 계산하는 예제

import java.util.Scanner;		//Scanner 클래스를 사용하기 위해

public class inputTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // Scanner 객체 생성
		
		int a, b, c;
		
		System.out.print("정수입력:");
		a = scan.nextInt();					//Scanner 객체를 이용해 정수입력받음
		System.out.print("정수입력:");
		b = scan.nextInt();
		
		c = a + b;
		System.out.println("합계는 " + c);
	
	}

}
