package exception;

import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = null;
		int n = 0;
		String ar[] = new String[3];
		
		try {
			System.out.print("정수입력:");
			s = scan.next();
			n = Integer.parseInt(s);
			ar[0] = s;
			System.out.println("입력받은 값: "+ n);
		}	
		catch (NumberFormatException e) {
			System.out.println("정수를 입력하세요.");
			//return;
			System.exit(0);
		} // 트라이가 감싸고 캐치가 받아줌 캐치는 여러개 달아도됨
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열이 범위를 넘었습니다.");
		}
		finally { //무슨 일이 있어도 무조건 실행됨
			System.out.println("finally");
		}
		
		
		System.out.println("프로그램의 끝");
		
		
		
	}

}
