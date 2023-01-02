package Method;
//�л� 1�� ���� ������ ǥ��
public class Student {

	//������� ����(�й�,�̸����)
	private String Num;
	private String Name;
	private int Kor;
	private int Eng;
	private int Mat;
	
	//������

	public Student() {
	}
		
	public Student(String Num, String Name, int Kor,int Eng,int Mat) {
		this.Num = Num;
		this.Name = Name;
		this.Kor = Kor;
		this.Eng = Eng;
		this.Mat = Mat;
	}
		
	
	
	//getter setter
	public String getNum() {
		return Num;
	}
	public void setNum(String Num) {
		this.Num = Num; 
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public int getKor() {
		return Kor;
	}
	
	public void setKor(int Kor) {
		this.Kor = Kor;
	}
	
	public int getEng() {
		return Eng;
	}
	
	public void setEng(int Eng) {
		this.Eng = Eng;
	}
	
	public int getMat() {
		return Mat;
	}
	
	public void setMat(int Mat) {
		this.Mat = Mat;
	}
	
	// ���� ��� ����� ���ϴ� �޼ҵ�
	
	public int getTot() {
		int t = Kor + Eng + Mat;
		return t;
	}
	
	
	public double getAvg() {
		double a = getTot()/3;
		return a;
	}
	
	
	public String getGrade() {
		String g = "F";
		double a = getAvg();
		
		if (a >= 90) g = "A";
		else if (a >= 80)	g = "B";
		else if (a >= 70) 	g = "C";
		else if (a >= 60) 	g = "D";
		
		return g;
		
	}
		
	//����� ����ϴ� �޼ҵ� 	
	
	public void output() {
		System.out.println("�й�:" + Num + ", �̸�:" + Name + ", ��������:" + Kor + ", ��������:" + Mat + ", �������� :" + Eng);
	}
	
}