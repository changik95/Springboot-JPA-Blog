package If;
import java.util.Scanner;
public class If2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int y;      //입력받은 연도

		System.out.print("연도를 입력하세요.");
		y = scan.nextInt();
		
		// 4년마다 윤년. 100년마다 건너뜀. 400년마다 무조건 윤년.
		// 4의 배수이면서 100의 배수가 아니고 , 400의 배수
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			System.out.println("윤년입니다.");
		}
		else {
			System.out.println("윤년이 아닙니다.");
		}
		
		
		
		
	
	
	
	
	
	
	
	
	}

}
