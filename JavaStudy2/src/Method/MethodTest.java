package Method;

public class MethodTest {

	public static void main(String[] args) {
		System.out.println("���� ����");
		sub();
		add(10, 20);
		add(50, 60);
		int x = sum(10);
		System.out.println(x);
		
		int y = sum2(5, 10); //5~10������ �����հ� ����Ͽ� ����
		System.out.println("5~10������ �����հ�� "+ y +"�Դϴ�.");
		
		int z = fact(5);  //5!�� ���ؼ� ����
		System.out.println("5! = "+z+"�Դϴ�");
		
		double d = Math.sqrt(9);
		System.out.println(d);
		
		d = Math.pow(2, 10);
		System.out.println(d);
		
		
		
		System.out.println("���� ��");
	}
	
	public static void sub() {
		System.out.println("sub ����");
	}

	public static void add(int a, int b) { // �Ű� ���� , parameter
		int res = a + b;
		System.out.println(res);
	}
	
	public static int sum(int a) {
		int i, s = 0;
		for (i = 1; i <= a; i++) {
			s += i;
		}
		return s;
	}
	
	public static int sum2(int a, int b) {
		int c = 0;
		while(a <= b) {
			c = c+a;
			a++;

		}
		return c;
	}
	
	public static int fact(int a) {
		int b;
		int c = 1;
		for(b = 1; b <= a; b++) {
			c = c * b; 
		}
		return c;
	}
	
}
