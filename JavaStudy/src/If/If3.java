package If;
import java.util.Scanner;
public class If3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
			
		System.out.print("���� : ");
		n = scan.nextInt();
	
		if (n == 0) {
			System.out.println("0 �Դϴ�.");
		}
		else {	
			if (n > 0) {
				System.out.println("���");
			}
			else {
				System.out.println("����");
			}
	
		}

		//2
		
		if (n != 0) {
			if(n > 0) {
				System.out.println("���");
			}	
			else {
				System.out.println("����");
			}
			
		}	
		else {
			System.out.println("0");
		}
	}

}
