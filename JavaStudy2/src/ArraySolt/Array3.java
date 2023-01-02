package ArraySolt;

public class Array3 {

	public static void main(String[] args) {
		int ar[][] = new int[3][5];
	
		//ar = 1;
		//ar[0] = 1;
		ar[0][0] = 1;
		ar[0][1] = 2;
		ar[1][2] = 3;
		ar[1][4] = 4;
		ar[2][4] = 5;
	
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
	
	
	
	
	
	}

}
