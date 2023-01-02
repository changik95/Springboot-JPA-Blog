package HomeWork;
import java.util.Scanner;
public class Homework0406_2 {

	public static void main(String[] args) {
		
		/*if문 연습
		 태어난 해를 입력받는다. if문숫자
		 띠를 출력한다
		 태어난 해 : 2000
		 용띠입니다. 
		 */
		Scanner scan = new Scanner(System.in);
		int y;
		
		System.out.print("연도를 입력하세요.");
		y = scan.nextInt();
		
		if(y % 12 == 4 ) {
		System.out.println("쥐");
	    }

		else if(y % 12 == 5) {
			System.out.println("소");
		}
		else if(y % 12 == 6 ) {
			System.out.println("호랑이");
		}
		else if(y % 12 == 7) {
			System.out.println("토끼");
		}
		else if(y % 12 == 8) {
			System.out.println("용");
		}
		else if(y % 12 == 9) {
			System.out.println("뱀");
		}
		else if(y % 12 == 10) {
			System.out.println("말");
		}
		else if(y % 12 == 11) {
			System.out.println("양");
		}
		else if(y % 12 == 0) {
			System.out.println("원숭이");
		}
		else if(y % 12 == 1) {
			System.out.println("닭");
		}
		else if(y % 12 == 2) {
			System.out.println("개");
		}
		else {
			System.out.println("돼지");
		}
	}

		
}
