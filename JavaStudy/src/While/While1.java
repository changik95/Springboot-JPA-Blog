package While;
/*do{
 *  문장;
 * }while(조건식); true일시 한번 더 실행 false 일시 끝 while이랑의 차이는 do while은 최소 1번은 무조건 실행 됨
 * 조건확인이 선행인지 후행인지 의 차이임.
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
