import java.util.Scanner;

/*10. FizzBuzz 테스트
사용자로부터 어떤 자연수를 입력 받아 1에서부터 입력 받은 수까지 모든 자연수를 출력하되, 3으로 나누어 떨어지면 “Fizz”, 5로 나누어 떨어지면 “Buzz”, 3과 5 모두 나누어 떨어지면 “FizzBuzz”라는 메세지를 출력하는 코드를 작성하시요.*/

public class _10_FizzBuzz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		while (true) {
			System.out.print("숫자를 입력하세요.: ");
			String temp = scanner.nextLine();
			try {
				input = Integer.parseInt(temp);
			} catch (Exception e) {
			}
			if (input < 1)
				System.out.println("다시 입력하세요.");
			else
				break;
		}
		for (int i = 0; i < input; i++) {
			int print = i + 1;
			if (print % 15 == 0)
				System.out.println(print + ": FizzBuzz");
			else if (print % 3 == 0)
				System.out.println(print + ": Fizz");
			else if (print % 5 == 0)
				System.out.println(print + ": Buzz");
			else
				System.out.println(print);
		}
		scanner.close();
	}
}