package If;
import java.util.Scanner;
public class If2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int y;      //�Է¹��� ����

		System.out.print("������ �Է��ϼ���.");
		y = scan.nextInt();
		
		// 4�⸶�� ����. 100�⸶�� �ǳʶ�. 400�⸶�� ������ ����.
		// 4�� ����̸鼭 100�� ����� �ƴϰ� , 400�� ���
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("������ �ƴմϴ�.");
		}
		
		
		
		
	
	
	
	
	
	
	
	
	}

}
