package Method;
//성적 처리 프로그램	
public class StudentTest {

	public static void main(String[] args) {
		Student a = new Student();
		a.output(); // null,null,0, 0, 0 출력
		
		Student b = new Student("111111", "홍길동", 100, 100, 100);
		b.output(); // 111111 홍길동 100 100 100 출력
		
		a.setNum("22222");  //학번변경
		a.setName("김철수");  //이름변경
		a.setKor(90);		//국어점수 변경
		a.setEng(85);		//영어점수 변경
		a.setMat(80);		//수학점수 변경	
		a.output();			//변경된 값들 출력됨
		
		System.out.println(a.getTot()); //총점 리턴
		System.out.println(a.getAvg()); //평균점수 리턴
		System.out.println(a.getGrade()); //A~F등급 리턴
		
		
	}

}
