package While;
/*do{
 *  ����;
 * }while(���ǽ�); true�Ͻ� �ѹ� �� ���� false �Ͻ� �� while�̶��� ���̴� do while�� �ּ� 1���� ������ ���� ��
 * ����Ȯ���� �������� �������� �� ������.
 * 
 */
public class While1 {

	public static void main(String[] args) {
		int i, sum;
		sum = 0;
		// for
		for(i = 11; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		// while
		i = 11;
		sum = 0;
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	
		// do while
		i = 11;
		sum = 0;
		do {
			sum += i;
			i++;
		} while (i <= 10);
		System.out.println(sum);
		
	}
	
}
