package Switch;
import java.util.Scanner;
public class Switch2 {

	public static void main(String[] args) {
		
		/*if�� ����
		 �¾ �ظ� �Է¹޴´�. if������
		 �츦 ����Ѵ�
		 �¾ �� : 2000
		 ����Դϴ�. 
		 */
		Scanner scan = new Scanner(System.in);
		int y;
		String s = null;
		// s�� �����������̰� ��� ��ü�� ����ġ������. �����ʱ�ȭ�� ������� �׷��� null ����
		
		System.out.print("������ �Է��ϼ���.");
		y = scan.nextInt();
		
		switch(y % 12) {
		//����ġ�� ������ �־��� ���̽����� �� ��
		case 0: s = "������"; break;
		case 1: s = "��"; break;
		case 2: s = "��"; break;
		case 3: s = "����"; break;
		case 4: s = "��"; break;
		case 5: s = "��"; break;
		case 6: s = "ȣ����"; break;
		case 7: s = "�䳢"; break;
		case 8: s = "��"; break;
		case 9: s = "��"; break;
		case 10: s = "��"; break;
		case 11: s = "��"; break;
		}
	
		System.out.println(s);
			
		
/*		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("����");
			break;
		case 4:
			System.out.println("��");
			break;
		case 5:
			System.out.println("��");
			break;
		case 6:
			System.out.println("ȣ����");
			break;
		case 7:
			System.out.println("�䳢");
			break;
		case 8:
			System.out.println("��");
			break;
		case 9:
			System.out.println("��");
			break;
		case 10:
			System.out.println("��");
			break;
		case 11:
			System.out.println("��");
			break;
		default :
			break;
	*/
			
			
			
		
		
		
	}
}