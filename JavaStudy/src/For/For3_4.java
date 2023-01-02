package For;
//3중포문  1x1 2x1 3x1 가로3세로9를  총3번
//      1x2 2x2 3x2
public class For3_4 {
	public static void main(String[] args) {

	int a,b,c;
	
	for (a = 1; a <= 9; a = a+3) {
		System.out.println();
		for (b = 1; b <= 9; b++) {
			System.out.println();
			for (c = a; c <= a+2; c++) {
				System.out.print(c + "*" + b + "=" + c * b + "\t");
			}
			
		}
		System.out.println();
	}
		
		
		
	}

}
