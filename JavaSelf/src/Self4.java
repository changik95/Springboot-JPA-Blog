//for문 생략 116p~
public class Self4 {

	public static void main(String[] args) {
		
//		// 초기화식 생략
//		int i = 0;
//		for( ; i < 5; i++) {
//			
//		}
//		// 조건식 생략
//		for(i = 0; ; i++) {
//			
//		}
		// 증감식 생략 ㅄ같음
//		int i = 0;
//		for(i = 0; i <5; ) {
//			i = (++i) % 10;
//		}
		// 무한반복
		int i = 0;
		int num = 0; 
		for( ; ; ) {
			i++;
			num+=i;
			System.out.println(i);
			System.out.println(num);
			if(i >= 10) {
				break;
			}
		}
		
		
		
		
		
		
	}

}
