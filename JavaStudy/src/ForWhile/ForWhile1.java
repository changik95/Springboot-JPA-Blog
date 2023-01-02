package ForWhile;
//for -> while , do while 변경해보기 

public class ForWhile1 {
	public static void main(String[] args) {
		int a,b;
		a = 0;
		//2 4 6 8 10
		while(a < 10) {
			a++;
			if(a % 2 == 0) {
				System.out.print(a+" ");
			}
		}
		System.out.println();
		
		a = 0;
		do {
			a+=2;
			System.out.print(a+ " ");
		}while(a < 10);
		
		System.out.println();
		//1 10 100 1000 10000 출력	
		
		a = 1;
		while(a <= 10000) {
			System.out.print(a + " ");

			a = a * 10;
		}
		System.out.println();
		a = 1;	
		do {
			System.out.print(a + " ");
			a = a * 10;
		}while(a <= 10000);
		
		System.out.println();

		
		
		
	}

}
