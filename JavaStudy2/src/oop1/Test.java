package oop1;

public class Test {
	public static void main(String[] args) {
//		A ob = new A();
//		ob.test();

	}

}

abstract class A {  //추상메소드를 하나라도 가지고 있는 클레스는 추상클래스가 되야함 (중간단계)
	public abstract void test(); //추상메소드 abstract 
}				//추상메소드의 추상클래스는 무조건 오버라이딩 해야함

class B extends A{
	public void test() {
		System.out.println("B에서 재정의한 test");
	}
}
				//implements -> c라는 클래스가 다양한 역할을 할 수 있게해줌
				//c라는 자료가 여러가지 행동을 하게해줌
class C extends A implements Inter{
	public void test() {
		System.out.println("C에서 재정의한 test");
	}
	public void method() {
		
	}
}
//추상클래스를 만드는이유는 자바는 다중상속이 안됌.
//추상메소드와 상수로만 이루어진 인터페이스 (추상은 멀쩡한 변수 메소드가 있음, 인터페이스는 모두 상수임)
interface Inter {
	public static final int num = 1;
	public abstract void method();
}
/*
 *  final 키워드 조건
 * 1. 변수 앞 - 값 변경 불가 ex) final int num = 1;
 * 2. 메소드 앞  ex) public 'final' void method() - 오버라이딩 불가
 * 3. 클래스 앞 -  상속불가 ex) final c;
 * 4. final(상속받지마) 과 abstract(상속받아)는 모순임
 */



