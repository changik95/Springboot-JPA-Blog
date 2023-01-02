package staticex;

public class Student2 {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;
//		studentName = "이지원"; 멤버변수, 인스턴트 생성될때 만들어지는 인스턴스 변수기때문에 에러, 클래스메서드와변수는 인스턴스 유무상관없이 사용가능
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum; 
	}
	
}

