package HomeWork;
/* 정수 10개를 입력받아 합계 구하기 
 * 예)1,1,1,1,1,1,1,1,1,1 = 합계는 10입니다
 * 
 */
import java.util.Scanner;
public class For_HomeWork_4 {

	public static void main(String[] args) { //클래스
		Scanner scan = new Scanner(System.in); //메소드
		int a = 0, sum = 0; //변수
		

		for (int b = 0; b < 10; b++) {
			System.out.println("정수를 입력하세요.");
			a = scan.nextInt();
			sum += a;
		
		}
		System.out.println("합계는 : " + sum);
						
		
			
		
		
	}

}
