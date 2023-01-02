package Method;
import java.util.Scanner;
public class StringTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id;
		String a,c,q;
		String h;
		String m;
		int sum;
		System.out.print("주민등록번호 입력 (000000-0000000 형식) : ");
		id = scan.next();
	
	
		//900101-1234567 입력한 경우
		//90년생 남자
		if(id.length() != 14) {
			System.out.println("글자 수가 14자리가 아닙니다.");
			return;
		}
		if(id.indexOf('-') != 6) {
			System.out.println("잘못된 형식입니다. '-' 의 위치를 확인하세요.");
			return;
		}
		
		
		
		h = id.substring(7,8);
		int k = Integer.parseInt(h);
		if(k < 5) {
		} 
		else if(k <= 0){
			System.out.println("뒷 자리 번호가 틀렸습니다. 입력하신 숫자"+ h);
			return;
		}
		else if(k >= 5){
			 System.out.println("뒷 자리 번호가 틀렸습니다.(1,2,3,4)중의 숫자를 입력하세요. 입력하신 숫자"+ h );
			 return;
		 }
		a = id.substring(2,4);
		 int b = Integer.parseInt(a);
		if(b > 12) {
			System.out.println("월 입력이 잘못되었습니다. 입력하신 숫자 " +b);
			return;
		}
		c = id.substring(4,6);
		int d = Integer.parseInt(c);
		if(d > 31) {
			System.out.println("일 입력이 잘못되었습니다. 입력하신 숫자 "+d);
			return;
		}
		System.out.println("나이계산기 - 연도를 입력하세요. ex) 1995 ");
		int w = scan.nextInt();
		
		sum = 0;
		sum = 2022 - w+1;
		
		System.out.print(id.substring(0,2)+"년"+b+"월"+d+"일생 ");
		System.out.print(sum+"세 ");
		if(k == 1 || k == 3) {
			System.out.print("남자");
		}
		else {
			System.out.print("여자");
		}
				
		

		
		
		
		
		//기타 잘못입력한 경우 확인 일 월 다른경우 , 뒷자리 첫자리가 1 2 3 4 가 아닌 다른수
		
		// 900101-1234567 입력한 경우 다음과 같이 출력
		// 90년 1월 1일생 32세 남자
		
		
		
	}

}
