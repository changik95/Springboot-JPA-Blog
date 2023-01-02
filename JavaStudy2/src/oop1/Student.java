package oop1;

//overloading 
//overriding 상속받은 접근자를 재정의

//student는 person클래스를 상속받음  student는 자식클래스
public class Student extends Person{//상속 
	public int kor;
	public int eng;
	
	public Student () {
		super();  //상위 클래스의 생성자 호출
		System.out.println("Student 클래스의 기본생성자");
	}

	
	public Student(String name, int age, int kor, int eng) {
		super(name, age); //강제로 불러냄 
//		this.name = name;
//		this.age = age;  // 이 2개를 못쓸때
		this.kor = kor;
		this.eng = eng;
		System.out.println("Student클래스의 두번째 생성자");
	}
		//상속받은 output() 메소드를 재정의 (오버라이딩)
		public void output() {
			super.output();
			System.out.println("국어점수:" + kor);
			System.out.println("영어점수:" + eng);
		}
		
	//Object 클래스로부터 상속받은 toString()을 재정의
	public String toString() {
		String s = "이름:" + name + " 나이:" + age + " 국어:" + kor + " 영어:" + eng;
		return s;
	}
	
	
	
	
}
