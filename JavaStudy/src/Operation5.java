
public class Operation5 {

	public static void main(String[] args) {
		// ���� ������ : ++(1����), --(1����)
		// postfix : �� ���� �� ����
		// prepix : �� ���� �� ����
		int num1 = 2;
		int num2 = 3;
		int num3 = 0;
/*		System.out.println(num1);
		System.out.println(num1++); //postfix
		System.out.println(num1);
		System.out.println(++num1); //prefix
		System.out.println(num1); */
		num1++;
		num3 = ++num1 + num2--;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
	
	
	
	}

}
