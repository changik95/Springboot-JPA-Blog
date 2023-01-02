package Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		BufferedWriter bw = null;
		String s = null;
		String yn = null;
		bw = new BufferedWriter(new FileWriter("text.txt"));
		
		while (true) {
			System.out.print("문자열 입력 : ");
			s = scan.nextLine();
			bw.write(s);
			bw.newLine();//한칸 내림
			System.out.print("계속 입력하시겠습니까? (y/n) ");
			yn = scan.nextLine();
			if (yn.equalsIgnoreCase("y")) {
				continue;
			}
			else if(yn.equalsIgnoreCase("n")) {
				System.out.println("저장되었습니다.");
				break;
			}
		}
			
		bw.close();
		
		
		
	}

}
