package ForWhile;
import java.util.Scanner;
public class For4While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0, sum = 0;
		
/*		while(true){  //while true + if break�� ���� ���İ� ����.
			System.out.println("�����Է�:");
			n = scan.nextInt();
			sum += n;
			if(n == 0) {
				break;
			}
		}
		System.out.println("�հ�:" + sum);
	*/		
		// do while
		
		sum = 0;
		
		do {
			System.out.println("�����Է�:");
			n = scan.nextInt();
			sum += n;
		} while(n != 0);
		System.out.println("�հ�:"+sum);
			
	
	}

}
