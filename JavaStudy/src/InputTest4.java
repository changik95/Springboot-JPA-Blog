import java.util.Scanner; 
public class InputTest4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		double height;
		String address;
		
		System.out.print("주소 :"); // Line는 전의 라인에서 버린걸 주워먹고 공백문자도 괜찮음
		address = scan.nextLine();  // 입력버퍼에선 공백문자를 입력받으면 종료됨 enter,tab space bar
		System.out.print("이름 :");
		name = scan.next();
		System.out.print("나이 :");
		age = scan.nextInt();
		System.out.print("키 :");
		height = scan.nextDouble();
		
		System.out.println(address);
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
		
		
		
		
		
		
		
	}

}
