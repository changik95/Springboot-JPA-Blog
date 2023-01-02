package io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		File a = new File("C:\\Program Files\\Java\\jdk1.8.0_311");			//�����ϴ� ���丮
		File b = new File("C:\\Program Files\\Java\\jdk1.8.0_311\\jmc.txt"); //�����ϴ� ����
		File c = new File("./sub");				//���� ���丮
		File d = new File("a.txt");				//���� ����
		
		System.out.println(a.exists()); 	 //����� ������ �����ϴ���
		System.out.println(a.isDirectory()); //���丮�ν� �����ϴ���
		System.out.println(a.isFile());		 //���Ϸ� �����ϴ���
		System.out.println(a.canRead());	 //�б� ��������
		
		System.out.println(b.length());		 //���� ũ��(����Ʈ)
		System.out.println(new Date(b.lastModified()));//������ �����ð�
		System.out.println(b.getName());	 //���� �̸�
		System.out.println(b.getParent());	 //���� �������
		
		System.out.println(c.getAbsolutePath()); //������ ���ϱ�
		try {
			System.out.println(c.getCanonicalPath()); //������ ���ϱ�
			File e = new File("."); //������ġ
			System.out.println(e.getCanonicalPath());
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
	
		//���� �߰� �� ����
		
		boolean res = c.mkdir();
		if (res) {
			System.out.println(c.getName() + " ������");
		}
		else {
			System.out.println("���� ���� ����");
		}
//		boolean del = c.delete();
//		if (del) {
//			System.out.println(c.getName() + " ������");
//		}
//		else {
//			System.out.println("���� ����");
//		}
	
//		try {
//			res = d.createNewFile();
//			if (res) {
//				System.out.println(d.getName() + " ������");
//			}
//			else {
//				System.out.println("���� ���� ����");
//			}
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		boolean del2 = d.delete();
//		if (del2) {
//			System.out.println(d.getName() + " ������");
//		}
//		else {
//			System.out.println("���� ����");
//		}
		
		//���ϸ� ����

		File f = new File("a2.txt");
		d.renameTo(f);
		
		
		
		
	}

}
