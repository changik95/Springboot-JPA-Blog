package ForWhile;
//1 부터 N까지의 합계가 4000이 넘어가는 순간의 숫자 그 N이 몇이냐
//결과 1~89까지의 합계는 4005
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
		System.out.println(a + "번째");
		System.out.println( "합계 : "+ sum);
	}

}
