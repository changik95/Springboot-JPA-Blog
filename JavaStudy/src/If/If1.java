package If;

public class If1 {

	public static void main(String[] args) {
		int n = 95;
		
		
		//1
		if (n >= 70) {
			System.out.println("합격");
		}
			
		else {
			System.out.println("불합격");
		}	
		
		
		
		//2
		if (n % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		
	
		//3
		if ( n < 0) {
			System.out.println("음수");
		}
		else if (n > 0) {
			System.out.println("양수");
		}
		else {
			System.out.println("0");
		}
				
		//4
		if (n >= 90) {
			System.out.println("A");
		}
		else if (n >= 80) {			//else if는 and와 비슷함
			System.out.println("B");
		}
		else if (n >= 70) {
			System.out.println("C");
		}
		else { 
			System.out.println("D");
		}
			
		
		
		System.out.println("프로그램의 끝");
		/* if,switch 는 문장을 건너뜀. while , for , do while은 반복문
		if(조건)
		  // 문장1
		} else {
		  // 문장 2
		}
		
		다중 if~else문
		



		*/
	}

}
