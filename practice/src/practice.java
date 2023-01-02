import java.util.Arrays;
import java.util.Comparator;
public class practice {
	public static void main(String[] args) {
		
		int input = 8;
		
		for(int i = 1; i<= input; i++) {
			System.out.println(fibo(i));
		}
		
	}
	
	public static int fibo(int n) {
		if(n <=2) {
			return 1;
		}
		else
			return fibo(n - 1) + fibo(n - 2);
	}
}
