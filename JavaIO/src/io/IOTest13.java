package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class IOTest13 {

	public static void main(String[] args) throws Exception{
		Data a = new Data("aaa", 10, 1.234);
		Data b = new Data("bbb", 20, 3.456);
		Data c = new Data("ccc", 30, 9.9999);
		
		ObjectOutputStream out = null;
		
		out = new ObjectOutputStream(new FileOutputStream("data.dat"));
		out.writeObject(a);
		out.writeObject(b);
		out.writeObject(c);
		out.close();
	
	
	}

}
