import java.util.Scanner;

/*12. 팩토리얼 구현하기 2
n!(n 팩토리얼)은 1부터 n까지 존재하는 모든 자연수의 곱을 의미한다. 사용자로부터 어떤 자연수 n을 입력 받아 n!의 값을 출력하는 코드를 재귀함수를 사용하지 않고 작성하시요.*/

public class _12_Factorial2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = -1;
		while (true) {
			System.out.print("숫자를 입력하세요.: ");
			String temp = scanner.nextLine();
			try {
				input = Integer.parseInt(temp);
			} catch (Exception e) {
			}
			if (input < 0)
				System.out.println("다시 입력하세요.");
			else
				break;
		}
		int n = 1;
		for (int i = 0; i < input; i++) {
			n *= i + 1;
		}
		System.out.println(input + "! = " + n);
		scanner.close();
	}
}