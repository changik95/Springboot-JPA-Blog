package classpart;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		order.num = "201803120001";
		order.id = "abc123";
		order.year = 2018;
		order.month = 3;
		order.day = 12;
		order.name = "ȫ���";
		order.sid = "PD0345-12";
		order.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println(order.num);
		System.out.println(order.id);
		System.out.print(order.year+"�� ");
		System.out.print(order.month+"�� ");
		System.out.println(order.day+"��");
		System.out.println(order.sid);
		System.out.println(order.address);
		
		
		
	}

}
