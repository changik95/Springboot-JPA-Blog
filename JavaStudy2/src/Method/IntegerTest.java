package Method;

public class IntegerTest {

	public static void main(String[] args) {

		//Math m = new Math();  //new ���� ������  Math ������  mathŬ���� ����������� math Ŭ������ ��ü�� �ʿ����
		
		//Integer i = new Interger(); // ��Ƽ���� 
		
		// int -> Integer ��ü�� �ٲ۰���
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
