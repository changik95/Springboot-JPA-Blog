package oop1;

public class Person extends Object{ //자바의 모든 클래스는 object가 젤 최상위 
	public String name;
	public int age;
	
	public Person() {
		System.out.println("Person의 기본생성자");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person의 두번째 생성자");
	}
	
	public void output() {
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
	}


	

}
	
	

