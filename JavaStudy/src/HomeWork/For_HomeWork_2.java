package HomeWork;
//1 ���� N������ �հ谡 4000�� �Ѿ�� ������ ���� �� N�� ���̳�
//��� 1~89������ �հ�� 4005
public class For_HomeWork_2 {

	public static void main(String[] args) {

		int a;
		int sum = 0;
		
		for(a = 1; a <=100; a++) {
			sum = sum + a;
			System.out.println(a + "��°");
			System.out.println("�հ� : "+ sum);
			if(sum > 4000) {
				break;
			}
		}
		System.out.println(a + "��°");
		System.out.println("�հ� : "+ sum);
	}

}
