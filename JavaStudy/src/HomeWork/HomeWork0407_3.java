package HomeWork;
/*
 ���� 2���� �����ڸ� �Է¹޾� ������� ����Ѵ�.
 ���� ex : ���� 1: 10
 		 ���� 2: 5
 		 ������ (+, -, /, *) : /
 �����	 10 / 5 = 2 �̷��� ������ ��   ����ġ ������ 
 switch(s) {
 	case "+":
 	case "-":
 	case "/":
 	case "*":
 
 */
import java.util.Scanner;
public class HomeWork0407_3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a,b,c;
		String d;
		
		System.out.println("������ �Է��ϼ���.");
		a = scan.nextInt();
		System.out.println("������ �Է��ϼ���.");
		b = scan.nextInt();
		System.out.println("�����ڸ� ���Ͻʽÿ�. +  -  *  /");
		d = scan.next();
		
		switch(d) {
		case "+" :
			System.out.println("a + b = " + (a + b) );
			break;
		case "-" :
			System.out.println("a - b = " + (a - b) );
			break;
		case "*":
			System.out.println("a * b = " + (a * b) );
			break;
		case "/":
			System.out.println("a / b = " + (a / b) );
			break;
		default:
			System.out.println("�Է� �����Դϴ�.");
			break;
		}
	}

}
