package Method;
//클래스의 정의.
/*          같은 class / 다른 class/ 같은package / 다른 package / 상속관계의 다른 package
 * private	 	o		x			x				x			x
 * default		o		o			o				x			x
 * protected	o		o			o				x			o
 * public		o		o			o				o			o
 * 외부에서 잘못된 값이 조용히 들어오는걸 막기위해 private를 씀
 *
 */
public class Person {
	//속성(data) = 멤버변수 = 필드
	private String name;     
	private int age;
	private double height;
	private double weight;
	private double BMI;
	
	//기본 생성자    [접근 지정자][클래스 이름] (매개변수) { 생성자 body }
	public Person() { // public void Person() <- void(리턴타입) 넣으면 안되는데 나도 모르게 넣어서 에러도 안뜨고 뭐가 잘못된지 찾기힘듬. 
		name = "";
		age = 10;
		height = 1.1;
		weight = 1.1;
	}
	
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(double h) {
		this.height = h;
	}
	
	
	//기능 = 메소드
	public void output() {
		System.out.println("이름:" + name + ", 나이:" + age + ", 키:" + height + ", 몸무게:" + weight);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; //호출한 객체의 멤버변수를 말함
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getBMI() {
		double bmi;
		double h = height / 100;
		if (height == 0.0) {
			bmi = 0.0;
		}
		else {
			bmi = weight / (h * h);
		}
		return bmi;
			
	}
	
	public void setBMI(double BMI) {
		this.BMI = BMI;
	}
	//기능 = 메소드
	
	
}
