package oop1;

public class Person extends Object{ //�ڹ��� ��� Ŭ������ object�� �� �ֻ��� 
	public String name;
	public int age;
	
	public Person() {
		System.out.println("Person�� �⺻������");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person�� �ι�° ������");
	}
	
	public void output() {
		System.out.println("�̸�:" + name);
		System.out.println("����:" + age);
	}


	

}
	
	

