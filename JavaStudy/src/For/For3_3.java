package For;
// 1x1=1 ~ 9x1=9
// 1x2=2 ~ 9x2=18 이런식으로 한층씩 내려감 
public class For3_3 {

	public static void main(String[] args) {
		int a,b,c;
			for(a = 1; a <= 9; a++){
				for(b = 1; b <= 9; b++) {
					System.out.print(b + "*" + a + "=" + b * a);
					System.out.print(" ");
					if(b == 9) {
						System.out.println();
					}
				}
			}
				
				
	
	}

}
