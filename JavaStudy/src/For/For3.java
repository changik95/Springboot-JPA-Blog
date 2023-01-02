package For;
import java.util.Scanner;
public class For3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int b = 0;
		int i = 3;
		System.out.print("1 ~ 9사이의 정수를 입력하세요 : ");
		n = scan.nextInt();
		
		for(i = 3; n < 10; n++) {
			if(n <= 9) {
			b = n * i;
			}

			
			System.out.println(i + " x " + n +" = " + b);
		}	
		
		
	}

}
