package Method;

import java.util.Scanner;

public class Test_0428_3 {

	public static void main(String[] args) {	//선생님 이번 진법과제가 사진이랑 똑같은 결과를 출력하는건지, 아니면 다른 숫자의 진법을 입력해도 작동하는 
		Scanner scan = new Scanner(System.in);	//프로그램을 짜는건지 잘 몰라서 두개 만들었습니다 0428_3(사진이랑똑같이) , 0428_3_2(프로그램) 이렇게 총 2개입니다
		int a,c,d;
		String b;

		System.out.print("입력할 진법 (2/8/10/16) : ");
		a = scan.nextInt();		
		if(a != 2 && a != 8 && a != 10 && a != 16) {
			System.out.print("Input error.");
			return;
		}
		System.out.print("정수 입력 (2진수) : " +"\n");
		b = scan.next();
		System.out.print("변환할 진법 (2/8/10/16) : ");
		c = scan.nextInt();		

		System.out.print(b+"(2) -> ");
		
		System.out.print(Integer.parseInt(b,2)+"(10) -> ");
		
		d = Integer.parseInt(b,2);
		
		System.out.print(Integer.toHexString(d)+"(16)");			
			
			
		
	}
}