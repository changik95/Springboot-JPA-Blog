package Method;
//���� ó�� ���α׷�	
public class StudentTest {

	public static void main(String[] args) {
		Student a = new Student();
		a.output(); // null,null,0, 0, 0 ���
		
		Student b = new Student("111111", "ȫ�浿", 100, 100, 100);
		b.output(); // 111111 ȫ�浿 100 100 100 ���
		
		a.setNum("22222");  //�й�����
		a.setName("��ö��");  //�̸�����
		a.setKor(90);		//�������� ����
		a.setEng(85);		//�������� ����
		a.setMat(80);		//�������� ����	
		a.output();			//����� ���� ��µ�
		
		System.out.println(a.getTot()); //���� ����
		System.out.println(a.getAvg()); //������� ����
		System.out.println(a.getGrade()); //A~F��� ����
		
		
	}

}
