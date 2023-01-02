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
				data = (Data) in.readObject(); //(Data)�������� readObject�� 
				System.out.println(data);//��ü�� ������ ������� ������Ʈ�� �����ϱ⶧���� ����ȯ���ذ�
				
			}
		}
		catch (EOFException e) {}
		in.close();
		
		
		
		
		
		
		
		
		
	}

}
