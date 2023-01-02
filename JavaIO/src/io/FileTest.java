package io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		File a = new File("C:\\Program Files\\Java\\jdk1.8.0_311");			//존재하는 디렉토리
		File b = new File("C:\\Program Files\\Java\\jdk1.8.0_311\\jmc.txt"); //존재하는 파일
		File c = new File("./sub");				//없는 디렉토리
		File d = new File("a.txt");				//없는 파일
		
		System.out.println(a.exists()); 	 //대상이 실제로 존재하는지
		System.out.println(a.isDirectory()); //디렉토리로써 존재하는지
		System.out.println(a.isFile());		 //파일로 존재하는지
		System.out.println(a.canRead());	 //읽기 가능한지
		
		System.out.println(b.length());		 //파일 크기(바이트)
		System.out.println(new Date(b.lastModified()));//마지막 수정시간
		System.out.println(b.getName());	 //파일 이름
		System.out.println(b.getParent());	 //파일 상위경로
		
		System.out.println(c.getAbsolutePath()); //절대경로 구하기
		try {
			System.out.println(c.getCanonicalPath()); //절대경로 구하기
			File e = new File("."); //현재위치
			System.out.println(e.getCanonicalPath());
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
	
		//파일 추가 및 삭제
		
		boolean res = c.mkdir();
		if (res) {
			System.out.println(c.getName() + " 생성됨");
		}
		else {
			System.out.println("폴더 생성 실패");
		}
//		boolean del = c.delete();
//		if (del) {
//			System.out.println(c.getName() + " 삭제함");
//		}
//		else {
//			System.out.println("삭제 실패");
//		}
	
//		try {
//			res = d.createNewFile();
//			if (res) {
//				System.out.println(d.getName() + " 생성됨");
//			}
//			else {
//				System.out.println("폴더 생성 실패");
//			}
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		boolean del2 = d.delete();
//		if (del2) {
//			System.out.println(d.getName() + " 삭제함");
//		}
//		else {
//			System.out.println("삭제 실패");
//		}
		
		//파일명 변경

		File f = new File("a2.txt");
		d.renameTo(f);
		
		
		
		
	}

}
