package Method;

public class Class {
//클래스의 정의
	public static void main(String[] args) {
		int n = 10;
		String s = "문자열";
		
		Person p = new Person();
		//p.name = "홍길동";
		p.setName("홍길동");
		//p.age = 20;
		p.setAge(20);
		System.out.println(p.getName());
		//p.height = 166.6;
		p.setHeight(166.6);
		//p.weight = 55.5;
		p.setWeight(55.5);
		p.output();
		
		//BMI = 몸무게 / 키의 제곱(미터단위)
		double d = p.getBMI();
		System.out.println(d);
		
		Person p2 = new Person();
		//p2.name = "김철수";
		//p2.age = 30;
		//p2.height = 177.7;
		//p2.weight = 88.8;
		p2.setName("김철수");
		p2.setAge(30);
		p2.output();
		
		d = p2.getBMI();
		System.out.println(d);
		
		Person p3 = new Person();
		p3.output();
		
		Person p4 = new Person("홍길동", 25,111.0,111);
		p4.output();
		
		Person p5 = new Person("김영희", 30);
		p5.output();
		
		Person p6 = new Person(170.5);
		p6.output();
		// 여기서 몸무게도 따로구하는 double 사용시 오버로딩이 되서 에러남.
		
			
		
		
		
		
	}

}
