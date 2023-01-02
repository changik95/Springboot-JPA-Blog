package For;
//for문 연습
public class For1 {

	public static void main(String[] args) {
//	for(초기값; 조건식; 증감식)	
		int i, s;
		
		//for문의 형식1 0 1 2 3 4
/*		for (i = 0; i <= 4; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		//for문의 형식1 0 1 2 3 4
		for (i = 0; i < 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//1 2 3 4 5
		for (i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}		
		System.out.println();
		
		//2 4 6 8 10
		for (i = 2; i <= 10; i = i + 2) {//i+=2 
			System.out.print(i + " ");
		}
		System.out.println();
		// 1 3 5 7 9
		for (i = 1; i <= 9; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 5 4 3 2 1
		for (i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		//10 20 30 40 50
		for (i = 10; i <= 50; i+=10) {
			System.out.print(i + " ");
		}
		System.out.println();
		//1 10 10 1000 10000
		for (i = 1; i <= 10000; i*=10) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 1 ~ 100까지 출력
		for (i = 1; i <= 100; i++) {
			System.out.print(i + " : " + (char)i + " ");
			if (i % 10 == 0) {
			System.out.println();
			}
		}
		System.out.println();
	*/	
		
		//1 ~ 100까지 출력 (3의 배수나 5의배수는 제외하고)
		for(i = 1; i <= 100; i++) {
			if (i % 3 != 0 && i % 5 != 0) {
				System.out.print(i + " ");
			
			}
			
		}
		System.out.println();
		for(i = 1; i <= 100; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				continue;
			}	
				System.out.print(i + " ");
		}
		
		
		
		
	}

}
