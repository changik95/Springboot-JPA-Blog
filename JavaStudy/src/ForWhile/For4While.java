package ForWhile;
import java.util.Scanner;
public class For4While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0, sum = 0;
		
/*		while(true){  //while true + if break는 거의 공식과 같음.
			System.out.println("정수입력:");
			n = scan.nextInt();
			sum += n;
			if(n == 0) {
				break;
			}
		}
		System.out.println("합계:" + sum);
	*/		
		// do while
		
		sum = 0;
		
		do {
			System.out.println("정수입력:");
			n = scan.nextInt();
			sum += n;
		} while(n != 0);
		System.out.println("합계:"+sum);
			
	
	}

}
