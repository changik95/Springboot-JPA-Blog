package HomeWork;
import java.util.Scanner;
public class Homework0406_1 {

	public static void main(String[] args) {
		/* 초를 입력받음. int 
		60초를 입력받을시 1분  60으로 나눌시 0
		몇시간 몇분 몇초인지 계산하여 출력
		초 입력 : 3672
		1시간 1분 12초
		산술연산자를 이용하세요 / %연산자가 제일편함
		큰단위 -> 작은단위 / 나머지 초는?
			*/
/*		Scanner scan = new Scanner(System.in);
		int a,b,c;
		int t;
		System.out.print("초를 입력하세요.");
		t = scan.nextInt();
		
		a = t / 3600;
		t = t / 3600;
		b = t / 60;
		t = t / 60;
		c = t / 1;
		System.out.print(a + "시" + b + "분" + c + "초");
		
*/
		
	Scanner scan = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("초를 입력하세요.");
		a = scan.nextInt();

	
		b = a % 3600;
		c = b % 60;
		a = a / 3600;
		b = b / 60;
		c = c / 1;
		System.out.print(a + "시" + b + "분" + c + "초");
/*		Scanner scan = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("초를 입력하세요.");
		c = scan.nextInt();
		
		a = c / 3600;
		c = c % 3600;
		
		b = c / 60;
		c = c % 60;
		
		System.out.println(a + "시" + b + "분" + c + "초");
	
	*/	
		
		
	}

}
