//주소록의 화면, 사용자의 입력 & 출력
/*
  [ 주소록 ]
  1. 주소 등록
  2. 주소 삭제
  3. 주소 수정
  4. 주소 검색
  0. 종료
    선택 : 5
    다시 입력하세요 : a
    다시 입력하세요 : 1
    
  [ 주소 등록 ]
    이름 : 
 */

package address.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import address.dao.AddressDAO;
import address.vo.AddressVO;

public class AddressUI {
	Scanner scan = new Scanner(System.in); //이렇게 선언시 여러 메소드에서 이 스캔변수를 모두 사용가능함
	AddressDAO dao = new AddressDAO();
	
	public AddressUI() {
		
		while (true) { //while(true)안끝나는 반복문
			menuPrint();    //메뉴 출력
			
			int a = 0;
				
			try {
				 a = scan.nextInt();	//번호 입력
			}catch (InputMismatchException ime) {
				System.out.println("다시 입력하세요.");
				scan.nextLine(); //버퍼에 엔터친부분까지 싹 긁어와서 없앰
				continue; // 반복문을 다시 위로 올림
			}
			
		//오류처리 또는 기능 실행	
			
			switch (a) {
				case 1: input(); break;
				case 2: delete(); break;
				case 3: update(); break;
				case 4: search(); break;
				case 0:
					dao.save();
					System.out.println("-> \"종료하겠습니다.\""); 
					return;
				default : System.out.println("다시 입력하세요."); 

			}//switch 끝
				
		}//while 끝
		
	}//addressUI 끝

		

	//메뉴 출력
	void menuPrint() {
		System.out.println("[ 주소록 ]");
		System.out.println("1. 주소 등록");
		System.out.println("2. 주소 삭제");
		System.out.println("3. 주소 수정");
		System.out.println("4. 주소 검색");
		System.out.println("0. 종료");
		System.out.println("* 선택 : ");
		return;
	}
		//주소 입력
		void input() {
			System.out.println("-> \"1.주소 등록 메뉴를 선택했습니다.\"");
			scan.nextLine();
			String  n, p, e;
			System.out.print("이름  : ");
			n = scan.nextLine();
			System.out.print("전화번호 : ");
			p = scan.nextLine();
			System.out.print("이메일 : ");
			e = scan.nextLine();
			
			AddressVO vo = new AddressVO(n,p,e); //입력받은 내용을 VO객체에 저장
			boolean res = dao.input(vo); //AddressDAO클래스의 input()메소드로 전달
			if(res) {
				System.out.println("저장되었습니다.");
			}
			else {
				System.out.println("이미 저장된 이름입니다.");
			}
				
		}
		//주소 삭제
		void delete() {
			System.out.println("> \"2.주소 삭제 메뉴를 선택했습니다.\"");
			scan.nextLine();
			//삭제할 이름 입력받음
			System.out.print("삭제할 이름을 입력해주세요.");
			String name = scan.nextLine();
			
			//AddressDAO클래스의 삭제 메소드로  String 타입의 이름전달하여 삭제
			
			//삭제 여부를 boolean 타입으로 리턴받아 결과 메시지 출력
			boolean res = dao.delete(name); 
			if(res) {
				System.out.println("삭제되었습니다.");
			}
			else {
				System.out.println("없는이름입니다.");
			}
		}
		//주소 수정
		void update() {
			System.out.println("> \"3.주소 수정 메뉴를 선택했습니다.\"");
			scan.nextLine();
			String  n, p, e;
			//수정할 이름, 전화번호, 이메일을 입력받아 AddressVO 객체 생성
			System.out.print("이름  : ");
			n = scan.nextLine();
			System.out.print("전화번호 : ");
			p = scan.nextLine();
			System.out.print("이메일 : ");
			e = scan.nextLine();
			
			//AddressDAO의 수정메소드로 AddressVO 객체 전달하여 수정
			AddressVO vo = new AddressVO(n,p,e); 
			boolean res = dao.update(vo); 
			if(res) {
				System.out.println("수정되었습니다.");
			}
			else {
				System.out.println("없는 이름입니다.");
			}
			
		}
			//수정 여부 boolean 타입으로 리턴받아 결과 메세지 출력
		//주소 검색
		void search() {
			System.out.println("-> \"4.주소 검색 메뉴를 선택했습니다.\"");
			
			System.out.println("검색할 이름: ");
			String name = scan.nextLine();
			
			ArrayList<AddressVO> list = dao.search(name);
			
			for (AddressVO vo : list) {
				System.out.println(vo.getName() + "\t" + vo.getPhone() + 
						"\t" + vo.getEmail());
				
			}
		}	
	}
//오류처리 또는 기능실행
