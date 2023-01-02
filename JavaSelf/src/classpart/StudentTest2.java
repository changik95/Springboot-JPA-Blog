package classpart;

public class StudentTest2 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "안연수";

		Student student2 = new Student();
		student2.studentName = "안승연";
		
		System.out.println(student1); //참조변수 , 밑에 주소는 참조값
		System.out.println(student2); //해시코드
	}

}
