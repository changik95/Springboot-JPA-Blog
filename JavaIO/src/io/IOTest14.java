package io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class IOTest14 {

	public static void main(String[] args) throws Exception{
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.dat"));
		Data data;
		
		try {
			while (true) {
				data = (Data) in.readObject(); //(Data)해준이유 readObject는 
				System.out.println(data);//객체의 종류와 상관없이 오브젝트로 리턴하기때문에 형변환해준거
				
			}
		}
		catch (EOFException e) {}
		in.close();
		
		
		
		
		
		
		
		
		
	}

}
