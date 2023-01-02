package Switch;
//switch문 연습
public class Switch1 {

	public static void main(String[] args) {
		int num = 7;
		
		switch (num) {
		case 1:
			System.out.println("1선택");
			break;
		case 2:
			System.out.println("2선택");
			break;
		case 3:
			System.out.println("3선택");
			break;
		default:
			System.out.println("그 밖의 숫자");
			break;
// 스위치문은 순서가 상관없음 케이스1,3,디펄트,케이스2 여도 실행잘됨.
			/*
			 * num3 ->
		//case 3:
			System.out.println("3선택");
	      case 1:
	      	System.out.println("1선택");
			break: 
			케이스3,1나옴
			num/2 도가능 
			
*/			
		}
		
	}

}
