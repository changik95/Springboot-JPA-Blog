package staticex;

public class Student3 {
	
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int cardNumber;
	
	public Student3() {
		serialNum++;
		studentID = serialNum;
		cardNumber = studentID + 100;
	}
	
	public String getstudentName() {
		return studentName;
	}
	
	public void setstudentName(String name) {
		studentName = name;
	}

	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}
}
