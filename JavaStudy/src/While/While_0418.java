package While;
import java.util.Scanner;
public class While_0418 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		
		
		while(true) {
			//메뉴 출력
			menuPrint();
			//번호 입력받음	
			a = scan.nextInt();		
			//입력받은 번호에 따라 기능 실행
	
			
			switch (a) {
				case 1: list(); break;
				case 2: insert(); break;
				case 3: search(); break;
				case 4: delete(); break;
				case 0: System.out.println("-> \"종료하겠습니다.\""); return;
				default: System.out.println("-> \"없는 번호입니다. 다시 선택하세요.\"");
			}//switch
					
			// 잘못 입력했으면 오류메시지 출력
			// 0입력했으면 프로그램 종료
			
			
		}//while
		
	}//main

	public static void menuPrint() {
		System.out.println("[ 일정관리 ]");
		System.out.println("1. 전체 일정 보기");
		System.out.println("2. 일정 등록");
		System.out.println("3. 일정 검색");
		System.out.println("4. 일정 삭제");
		System.out.println("0. 종료");
		System.out.println("* 번호 입력 :");
		return;
	}
	public static void list() {
		System.out.println("-> \"1.전체 일정 보기 메뉴를 선택했습니다.\"");
	}
	public static void insert() {
		System.out.println("> \"2.일정 등록 메뉴를 선택했습니다.\"");
	}
	public static void search() {
		System.out.println("> \"3.일정 검색 메뉴를 선택했습니다.\"");
	}
	public static void delete() {
		System.out.println("-> \"4.일정 삭제 메뉴를 선택했습니다.\"");
	}	
		
	
}//class 
