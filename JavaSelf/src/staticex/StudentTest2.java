package staticex;

public class StudentTest2 {
	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentname("������");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName+ " �й�:" + studentLee.studentID);

		Student1 studentSon = new Student1();
		studentSon.setStudentname("�ռ���");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName+ " �й�:" + studentSon.studentID);
	
	
	
	}

}
