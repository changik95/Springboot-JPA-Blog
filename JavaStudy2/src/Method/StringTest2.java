package Method;
import java.util.Scanner;
public class StringTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id;
		String a,c,q;
		String h;
		String m;
		int sum;
		System.out.print("�ֹε�Ϲ�ȣ �Է� (000000-0000000 ����) : ");
		id = scan.next();
	
	
		//900101-1234567 �Է��� ���
		//90��� ����
		if(id.length() != 14) {
			System.out.println("���� ���� 14�ڸ��� �ƴմϴ�.");
			return;
		}
		if(id.indexOf('-') != 6) {
			System.out.println("�߸��� �����Դϴ�. '-' �� ��ġ�� Ȯ���ϼ���.");
			return;
		}
		
		
		
		h = id.substring(7,8);
		int k = Integer.parseInt(h);
		if(k < 5) {
		} 
		else if(k <= 0){
			System.out.println("�� �ڸ� ��ȣ�� Ʋ�Ƚ��ϴ�. �Է��Ͻ� ����"+ h);
			return;
		}
		else if(k >= 5){
			 System.out.println("�� �ڸ� ��ȣ�� Ʋ�Ƚ��ϴ�.(1,2,3,4)���� ���ڸ� �Է��ϼ���. �Է��Ͻ� ����"+ h );
			 return;
		 }
		a = id.substring(2,4);
		 int b = Integer.parseInt(a);
		if(b > 12) {
			System.out.println("�� �Է��� �߸��Ǿ����ϴ�. �Է��Ͻ� ���� " +b);
			return;
		}
		c = id.substring(4,6);
		int d = Integer.parseInt(c);
		if(d > 31) {
			System.out.println("�� �Է��� �߸��Ǿ����ϴ�. �Է��Ͻ� ���� "+d);
			return;
		}
		System.out.println("���̰��� - ������ �Է��ϼ���. ex) 1995 ");
		int w = scan.nextInt();
		
		sum = 0;
		sum = 2022 - w+1;
		
		System.out.print(id.substring(0,2)+"��"+b+"��"+d+"�ϻ� ");
		System.out.print(sum+"�� ");
		if(k == 1 || k == 3) {
			System.out.print("����");
		}
		else {
			System.out.print("����");
		}
				
		

		
		
		
		
		//��Ÿ �߸��Է��� ��� Ȯ�� �� �� �ٸ���� , ���ڸ� ù�ڸ��� 1 2 3 4 �� �ƴ� �ٸ���
		
		// 900101-1234567 �Է��� ��� ������ ���� ���
		// 90�� 1�� 1�ϻ� 32�� ����
		
		
		
	}

}
