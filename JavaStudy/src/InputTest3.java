import java.util.Scanner; //필수

public class InputTest3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //필수
		int a, b, c, d;
		double e;
				
		
		System.out.print("국어점수  : ");
		a = scan.nextInt();
		System.out.print("수학점수  : ");
		b = scan.nextInt();
		System.out.print("영어점수  : ");
		c = scan.nextInt();
		
		d = a + b + c ;
		System.out.println("총점 : " + d);
		e =(double)d / 3;
		System.out.println("평균 : " + e);
		//System.out.printf(); 검색해보기
		
		

	}

}


// 국어 100 수학 100 영어 70 총점 270 평균90.0