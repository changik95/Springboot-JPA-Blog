package ForWhile;
//1 ���� N������ �հ谡 4000�� �Ѿ�� ������ ���� �� N�� ���̳�
//��� 1~89������ �հ�� 4005
public class ForWhile3 {

	public static void main(String[] args) {

		int a = 1;
		int sum = 0;
		while(a <= 100) {
			sum = sum + a;
			a++;
			if(sum > 4000) {
				break;
			}
		}
		System.out.println(a + "��°");
		System.out.println( "�հ� : "+ sum);
	}

}
