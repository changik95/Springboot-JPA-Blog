import java.util.Scanner;

/*2. 분리한 문자열의 첫 번째 문자 출력하기
사용자로부터 임의의 문자열을 입력 받아 공백을 기준으로 분리한 후, 분리된 문자열의 첫 번째 글자만 모아서 출력하는 코드를 작성하시요.
예시) 입력: ABC DEF GHI
출력: A,D,G*/

public class _02_Head {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		// case1 start
//		String[] arr = line.split(" ");
//		System.out.println(String.join(",", arr));
		// case1 end

		// case2 start
		String[] arr = line.split(" ");
		StringBuffer sb = new StringBuffer();

		for (String str : arr) {
			sb.append(str.charAt(0));
			sb.append(", ");
		}
		sb.deleteCharAt(sb.length() - 2);
		System.out.println(sb);
		// case2 end

		sc.close();
	}
}