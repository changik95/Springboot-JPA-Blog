package ArraySolt;

import java.util.Scanner;
public class ArrayTest5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ar[] = new int[6];
		int n;
		int b;
		//무작위 숫자초기화
		for(int i = 0; i < ar.length; i++) {
			ar[i] =(int)(Math.random()*45 + 1);
		}
		//입력받음
		System.out.println("정수를 입력하세요 : ");
		n = scan.nextInt();
		
		//boolean 또는 int형 변수 준비
		boolean flag = false;
		
		//확인후 출력
		for(b = 0; b < ar.length; b++) {
			if(n == ar[b]) {
				flag = true;
				break;
			}
		}
		
		if (flag) {
			System.out.println(b + "번째");
		}
		else {
			System.out.println("없음");
		}
		
	// int형 6개짜리 배열 생성
	// 1~45범위의 무작위 숫자로 초기화
	// 변수 n 에 키보드로 숫자입력받음
	// 입력받은 숫자가 배열내에 있는지 확인하고 출력	
		
	}

}
/*
	정수를 입력하세요 : 3 
	[10,5,1,3,2,6]중에서 3번요소에 있습니다.
*/