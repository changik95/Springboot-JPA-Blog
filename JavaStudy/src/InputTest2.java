import java.util.Scanner;		//Scanner 클래스를 사용하기 위해

public class InputTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // Scanner 객체 생성
		
		int a, b, c; //변수선언
		
		System.out.print("상품금액:");
		a = scan.nextInt();					//Scanner 객체를 이용해 변수에 정수입력받아 대입
		System.out.print("받은금액:");
		b = scan.nextInt();					//Scanner 객체를 이용해 변수에 정수입력받아 대입
		
		c = b - a;	// 계산
		System.out.println(" 거스름돈은 " + c);	// 결과 출력

		
		
		
		
		
	}

}




