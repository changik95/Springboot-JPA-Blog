package ArraySolt;
//인트 10칸배열에
//숫자 각각 넣어주고
//현재값출력
//모든요소들의합계출력
import java.util.Scanner;
public class ArrayTest4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A[] = new int[10];
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			A[i]=(int)(Math.random() * 10) + 1;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(A[i]+",");
		}
		System.out.println();
			
		for(int i = 0; i < 10; i++) {
			sum = sum + A[i];
		}
		
		int s,max,min;
		
		
		
		s = 0;
		max = A[0];
		min = A[0];
		double avg;
		
		for (int i = 0; i < A.length; i++) {
			s += A[i];
			max = A[i] > max ? A[i] : max;
			min = A[i] < min ? A[i] : min;
		}
		avg = (double)sum / A.length;
		
		System.out.println("합계:" + sum);
		System.out.println("평균:" + avg);
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
		
		
		
		
	}

}
