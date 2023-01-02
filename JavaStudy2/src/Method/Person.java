package Method;
//Ŭ������ ����.
/*          ���� class / �ٸ� class/ ����package / �ٸ� package / ��Ӱ����� �ٸ� package
 * private	 	o		x			x				x			x
 * default		o		o			o				x			x
 * protected	o		o			o				x			o
 * public		o		o			o				o			o
 * �ܺο��� �߸��� ���� ������ �����°� �������� private�� ��
 *
 */
public class Person {
	//�Ӽ�(data) = ������� = �ʵ�
	private String name;     
	private int age;
	private double height;
	private double weight;
	private double BMI;
	
	//�⺻ ������    [���� ������][Ŭ���� �̸�] (�Ű�����) { ������ body }
	public Person() { // public void Person() <- void(����Ÿ��) ������ �ȵǴµ� ���� �𸣰� �־ ������ �ȶ߰� ���� �߸����� ã������. 
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
	
	
	//��� = �޼ҵ�
	public void output() {
		System.out.println("�̸�:" + name + ", ����:" + age + ", Ű:" + height + ", ������:" + weight);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; //ȣ���� ��ü�� ��������� ����
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
	//��� = �޼ҵ�
	
	
}
