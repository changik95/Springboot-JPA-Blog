package classpart;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		order.num = "201803120001";
		order.id = "abc123";
		order.year = 2018;
		order.month = 3;
		order.day = 12;
		order.name = "홍길순";
		order.sid = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println(order.num);
		System.out.println(order.id);
		System.out.print(order.year+"년 ");
		System.out.print(order.month+"월 ");
		System.out.println(order.day+"일");
		System.out.println(order.sid);
		System.out.println(order.address);
		
		
		
	}

}
