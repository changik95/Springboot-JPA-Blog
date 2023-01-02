import java.util.ArrayList;
import java.util.Scanner;

/*14. 피보나치 수열 구현하기 2
피보나치 수열은 첫째 및 둘째 항이 1이며, 그 이후의 항은 바로 앞 두 항의 합으로 이루어진 수열을 말한다. 사용자로부터 어떤 자연수를 입력 받아 그 수 번째 항에 해당하는 피보나치 수열의 값을 출력하는 코드를 작성하시요.
예시) 입력: 10
출력: 피보나치 수열의 10번째 항 = 55*/

public class _14_Fibonacci2 {
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
		while (true) {
			if (list.size() >= input) {
				System.out.print("피보나치 수열 " + input + "번째 항의 값 = ");
				System.out.println(list.get(input - 1));
				break;
			}
			int a = list.get(list.size() - 1);
			int b = list.get(list.size() - 2);
			list.add(a + b);
		}
		scanner.close();
	}
}
