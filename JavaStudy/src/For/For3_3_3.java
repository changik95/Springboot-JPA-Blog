package For;

public class For3_3_3 {

	public static void main(String[] args) {
		int a,b,c;
		
		for (a = 1; a <= 9; a = a+3) {
			for(c = a; c <=a + 2; c++){
				System.out.print(c + "´Ü" + "\t");
			}
			System.out.println();
			for (b = 1; b <= 9; b++) {
				for (c = a; c <= a+2; c++) {
					System.out.print(c+ "*" + b+ "=" + c * b + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}

}
