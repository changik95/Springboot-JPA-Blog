
public class Variable {

	public static void main(String[] args) {
		// 한 줄 주석
		/*여기서
		 여러줄 주석처리하기
		 저기까지*/
		//  논리형 
		System.out.println(true);//프로그램 구문,자바 코드
		System.out.println(false);//; 세미콜론은 구문(스테이트먼트)이 끝났다는 표시
		//  문자형
		System.out.println('A');
		System.out.println('가');
		//  정수형
		System.out.println(5);
		//  실수형
		System.out.println(1.0);
		
		//  변수의 선언 : 데이터 타입 변수명;
		boolean b;
		int i = 5;
		// 변수 선언 초기화 같이하려면 int i + =5
		b = true;
		//  프로그램에서 =는 대입(넣어본다) 한번 더 값을 대입하면 처음 값은 사라짐
		System.out.println(b);
		b = false;
		System.out.println(b);
		System.out.println(i);
		byte c = 2;
		System.out.println(c);
		double d = 3.14;
		System.out.println(d);
		float f = 3.14f;
		//float f = 1.3f <- f를 안붙여주면 double이 됌
		System.out.println(f);
		
	}

}
