import java.util.Scanner;

/*11. 팩토리얼 구현하기 1
n!(n 팩토리얼)은 1부터 n까지 존재하는 모든 자연수의 곱을 의미한다. 사용자로부터 어떤 자연수 n을 입력 받아 n!의 값을 출력하는 코드를 재귀함수를 사용하여 작성하시요.
※	재귀함수: 자기 자신을 호출하는 함수
예시) 입력: 5
출력: 5! = 120*/

public class _11_Factorial1 {
	public static int factorial(int n) {
		if (n > 1)
			return factorial(n - 1) * n;
		else
			return 1;
	}

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
		int n = factorial(input);
		System.out.println(input + "! = " + n);
		scanner.close();
	}
}