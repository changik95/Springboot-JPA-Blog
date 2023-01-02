import java.util.Scanner;

/*5. 문자열 검색
사용자로부터 입력 받을 문자열의 개수를 입력 받고, 검색할 단어를 입력 받은 후, 앞서 입력 받은 숫자만큼 문자열을 입력 받는다. 이후 해당 문자열에서 검색어를 포함하는 문자열을 출력하되, 검색어가 존재하지 않을 경우 “None”을 출력하는 코드를 작성하시요.
예시) 입력: 3
ab
abba
oppa
BCabD
출력: abba
BCabD*/

public class _05_SearchLog {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력받을 문자열 수를 입력 받음
		String line = sc.nextLine();

		// 입력받은 문자열 수를 int 로 변환
		int count = Integer.parseInt(line);

		// 검색 키워드와 입력받은 문자열을 보관할 배열 선언
		String[] arr = new String[count + 1];

		// 입력받은 문자열에 검색 키워드가 존재하지 않았을 경우, None 을 출력하기 위한 flag
		boolean flag = false;

		// 문자열을 입력 받아서 배열에 저장
		// index 0 번은 검색 키워드
		// index 1~ 번은 입력받은 문자열
		for (int i = 0; i <= count; i++) {
			arr[i] = sc.nextLine();
		}

		for (int i = 1; i <= count; i++) {
			// 배열에서 입력받은 문자열을 가져옴
			String str = arr[i];

			// 입력받은 문자열에 검색 키워드가 존재할 경우
			if (str.contains(arr[0])) {
				// 해당 문자열 출력
				System.out.println(str);
				// None 이 출력되지 않도록 flag 변환
				flag = true;
			}
		}

		// 검색 키워드가 존재하지 않았을 경우, None 을 출력
		if (!flag)
			System.out.println("None");

		sc.close();
	}
}