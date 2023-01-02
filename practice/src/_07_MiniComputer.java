import java.util.HashMap;
import java.util.Scanner;

/*7. 미니 컴퓨터
사용자로부터 『key:value』 형태로 반복해서 데이터를 입력 받는다. 이때, key는 문자열, value는 자연수의 형태이며, 중복되는 key를 입력 받을 경우 기존에 입력되어 있던 value에 새로 입력 받은 value를 합한다. 그리고 사용자가 “exit”을 입력하면 이전까지 입력 받았던 모든 key와 value를 『key=value』 형태로 출력하는 코드를 작성하시요.
예시) 입력: a:1
b:2
c:3
a:4
c:1
exit
출력: a=5
b=2
c=4*/

public class _07_MiniComputer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();

		while (true) {
			System.out.print("입력-> ");
			String str = sc.nextLine();

			if (str.equals("exit"))
				break;

			String[] arr = str.split(":");

			String key = arr[0];
			int value = Integer.parseInt(arr[1]);

			if (map.get(key) == null)
				map.put(key, value);
			else {
				int temp = value + map.get(key);
				map.put(key, temp);
			}
		}

		for (String s : map.keySet()) {
			System.out.println(s + "=" + map.get(s));
		}

		sc.close();
	}
}