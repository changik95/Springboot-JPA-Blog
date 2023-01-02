import java.util.Scanner;

//		조건문 if 92p ~ 115p
public class Self3 {

	public static void main(String[] args) {
		
		int age = 60;
		int charge = 0;
		
		if(age >= 60) {
			charge = 0;
			System.out.println("경로우대입니다.");
		}
		System.out.println("입장료는 " + charge + "원 입니다.");
		
		//스위치 케이스문
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("층을 입력해주세요.");
//		int a = scan.nextInt();
//		switch(a){
//			case 1 : System.out.println("약국입니다."); break;
//			case 2 : System.out.println("정형외과입니다."); break;
//			case 3 : System.out.println("피부과입니다."); break;
//			case 4 : System.out.println("치과입니다."); break;
//			case 5 : System.out.println("헬스클럽입니다."); break;
//			default : System.out.println("잘못누르셨습니다. 다시 입력해주세요."); 
//		}
		int num = 1;
		int sum = 0;
		do {
			sum += num;
			num++;
		}while(num<=0);
		
		System.out.println("합계는 " + sum + "입니다.");
		
	}

}
