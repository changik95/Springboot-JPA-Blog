package HomeWork;
/*정수를 입력받아 n!(팩토리얼)을 구한다
 * 예 ) 5입력하면 120이 나와야함
 * 
 */
import java.util.Scanner;
public class For_HomeWork_3 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		long a,b;
		long sum = 1;
	
		System.out.println("정수를 입력하세요.");
		a = scan.nextInt();
	
		for(b = a; b >= 1; b--) {
			sum = sum * b;
			
		}
		System.out.print(a +"! = " + sum);
			
			
	}

}
