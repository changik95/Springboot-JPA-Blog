package Method;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product("aaa", 100);
		Product p2 = new Product("aaa", 100);
		Product p3 = new Product("bbb", 200);
		
		System.out.println(p1);
		System.out.println(p1 == p2); // ������ġ�ΰ� ���
		System.out.println(p1.equals(p2)); // ���� ����(��)�ΰ� ���
		
//		Object o = new Product("ccc", 300); // ������Ʈ�� ���δ�Ʈ�� ����
//		Object o2 = new String(); //������Ʈ�� ��Ʈ���� ����
//		String s = new Integer(111);
//		Number n = new Integer(222); //number�� integer�� ����Ŭ����
	
	
	}

}
