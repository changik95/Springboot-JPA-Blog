package Switch;
import java.util.Scanner;
public class Switch2 {

	public static void main(String[] args) {
		
		/*if문 연습
		 태어난 해를 입력받는다. if문숫자
		 띠를 출력한다
		 태어난 해 : 2000
		 용띠입니다. 
		 */
		Scanner scan = new Scanner(System.in);
		int y;
		String s = null;
		// s는 참조변수형이고 어느 객체를 가르치고있음. 변수초기화를 해줘야함 그래서 null 넣음
		
		System.out.print("연도를 입력하세요.");
		y = scan.nextInt();
		
		switch(y % 12) {
		//스위치에 계산식을 넣어줌 케이스에는 그 값
		case 0: s = "원숭이"; break;
		case 1: s = "닭"; break;
		case 2: s = "개"; break;
		case 3: s = "돼지"; break;
		case 4: s = "쥐"; break;
		case 5: s = "소"; break;
		case 6: s = "호랑이"; break;
		case 7: s = "토끼"; break;
		case 8: s = "용"; break;
		case 9: s = "뱀"; break;
		case 10: s = "양"; break;
		case 11: s = "말"; break;
		}
	
		System.out.println(s);
			
		
/*		case 1:
			System.out.println("닭");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("돼지");
			break;
		case 4:
			System.out.println("쥐");
			break;
		case 5:
			System.out.println("소");
			break;
		case 6:
			System.out.println("호랑이");
			break;
		case 7:
			System.out.println("토끼");
			break;
		case 8:
			System.out.println("용");
			break;
		case 9:
			System.out.println("뱀");
			break;
		case 10:
			System.out.println("양");
			break;
		case 11:
			System.out.println("말");
			break;
		default :
			break;
	*/
			
			
			
		
		
		
	}
}