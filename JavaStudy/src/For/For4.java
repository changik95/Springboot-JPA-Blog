package For;
import java.util.Scanner;
public class For4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0, sum = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("정수입력:");
			n = scan.nextInt();
			sum += n;
			if(n == 0) {
				break;
			}
				
		}
		System.out.println("합계:" + sum);
	
	
	}

}
