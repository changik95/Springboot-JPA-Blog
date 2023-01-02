package For;
// 1단 ~ 9단까지 출력
public class For3_2 {

	public static void main(String[] args) {
		int a,b,c;
		
		for (a = 1; a <= 9; a++) {
			for (b = 1; b <= 9; b++) {
				System.out.println(a + "*" + b + "=" + a * b);
			}
		}
		
	}
	

}
