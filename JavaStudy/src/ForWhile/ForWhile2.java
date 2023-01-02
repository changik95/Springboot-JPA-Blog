package ForWhile;
import java.util.Scanner;
public class ForWhile2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		int sum = 0;
//정수 2개를 입력받아 그 사이의 모든 정수 합계
	
		System.out.println("정수를 입력하세요");
		a = scan.nextInt();
		System.out.println("정수를 입력하세요");
		b = scan.nextInt();
		
/*		if(a < b) {
			
		while (a <= b) {
			sum = sum + a;
			a++;
		}
		}
		else if(a > b) {
			while(a >=b) {
			sum = sum + a;
			a--;
			}
		}
		System.out.println("합계는 : "+sum);
	*/	
		sum = 0;

		if (a < b) {
			do {
				sum = sum + a;
				a++;
			}while(a <= b);
		}
		else if(a > b) {
			do {
				sum = sum + a;
				a--;
			}while(a >= b);
		}
		
		
	System.out.println("합계는 : "+sum);

	}

}