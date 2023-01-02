package classpart;

public class ManTest {

	public static void main(String[] args) {
		Man man = new Man(); //클래스 , 참조변수 = 인스턴스생성
		man.age = 40;
		man.name = "안진수";
		man.Married = true;
		man.baby = 4;
		
		System.out.println(man.age);
		System.out.println(man.name);
		System.out.println(man.Married);
		System.out.println(man.baby);
	}

}
