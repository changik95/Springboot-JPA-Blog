package HomeWork;
/*
 �� ������ �ݾ��� �Է¹���. �޷� �Ǵ� ��ȭ �Ǵ� ����ȭ ������ ��ȯ�ؼ� ����Ѵ�.
 1�޷� = õ�� / �������� ��Ʈ���� �޷��� ����� �ϸ��.
 ���� ex :
 �ݾ� �Է�(��) : 10000�� = ��ĳ��
 ȯ���� ȭ�� (1-�޷�, 2-��ȭ, 3-����): 3 ��ĳ�� �Է� = ��Ʈ�� �����ϳ� ����Ʈ���� ����ؾ��� 
 10000���� 9�޷��Դϴ�. = 1,2,3���� ���� �ٸ��� ���� ������� if or switch , ��� �� �ݾ��� �Ҽ��� �Ʒ�����
 */
import java.util.Scanner;
public class HomeWork0407_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w;
		double h,a,b,c;
		
		// w �ݾ� , h ȭ��
		
		System.out.println("�ݾ��� �Է��ϼ���.");
		w = scan.nextInt();
		System.out.println("ȭ�� �����ϼ���. 1 = �޷� , 2 = ��ȭ , 3 = ����");
		h = scan.nextInt();
		
		
		if(h == 1) {
			a = w/1219.5;
			System.out.println(String.format("%.2f",a) + "�޷�");
		}
		else if(h == 2) {
			b = w / 985.89;
			System.out.println(String.format("%.2f",b) + "��");
		}
		else if(h == 3){
			c = w / 1332.55;
			System.out.println(String.format("%.2f",c) + "����");
		}
		else{
			System.out.println("�Է� �����Դϴ�.");
		}
				
			
		
		
		
		
	}

}
