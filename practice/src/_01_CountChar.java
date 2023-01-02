import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

/*1. 문자열을 구성하는 문자의 개수 세기
사용자로부터 임의의 문자열을 입력 받아 해당 문자열을 구성하는 문자들 및 각 문자의 개수를 출력하는 코드를 작성하시요.
예시) 입력: 가가가bbbbcc#
출력: 가3b4c2#1*/

public class _01_CountChar {

	public static void main(String[] args) {
		String str = "가가가가가bbbbcc#";
		String[] strArr = str.split("");
		LinkedList<String> list = new LinkedList<>(Arrays.asList(strArr));
		HashSet<String> set = new HashSet<>(list);
		StringBuffer sb = new StringBuffer();

		for (String s : set) {
			int count = 0;

			while (true) {
				if (!list.remove(s))
					break;
				count++;
			}

			sb.append(s);
			sb.append(count);
		}

		System.out.println(sb.toString());
	}
}