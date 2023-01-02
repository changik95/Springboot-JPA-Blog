package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IOTest12 {

	public static void main(String[] args)throws Exception {
			
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("list.txt"));
		
		ArrayList<String> a = (ArrayList<String>)in.readObject(); //오브젝트타입 형변환해줘야함 
		in.close();
		System.out.println(a);
		
		
		
		
		
	}

}
