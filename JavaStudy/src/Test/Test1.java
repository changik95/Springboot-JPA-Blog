package Test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double weight = 0.0;
		double height = 0.0;
		double bmi = 0.0;
		String a = null;
		System.out.println("키를 입력해주세요.");
		height = scan.nextDouble();
		System.out.println("몸무게를 입력해주세요.");
		weight = scan.nextDouble();
		
		bmi = weight/((height/100)*(height/100));
		
		if(bmi < 18.5) {
			a = "(저체중)";
		}
		else if(bmi >= 18.5 && bmi < 23){
			a = "(정상)";
		}
		else if(bmi >= 23 && bmi < 25) {
			a = "(과체중)";
		}
		else if(bmi > 25){
			a = "(비만)";
		}
		
		System.out.println("키 (cm) :" + height);
		System.out.println("몸무게 (kg) :" + weight);
		System.out.println("BMI 지수 : " + bmi +" "+ a);
		
		
	}

}
