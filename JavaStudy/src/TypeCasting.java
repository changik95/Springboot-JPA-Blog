
public class TypeCasting {
	public static void main(String[] args) {
		// 형 변환
		byte b = 1;
		int i = 4;
		//short s = b + i;
		//자동(묵시적) 형 변환
		i = b;
		System.out.println(i);
		// 명시적(강제) 형 변환
		b = (byte)i;
		System.out.println(b);
	
		short s = (short)(b + i);
		System.out.println(s);
		
		byte b1 = 2;
		byte b2 = 3;
		byte b3 = (byte)(b1 + b2); //정수형은 연산할때 연산전 인트로 다 바꿔버림
		
	
		// String : 문자열
		String str = "Hello World";
		
		System.out.println(str + 1); // 정수마저 문자열로 바꿈
		
		char ch1 = 'A';
		System.out.println("ch1 : " + ch1);
		System.out.println("(int)ch1 : " + (int)ch1);
		int ch2 = 67;
		System.out.println("(char)ch2 : " + (char)ch2); //각각의 알파벳 문자들엔 숫자가 정해져있음 우린 그걸 유니코드
		
		long l = 1000L;
		float f = l;
		System.out.println(f);
		
		double d = f;
		System.out.println(d);
		l = (long)f;
	
	
	
	}

}
