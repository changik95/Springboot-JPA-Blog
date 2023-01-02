package classpart;

public class Student { //객체
	int studentID;				//멤버변수
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() { //메서드
		return studentName;
	}

	public static void main(String[] args) {
		Student studentAhn = new Student(); //스튜던트 클래스 생성
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	
	
	
	
	
}
