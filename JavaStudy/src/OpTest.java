//������, �ڷ��� �׽�Ʈ
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
		
//		����ȯ
//		int < long < float < dobule �ڵ�
//		�ڷ����� ���� ������
		
		int n1 = 1;               
//		int n2 = 10000000000;  error int���� ��
//		int n3 = 10000000000L; error int���� �ƴ϶� long���� �Ǿ���
		long a = 10000000000L;
		float f = 1.5f;
		
		byte x = 10;
//		byte x2 = 1000;
		short x3 = 1000;
//		short x4 = 100000;
		
		// ����(char), ���ڿ�(String)
		char ch = 'A';
		char ch2 = 65;
		char ch3 = '\u0041';
//		 \ u ��  �����ڵ带 �ҷ����� ��
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