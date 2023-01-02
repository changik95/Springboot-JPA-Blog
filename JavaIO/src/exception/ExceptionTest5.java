package exception;

public class ExceptionTest5 {

	public static void main(String[] args) {
		String num[] = {"10","aaa","25","test","***","100","1","2.35","0","1E-2"};
		int cnt = 0;
	
		for(int i = 0; i < num.length; i++) {
			try {
				Integer.parseInt(num[i]); //스트링을 펄스인트로 인트로 바꿈 
				System.out.println(num[i]); //확인
				cnt++; //카운트증가
			}
			catch (NumberFormatException e) {
			}
		}
		
		System.out.println(cnt + "개");
	}

}
