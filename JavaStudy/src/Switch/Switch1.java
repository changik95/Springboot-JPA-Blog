package Switch;
//switch�� ����
public class Switch1 {

	public static void main(String[] args) {
		int num = 7;
		
		switch (num) {
		case 1:
			System.out.println("1����");
			break;
		case 2:
			System.out.println("2����");
			break;
		case 3:
			System.out.println("3����");
			break;
		default:
			System.out.println("�� ���� ����");
			break;
// ����ġ���� ������ ������� ���̽�1,3,����Ʈ,���̽�2 ���� �����ߵ�.
			/*
			 * num3 ->
		//case 3:
			System.out.println("3����");
	      case 1:
	      	System.out.println("1����");
			break: 
			���̽�3,1����
			num/2 ������ 
			
*/			
		}
		
	}

}
