package oop1;

public class Test {
	public static void main(String[] args) {
//		A ob = new A();
//		ob.test();

	}

}

abstract class A {  //�߻�޼ҵ带 �ϳ��� ������ �ִ� Ŭ������ �߻�Ŭ������ �Ǿ��� (�߰��ܰ�)
	public abstract void test(); //�߻�޼ҵ� abstract 
}				//�߻�޼ҵ��� �߻�Ŭ������ ������ �������̵� �ؾ���

class B extends A{
	public void test() {
		System.out.println("B���� �������� test");
	}
}
				//implements -> c��� Ŭ������ �پ��� ������ �� �� �ְ�����
				//c��� �ڷᰡ �������� �ൿ�� �ϰ�����
class C extends A implements Inter{
	public void test() {
		System.out.println("C���� �������� test");
	}
	public void method() {
		
	}
}
//�߻�Ŭ������ ����������� �ڹٴ� ���߻���� �ȉ�.
//�߻�޼ҵ�� ����θ� �̷���� �������̽� (�߻��� ������ ���� �޼ҵ尡 ����, �������̽��� ��� �����)
interface Inter {
	public static final int num = 1;
	public abstract void method();
}
/*
 *  final Ű���� ����
 * 1. ���� �� - �� ���� �Ұ� ex) final int num = 1;
 * 2. �޼ҵ� ��  ex) public 'final' void method() - �������̵� �Ұ�
 * 3. Ŭ���� �� -  ��ӺҰ� ex) final c;
 * 4. final(��ӹ�����) �� abstract(��ӹ޾�)�� �����
 */



