package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	
	public Person() {} // �ڹ� �����Ϸ����� �����ϴ� ����Ʈ ������ (�ڵ�������)
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname,float pheight,float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
		
		
	}
}
