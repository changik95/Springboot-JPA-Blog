import java.util.Scanner; 
public class InputTest4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		double height;
		String address;
		
		System.out.print("�ּ� :"); // Line�� ���� ���ο��� ������ �ֿ��԰� ���鹮�ڵ� ������
		address = scan.nextLine();  // �Է¹��ۿ��� ���鹮�ڸ� �Է¹����� ����� enter,tab space bar
		System.out.print("�̸� :");
		name = scan.next();
		System.out.print("���� :");
		age = scan.nextInt();
		System.out.print("Ű :");
		height = scan.nextDouble();
		
		System.out.println(address);
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
		
		
		
		
		
		
		
	}

}
