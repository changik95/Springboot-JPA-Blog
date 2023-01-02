package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	
	public Person() {} // 자바 컴파일러에서 제공하는 디폴트 생성자 (자동생성자)
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname,float pheight,float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
		
		
	}
}
