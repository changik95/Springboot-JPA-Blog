package test;

import hiding.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.address = "���� ��õ��";  //address�� ���� �����ڸ� public���� �����ϸ� ���� ������
//		studentLee.studentName = "�̻��";  ���������� private�� �����̵Ǽ� ��������
		studentLee.setStudentName("�̻��");
		
		System.out.println(studentLee.getStudentName());
	}

}
