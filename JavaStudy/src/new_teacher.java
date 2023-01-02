
public class new_teacher {

	public static void main(String[] args) {
		/*
		키워드 - 자바에서 예약한 단어들 
		식별자 - 프로그래머가 만들어서 쓰는이름들(클래스명, 메소드명, 변수명, ...)
		식별자 주의점 : 키워드 사용불가, 문자 또는 $, _로 시작. 공백불가.  
		캐멀케이스 getName
		스네이크케이스 a_bc
		클래스 - 자바 프로그램의 최소 단위
		메소드 - 함수. 기능의 최소 단위
		변수 - 값을 저장하는곳
		
		*/
		int a;
		int b, c; //변수 동시선언
		// ctrl +/ 주석처리 해버리기
		// alt + 방향키
		// ctrl + alt 한줄씩 복붙
		// ctrl + d 줄 삭제
		// ctrl + z 실행취소
		// ctrl + y 재실행
		// 에러 확인시 이니셜이란 단어가 나올 시 100% 초기화를 안한 것 .
		// 자바에서 class는 설계도임 . 클래스를 정의하고 객체를 생성해야 그 안에있는 메소드도 사용가능함.
		// static은 객체 없이 호출할 수 있는 메소드 변수
	
		a = 1;
		b = 2;
		c = a + b;
		System.out.println(a + b + c);
		System.out.println(a + "," +b + "" + c);
		
		
	}

}
