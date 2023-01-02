package exception;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest6 {

	public static void main(String[] args) throws IOException{  // 2가지방법 throws or try-catch
		char ch = 0;
		
		ch = (char) System.in.read();
		
/*		try {
			ch = (char) System.in.read(); //인트라 캐릭터형으로 형변환을 해줘야함 
		}
		catch (IOException e) { 
			e.printStackTrace();
		}
	*/	
		System.out.println("입력받은 문자 : " + ch);
		
		
		
		
		
		
		
	}

}
