package If;
import java.util.Scanner;
public class If3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
			
		System.out.print("정수 : ");
		n = scan.nextInt();
	
		if (n == 0) {
			System.out.println("0 입니다.");
		}
		else {	
			if (n > 0) {
				System.out.println("양수");
			}
			else {
				System.out.println("음수");
			}
	
		}

		//2
		
		if (n != 0) {
			if(n > 0) {
				System.out.println("양수");
			}	
			else {
				System.out.println("음수");
			}
			
		}	
		else {
			System.out.println("0");
		}
	}

}
