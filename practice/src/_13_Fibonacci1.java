import java.util.ArrayList;
import java.util.Scanner;

/*13. 피보나치 수열 구현하기 1
피보나치 수열은 첫째 및 둘째 항이 1이며, 그 이후의 항은 바로 앞 두 항의 합으로 이루어진 수열을 말한다. 사용자로부터 어떤 자연수를 입력 받아 입력 받은 수보다 작거나 같은 수로만 이루어진 피보나치 수열을 출력하는 코드를 작성하시요.
예시) 입력: 10
출력: 1, 1, 2, 3, 5, 8*/

public class _13_Fibonacci1 {
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
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		for (int i = 0; i < input; i++) {
			int a = list.get(i);
			int b = list.get(i + 1);
			if (a + b > input)
				break;
			list.add(a + b);
		}
		System.out.println(list);
		scanner.close();
	}
}