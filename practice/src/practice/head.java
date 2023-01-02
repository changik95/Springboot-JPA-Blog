package practice;

import java.util.Scanner;

public class head {
	
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
