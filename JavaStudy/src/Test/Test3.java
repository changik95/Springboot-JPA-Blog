package Test;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Alphabet;

		System.out.println("영단어를 입력해주세요.");
		Alphabet = scan.nextLine();
		Alphabet = Alphabet.replaceAll(" ", "");
		
		for(int i = Alphabet.length()-1; i >=0; i--) {
				System.out.print(Alphabet.charAt(i) );
		}
	}


}
