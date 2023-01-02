// 변수란 무엇일까?  39p~69p

public class Self1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int level;  // int 자료형 level 변수명 , 정수형 변수 level을 선언
		level = 10; // 값 10을 level 변수에 대입
		
		
		short Sval = 10; //프로그램이 실행되어 정수 값을 연산할땐 자동으로 int 값으로 변환함
		byte Bval = 20;
		System.out.println(Sval + Bval);
		
		//상수(final) 선언하기  상수 = 변하지 않는 값
		
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
//		MAX_NUM = 1000; 에러나옴 final은 값을 고정시킴 

//		리터럴 = 프로그램에서 사용하는 모든 숫자 문자 논리값
	
//		명시적 형 변환 (강제)
		int iNum = 10;
		byte bNum = (byte)iNum; //강제로 int값을 byte값에 넣어줌
		
		int aNum = 1000;
		byte eNum = (byte)aNum; //바이트는 -128~127 까지가 범위인데, 넘었기때문에 자료손실이 발생해 -24로 출력됨
		
		System.out.println(eNum);
	
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		int iNum3 = (int)dNum1 + (int)fNum2;//두 실수가 각각 형변환 후 더함
		int iNum4 = (int)(dNum1 +fNum2); //둘다 더해지고 형변환이 이루어짐
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		
		
		
		
		
		
		
	}

}
