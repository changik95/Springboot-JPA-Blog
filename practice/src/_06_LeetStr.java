import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*6. 규칙에 따라 문자 변환하기
사용자로부터 임의의 문자열을 입력 받아 아래와 같은 규칙에 따라 변환한 후 출력하는 코드를 작성하시요.
규칙) A => 4
E => 3
G => 6
I => 1
O => 0
S => 5
Z => 2
예시) 입력: Ag#IZklS
출력: 4g#12kl5*/

public class _06_LeetStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		String[] arr = line.split("");

		Map<String, String> map = new HashMap<>();
		map.put("A", "4");
		map.put("E", "3");
		map.put("G", "6");
		map.put("I", "1");
		map.put("O", "0");
		map.put("S", "5");
		map.put("Z", "2");

		for (String s : arr) {
			String result = map.get(s);
			if (result == null)
				System.out.print(s);
			else
				System.out.print(result);
		}

		sc.close();
	}
}