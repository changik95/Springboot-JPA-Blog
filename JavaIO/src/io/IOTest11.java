package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class IOTest11 {

	public static void main(String[] args) throws  Exception{
		//�޸��� ������
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("������");
		list.add("123");
		
		//���Ͽ� ����
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("list.txt"));
		out.writeObject(list);
		out.close();
		
		System.out.println("����Ǿ����ϴ�.");
		
		
		
		
		
	}

}
