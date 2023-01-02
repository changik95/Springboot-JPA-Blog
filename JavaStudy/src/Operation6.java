
public class Operation6 {

	public static void main(String[] args) {
		// 삼항연산자
		// 변수 = 조건식(결과 = true or false) ? true일 경우 대입될 값 : false일 경우 대입될 값
/*		int a = 4;
		int b = 2;
		int result = a < b ? 10 : 100;
		System.out.println(result);	
	
		// 연습문제 : 삼항 연산자로 윤년 구하기
		/* 1. 년도가 4로 나누어 떨어지고 100으로 나누어 떨어지지 않으면 윤년
		 * 2. 년도가 400으로 나누어 떨어지면 윤년
		 */
		int year = 2022;
		int a = 4;
		int b = 100;
		int c = 400;
		int y = (year % a == 0 && year % b != 0) || (year % c == 0) ? 'Y' : 'N';
		System.out.println((char)y);	
		  // y = 윤년 
			
			
	}

}
