package oop1;

//overloading 
//overriding ��ӹ��� �����ڸ� ������

//student�� personŬ������ ��ӹ���  student�� �ڽ�Ŭ����
public class Student extends Person{//��� 
	public int kor;
	public int eng;
	
	public Student () {
		super();  //���� Ŭ������ ������ ȣ��
		System.out.println("Student Ŭ������ �⺻������");
	}

	
	public Student(String name, int age, int kor, int eng) {
		super(name, age); //������ �ҷ��� 
//		this.name = name;
//		this.age = age;  // �� 2���� ������
		this.kor = kor;
		this.eng = eng;
		System.out.println("StudentŬ������ �ι�° ������");
	}
		//��ӹ��� output() �޼ҵ带 ������ (�������̵�)
		public void output() {
			super.output();
			System.out.println("��������:" + kor);
			System.out.println("��������:" + eng);
		}
		
	//Object Ŭ�����κ��� ��ӹ��� toString()�� ������
	public String toString() {
		String s = "�̸�:" + name + " ����:" + age + " ����:" + kor + " ����:" + eng;
		return s;
	}
	
	
	
	
}
