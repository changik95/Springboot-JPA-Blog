package Method;

import java.util.Scanner;

public class Test_0428_3_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,c,d;
		String b;

		System.out.print("입력할 진법 (2/8/10/16) : "); //진법입력 변수명 a
		a = scan.nextInt();		
		if(a != 2 & a != 8 & a != 10 & a != 16) {
			System.out.print("Input error.");
			return;
		}
		
		
		System.out.print("정수 입력 ("+ a +"진수)"+ " : " + "\n"); //정수입력 변수명 b
		b = scan.next();
		
		if(a == 2) {
			if(b == "0" && b == "1") {
			}
			else {
				System.out.println("2진수의 값은 0과 1로 통일해주세요");
				return;
			}
		}
		
		System.out.print("변환할 진법 (2/8/10/16) : "); //진법변환 변수명 c
		c = scan.nextInt();		

		System.out.print(b+"("+ a+")"+ "-> ");
		
			
		
		
		//변환 중복값 제거
			if(a == 2 && c == 2) {
				System.out.println("변환 할 필요가 없습니다.");
				return;
			}
			if(a == 8 && c == 8) {
				System.out.println("변환 할 필요가 없습니다.");
				return;
			}
			if(a == 10 && c == 10) {
				System.out.println("변환 할 필요가 없습니다.");
				return;
			}
			if(a == 16 && c == 16) {
				System.out.println("변환 할 필요가 없습니다.");
				return;
			}

			
			//2진수 스타트 -> 변환
			
			if(a == 2 && c == 8) {
				System.out.print(Integer.parseInt(b,2)+"(10) -> ");
				d = Integer.parseInt(b,2);
				System.out.print(Integer.toOctalString(d)+"(8)");			
			}
			
			if(a == 2 && c == 10) {
				System.out.print(Integer.parseInt(b,2)+"(10)");
			}
			
			if(a == 2 && c == 16) {
				System.out.print(Integer.parseInt(b,2)+"(10) -> ");
				d = Integer.parseInt(b,16);
				System.out.print(Integer.toHexString(d)+"(16)");			
			}
				
			
			// 8진수 스타트 -> 변환
			if (a == 8 && c == 2) {
				System.out.print(Integer.parseInt(b,8)+"(10) -> ");
				d = Integer.parseInt(b,8);
				System.out.print(Integer.toBinaryString(d)+"(2)");
			}
			if (a == 8 && c == 10) {
				System.out.print(Integer.parseInt(b,8)+"(10)");
			}
			if (a == 8 && c == 16) {
				System.out.print(Integer.parseInt(b,8)+"(10) -> ");
				d = Integer.parseInt(b,8);
				System.out.print(Integer.toHexString(d)+"(16)");
			}
			
			// 10진수 스타트 -> 변환
			if (a == 10 && c == 2) {
				d = Integer.parseInt(b,10);
				System.out.print(Integer.toBinaryString(d) +"(2)");
			}
			if (a == 10 && c == 8) {
				d = Integer.parseInt(b,10);
				System.out.print(Integer.toOctalString(d) +"(8)");
			}
			if (a == 10 && c == 16) {
				d = Integer.parseInt(b,10);
				System.out.print(Integer.toHexString(d) +"(16)");
			}
			
			// 16진수 스타트 -> 변환
		
			if (a == 16 && c == 2) {
				System.out.print(Integer.parseInt(b,16)+"(10) -> ");
				d = Integer.parseInt(b,16);
				System.out.print(Integer.toBinaryString(d) +"(2)");
			}
			
			if (a == 16 && c == 8) {
				System.out.print(Integer.parseInt(b,16)+"(10) -> ");
				d = Integer.parseInt(b,16);
				System.out.print(Integer.toOctalString(d) +"(8)");
			}
			
			if (a == 16 && c == 10) {
				System.out.print(Integer.parseInt(b,16)+"(10)");
			}
			
			
			
			
		
	}
}