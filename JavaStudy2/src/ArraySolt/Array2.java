package ArraySolt;


// 1+2+3+4+5=15
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[] = new int[5];
		
		//입력받은 정수를 배열에 저장
		for (int i = 0; i < num.length; i++) {
			System.out.print("정수입력:");
			num[i] = scan.nextInt();
		}
			
		//배열 내의 모든 값을 합계
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		
		
		//배열의 모든 내용을 출력
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"+");
		}
				
			
		
		System.out.print("=" + sum);
		
	}

}
