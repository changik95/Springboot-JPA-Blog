package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class CountChar {
	
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
