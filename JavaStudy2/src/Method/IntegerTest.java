package Method;

public class IntegerTest {

	public static void main(String[] args) {

		//Math m = new Math();  //new 힙에 생성함  Math 생성자  math클래스 못만드는이유 math 클래스는 객체가 필요없음
		
		//Integer i = new Interger(); // 인티저는 
		
		// int -> Integer 객체로 바꾼거임
		Integer in1 = new Integer(100);
		
		// String -> Integer
		Integer in2 = new Integer("123");
		
		// String -> int
		int n = Integer.parseInt("1234");
		
		// int -> String
		String s = Integer.toString(1000);
		
		// Integer -> int
		int n2 = in1.intValue();
		
		// Integer -> String
		String s2 = in1.toString();
		
		int n3 = 32767;
		
		System.out.println(Integer.toBinaryString(n3));
		System.out.println(Integer.toString(n3, 2));
		
		
	}

}
