package classpart;

public class StudentTest {
	public static void main(String[] args) {
		Student studentAhn = new Student(); //student 클래스 생성 인스턴스라고함
		studentAhn.studentName ="안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
