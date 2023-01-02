package oop2;

import oop1.Person;
import oop1.Student;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.output();
		Person p2 = new Person("È«±æµ¿", 20);
		p2.output();
		
		Student s = new Student();
		System.out.println(s.kor);
		System.out.println(s.name);
		s.output();
		
		Student s2 = new Student("±èÃ¶¼ö", 25, 100, 90);
		s2.output();
		
		System.out.println(s2);
		System.out.println(s2.toString());
		
		
	}

}
