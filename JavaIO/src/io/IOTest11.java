package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class IOTest11 {

	public static void main(String[] args) throws  Exception{
		//메모리의 데이터
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("가나다");
		list.add("123");
		
		//파일에 저장
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("list.txt"));
		out.writeObject(list);
		out.close();
		
		System.out.println("저장되었습니다.");
		
		
		
		
		
	}

}
