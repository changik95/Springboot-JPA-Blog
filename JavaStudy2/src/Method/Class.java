package Method;

public class Class {
//Ŭ������ ����
	public static void main(String[] args) {
		int n = 10;
		String s = "���ڿ�";
		
		Person p = new Person();
		//p.name = "ȫ�浿";
		p.setName("ȫ�浿");
		//p.age = 20;
		p.setAge(20);
		System.out.println(p.getName());
		//p.height = 166.6;
		p.setHeight(166.6);
		//p.weight = 55.5;
		p.setWeight(55.5);
		p.output();
		
		//BMI = ������ / Ű�� ����(���ʹ���)
		double d = p.getBMI();
		System.out.println(d);
		
		Person p2 = new Person();
		//p2.name = "��ö��";
		//p2.age = 30;
		//p2.height = 177.7;
		//p2.weight = 88.8;
		p2.setName("��ö��");
		p2.setAge(30);
		p2.output();
		
		d = p2.getBMI();
		System.out.println(d);
		
		Person p3 = new Person();
		p3.output();
		
		Person p4 = new Person("ȫ�浿", 25,111.0,111);
		p4.output();
		
		Person p5 = new Person("�迵��", 30);
		p5.output();
		
		Person p6 = new Person(170.5);
		p6.output();
		// ���⼭ �����Ե� ���α��ϴ� double ���� �����ε��� �Ǽ� ������.
		
			
		
		
		
		
	}

}
