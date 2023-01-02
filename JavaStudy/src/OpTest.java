//연산자, 자료형 테스트
public class OpTest {
	public static void main(String[] args) {
		int i;
		double d;
		boolean b;
		
		i = 10 + 15 * 2;
		System.out.println(i);
		
		d = (10 / 3) + 3 / 2.0;
		System.out.println(d);
		
		b = 10 > 2 && 5 < 2;
		System.out.println(b);
		
		int n = (int)((10 / 3) + 3 / 2.0);
		System.out.println(n);
		
//		형변환
//		int < long < float < dobule 자동
//		자료형에 대해 엄격함
		
		int n1 = 1;               
//		int n2 = 10000000000;  error int범위 밖
//		int n3 = 10000000000L; error int형이 아니라 long형이 되야함
		long a = 10000000000L;
		float f = 1.5f;
		
		byte x = 10;
//		byte x2 = 1000;
		short x3 = 1000;
//		short x4 = 100000;
		
		// 문자(char), 문자열(String)
		char ch = 'A';
		char ch2 = 65;
		char ch3 = '\u0041';
//		 \ u 는  유니코드를 불러내는 것
		String s = "A";
		
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(s);
		System.out.println(ch + 1);
		System.out.println((char)(ch2 + 1));
		System.out.println(ch3 + 1);
		System.out.println(s + 1);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}