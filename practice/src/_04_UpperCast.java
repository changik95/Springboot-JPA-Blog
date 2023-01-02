import java.util.Scanner;

/*4. 대문자 변환
사용자로부터 임의의 문자열을 입력 받아 해당 문자열 내 모든 소문자를 대문자로 변환하여 출력하는 코드를 작성하시요. 단, String 클래스의 toUpperCase() 메소드를 사용하지 말 것.*/

public class _04_UpperCast {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char[] arr = str.toCharArray();

		for (char a : arr) {
			if (a >= 97 && a <= 122) {
				System.out.print((char) (a - 32));
				continue;
			}
			System.out.print(a);
		}

		sc.close();
	}
}