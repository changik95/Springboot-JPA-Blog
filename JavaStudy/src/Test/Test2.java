package Test;

public class Test2 {
	public static void main(String[] args) {
		int count = 1;
		
		for(int a = 1; a <= 100; a++) {
			if(100 % a == 0) {
				if(count % 3 == 0) {
					System.out.println(a);
				}
				else {
					System.out.print(a + " ");
				}
				count++;
			}
		}
				
	}

}
