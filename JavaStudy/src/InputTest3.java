import java.util.Scanner; //�ʼ�

public class InputTest3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //�ʼ�
		int a, b, c, d;
		double e;
				
		
		System.out.print("��������  : ");
		a = scan.nextInt();
		System.out.print("��������  : ");
		b = scan.nextInt();
		System.out.print("��������  : ");
		c = scan.nextInt();
		
		d = a + b + c ;
		System.out.println("���� : " + d);
		e =(double)d / 3;
		System.out.println("��� : " + e);
		//System.out.printf(); �˻��غ���
		
		

	}

}


// ���� 100 ���� 100 ���� 70 ���� 270 ���90.0