package While;
import java.util.Scanner;
public class While_0418 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		
		
		while(true) {
			//�޴� ���
			menuPrint();
			//��ȣ �Է¹���	
			a = scan.nextInt();		
			//�Է¹��� ��ȣ�� ���� ��� ����
	
			
			switch (a) {
				case 1: list(); break;
				case 2: insert(); break;
				case 3: search(); break;
				case 4: delete(); break;
				case 0: System.out.println("-> \"�����ϰڽ��ϴ�.\""); return;
				default: System.out.println("-> \"���� ��ȣ�Դϴ�. �ٽ� �����ϼ���.\"");
			}//switch
					
			// �߸� �Է������� �����޽��� ���
			// 0�Է������� ���α׷� ����
			
			
		}//while
		
	}//main

	public static void menuPrint() {
		System.out.println("[ �������� ]");
		System.out.println("1. ��ü ���� ����");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �˻�");
		System.out.println("4. ���� ����");
		System.out.println("0. ����");
		System.out.println("* ��ȣ �Է� :");
		return;
	}
	public static void list() {
		System.out.println("-> \"1.��ü ���� ���� �޴��� �����߽��ϴ�.\"");
	}
	public static void insert() {
		System.out.println("> \"2.���� ��� �޴��� �����߽��ϴ�.\"");
	}
	public static void search() {
		System.out.println("> \"3.���� �˻� �޴��� �����߽��ϴ�.\"");
	}
	public static void delete() {
		System.out.println("-> \"4.���� ���� �޴��� �����߽��ϴ�.\"");
	}	
		
	
}//class 
