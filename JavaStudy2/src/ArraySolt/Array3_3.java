package ArraySolt;

public class Array3_3 {

	public static void main(String[] args) {
		
		
	/*	int ar[][] = new int[3][4];
		int br[] =  new int[3];
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = (int)(Math.random() * 100);
			}
		}
		for (int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
			br[i] += ar[i][j];
			}
		}
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println(" -> " + br[i]);
		}
		*/
		
		int ar[];
		int n,i,j;
		
		ar = new int[6];
		out:
		for(i = 0; i < ar.length; i++) {
			n = (int)(Math.random() * 10 + 1);
			//같은번호가 있는지 확인
			for(j = 0; j < i; j++) {
				if (ar[j] == n) {
					i--;
					continue out;
				}
			}
			ar[i] = n;	
		}
		
		//출력
		for (i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
		
	}
}


