// 기본연산자 p71~90
public class Self2 {

	public static void main(String[] args) {

		//단항 연산자 ++num
		//이항 연산자 num1 + num2;
		//삼항 연산자 (5+3) ? 1 : 0;
		//대입 연산자 int age = 24; =가 대입
		
		//부호 연산자 + -
		
		int num = 10;
		
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);
		
		num = -num;
		System.out.println(num);
		
		//산술 연산자 쉬워서 패스
		
		//논리 연산자
		int n = 10;
		
		boolean a = (n > 20) && (n < 5); //논리연산자는 앞에서(n > 20 = false) 이미 결과가 나올시 뒤에는(n < 5) 계산안함
		
		
		
	}

}
