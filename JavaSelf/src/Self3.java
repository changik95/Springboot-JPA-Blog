import java.util.Scanner;

//		���ǹ� if 92p ~ 115p
public class Self3 {

	public static void main(String[] args) {
		
		int age = 60;
		int charge = 0;
		
		if(age >= 60) {
			charge = 0;
			System.out.println("��ο���Դϴ�.");
		}
		System.out.println("������ " + charge + "�� �Դϴ�.");
		
		//����ġ ���̽���
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("���� �Է����ּ���.");
//		int a = scan.nextInt();
//		switch(a){
//			case 1 : System.out.println("�౹�Դϴ�."); break;
//			case 2 : System.out.println("�����ܰ��Դϴ�."); break;
//			case 3 : System.out.println("�Ǻΰ��Դϴ�."); break;
//			case 4 : System.out.println("ġ���Դϴ�."); break;
//			case 5 : System.out.println("�ｺŬ���Դϴ�."); break;
//			default : System.out.println("�߸������̽��ϴ�. �ٽ� �Է����ּ���."); 
//		}
		int num = 1;
		int sum = 0;
		do {
			sum += num;
			num++;
		}while(num<=0);
		
		System.out.println("�հ�� " + sum + "�Դϴ�.");
		
	}

}
