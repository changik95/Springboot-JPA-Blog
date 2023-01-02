package HomeWork;
/*
 원 단위로 금액을 입력받음. 달러 또는 엔화 또는 유로화 단위로 변환해서 출력한다.
 1달러 = 천원 / 원단위는 인트지만 달러는 더블로 하면됌.
 실행 ex :
 금액 입력(원) : 10000원 = 스캐너
 환전할 화폐 (1-달러, 2-엔화, 3-유로): 3 스캐너 입력 = 인트형 숫자하나 디폴트까지 계산해야함 
 10000원은 9달러입니다. = 1,2,3번에 따라 다르게 설정 해줘야함 if or switch , 계산 된 금액은 소수점 아래까지
 */
import java.util.Scanner;
public class HomeWork0407_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w;
		double h,a,b,c;
		
		// w 금액 , h 화폐
		
		System.out.println("금액을 입력하세요.");
		w = scan.nextInt();
		System.out.println("화폐를 결정하세요. 1 = 달러 , 2 = 엔화 , 3 = 유로");
		h = scan.nextInt();
		
		
		if(h == 1) {
			a = w/1219.5;
			System.out.println(String.format("%.2f",a) + "달러");
		}
		else if(h == 2) {
			b = w / 985.89;
			System.out.println(String.format("%.2f",b) + "엔");
		}
		else if(h == 3){
			c = w / 1332.55;
			System.out.println(String.format("%.2f",c) + "유로");
		}
		else{
			System.out.println("입력 에러입니다.");
		}
				
			
		
		
		
		
	}

}
