package For;

public class For5 {

	public static void main(String[] args) {
		int i,j,k;
		
/*		System.out.println("a");
		out:
		for (i = 0; i < 5; i++) 
		{
			System.out.println("b");
			for (j = 0; j < 5; j++)  //a b c c e
			{
				if (j == 2) break out; //레이블 포문
				System.out.println("c");
			}
			System.out.println("d");
		}
		System.out.println("e");
 */
/*
		for(i = 1; i <= 5; i++) {
			for (j = 1; j <= 5 ; j++) {
					System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------");
// 1 2 3 4 5 5줄		
	
		for(i = 5; i >= 1; i--) {
			for (j = 5; j >= 1 ; j--) {
					System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------");
// 5 4 3 2 1 5줄	
		
		for(i = 1; i <= 5; i++) {
			for (j = i; j <= 5 ; j++) {
			
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------");

 1 2 3 4 5
 * 2 3 4 5
 * 3 4 5
 * 4 5
 * 5		
 */ 
		for(i = 5; i > 0; i--) {
			for (j = 1; j <= i ; j++) {
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------");
	
/* 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2 
 * 1 
 */
		
		for(i = 1; i <= 5; i++) {
			for (j = i; j <= i + 4; j++) {
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------");
		
/*1 2 3 4 5
 *2 3 4 5 6
 *3 4 5 6 7
 *4 5 6 7 8
 *5 6 7 8 9 
 *
 * 			
 */	
 			for(i = 1; i <= 5; i++) {
 				for (j = 1; j <= 5 ; j++) {
 					if(i == j)
 						System.out.print(1 + " ");
 					else
 						System.out.print(0 + " ");
 				}
 				System.out.println();
 			}
 			System.out.println("----------"); 
				
 
/* 1 0 0 0 0
 * 0 1 0 0 0
 * 0 0 1 0 0
 * 0 0 0 1 0
 * 0 0 0 0 1
 * 
 * 
 *
 */
 		for(i = 0; i < 5; i++) {
			for (j = 1; j <= 5 ; j++) {
				System.out.print(i*5+j + " ");
			}
			System.out.println();
 		}
 		System.out.println("----------");
				
 
 
 
 
/* 
 * 1 2 3 4 5
 * 6 7 8 9 10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25
 * 
 * 
 * 
 * 
 * 		
 *		
*		
*/		
	}

}
