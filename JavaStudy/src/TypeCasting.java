
public class TypeCasting {
	public static void main(String[] args) {
		// �� ��ȯ
		byte b = 1;
		int i = 4;
		//short s = b + i;
		//�ڵ�(������) �� ��ȯ
		i = b;
		System.out.println(i);
		// �����(����) �� ��ȯ
		b = (byte)i;
		System.out.println(b);
	
		short s = (short)(b + i);
		System.out.println(s);
		
		byte b1 = 2;
		byte b2 = 3;
		byte b3 = (byte)(b1 + b2); //�������� �����Ҷ� ������ ��Ʈ�� �� �ٲ����
		
	
		// String : ���ڿ�
		String str = "Hello World";
		
		System.out.println(str + 1); // �������� ���ڿ��� �ٲ�
		
		char ch1 = 'A';
		System.out.println("ch1 : " + ch1);
		System.out.println("(int)ch1 : " + (int)ch1);
		int ch2 = 67;
		System.out.println("(char)ch2 : " + (char)ch2); //������ ���ĺ� ���ڵ鿣 ���ڰ� ���������� �츰 �װ� �����ڵ�
		
		long l = 1000L;
		float f = l;
		System.out.println(f);
		
		double d = f;
		System.out.println(d);
		l = (long)f;
	
	
	
	}

}
