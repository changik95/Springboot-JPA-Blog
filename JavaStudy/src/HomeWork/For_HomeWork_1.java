package HomeWork;
//정수 2개를 입력받아 그 사이의 모든 정수 합계
// ex ) 1과 5 입력하면 합계 15가 나와야함 1이먼저올지 5가먼저올지 생각해야함
// ex2) 10과 5를 입력하면 합계 45가 나와야함
import java.util.Scanner;
public class For_HomeWork_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		int sum = 0;
		System.out.println("정수를 입력하세요");
		a = scan.nextInt();
		System.out.println("정수를 입력하세요");
		b = scan.nextInt();
		//a , b는 스캐너에 입력할 변수  , c는 포문 들어갈때 a값을 넣어주기 위한 변수   
			c = a;
			if(c < b) {
				for (c = a; c <= b; c++) {  
					sum = sum + c;
				}
				System.out.println("합계는 : " +sum);
			}	
			
				else if(c > b) {
					for (c = a; c >= b; c--) {
					sum = sum + c;	
					}
				}	
				else if(c == b) {
						System.out.println("입력하신 정수가 동일합니다. ");
					}
			System.out.println("합계는 : " +sum);
			
			/*
			 *	int a, b, min, max, sum, i,; 
			 * 
			 * System.out.print("정수입력:");
			 * a = scan.nextInt();
			 * System.out.print("정수입력:");
			 * b = scan.nextInt();
			 * 
			 * sum = 0;
			 * min = (a > b) ? b : a;
			 * max = (a > b) ? a : b;
			 * 
			 * for(i = min; i<= max; i++){
			 * 		sum += i;
			 * }
			//System.out.println("정수 1 :" + a);
			//System.out.println("정수 2 :" + b);
			//System.out.println("정수 3 :" + sum);
			 *
			 */
			
		
		
	}
		
}
				
		
	

