/*3. 순차적으로 문자열 변환하기
사용자로부터 임의의 문자열을 입력 받아 가장 마지막 문자부터 “#”으로 하나씩 변환해가며 출력하는 코드를 작성하시요.
예시) 입력: AbcdEf
출력: AbcdE#
Abcd##
Abc###
Ab####
A#####
######*/

public class _03_StringSharp {

	public static void main(String[] args) {
		String str = "AbcdEf";
		StringBuffer sb = new StringBuffer(str);

		for (int i = sb.length() - 1; i >= 0; i--) {
			sb.setCharAt(i, '#');
			System.out.println(sb.toString());
		}
	}
}