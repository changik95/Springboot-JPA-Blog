package HomeWork;
/*������ �Է¹޾� n!(���丮��)�� ���Ѵ�
 * �� ) 5�Է��ϸ� 120�� ���;���
 * 
 */
import java.util.Scanner;
public class For_HomeWork_3 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		long a,b;
		long sum = 1;
	
		System.out.println("������ �Է��ϼ���.");
		a = scan.nextInt();
	
		for(b = a; b >= 1; b--) {
			sum = sum * b;
			
		}
		System.out.print(a +"! = " + sum);
			
			
	}

}
