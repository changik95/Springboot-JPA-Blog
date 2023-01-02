package HomeWork;
//1 부터 N까지의 합계가 4000이 넘어가는 순간의 숫자 그 N이 몇이냐
//결과 1~89까지의 합계는 4005
public class For_HomeWork_2 {

	public static void main(String[] args) {

		int a;
		int sum = 0;
		
		for(a = 1; a <=100; a++) {
			sum = sum + a;
			System.out.println(a + "번째");
			System.out.println("합계 : "+ sum);
			if(sum > 4000) {
				break;
			}
		}
		System.out.println(a + "번째");
		System.out.println("합계 : "+ sum);
	}

}
