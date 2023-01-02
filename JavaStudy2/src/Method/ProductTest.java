package Method;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product("aaa", 100);
		Product p2 = new Product("aaa", 100);
		Product p3 = new Product("bbb", 200);
		
		System.out.println(p1);
		System.out.println(p1 == p2); // 같은위치인가 물어봄
		System.out.println(p1.equals(p2)); // 같은 내용(값)인가 물어봄
		
//		Object o = new Product("ccc", 300); // 오브젝트는 프로덕트의 상위
//		Object o2 = new String(); //오브젝트는 스트링의 상위
//		String s = new Integer(111);
//		Number n = new Integer(222); //number는 integer의 상위클래스
	
	
	}

}
