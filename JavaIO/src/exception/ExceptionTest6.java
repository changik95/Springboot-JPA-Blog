package exception;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest6 {

	public static void main(String[] args) throws IOException{  // 2������� throws or try-catch
		char ch = 0;
		
		ch = (char) System.in.read();
		
/*		try {
			ch = (char) System.in.read(); //��Ʈ�� ĳ���������� ����ȯ�� ������� 
		}
		catch (IOException e) { 
			e.printStackTrace();
		}
	*/	
		System.out.println("�Է¹��� ���� : " + ch);
		
		
		
		
		
		
		
	}

}
