package Test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double weight = 0.0;
		double height = 0.0;
		double bmi = 0.0;
		String a = null;
		System.out.println("Ű�� �Է����ּ���.");
		height = scan.nextDouble();
		System.out.println("�����Ը� �Է����ּ���.");
		weight = scan.nextDouble();
		
		bmi = weight/((height/100)*(height/100));
		
		if(bmi < 18.5) {
			a = "(��ü��)";
		}
		else if(bmi >= 18.5 && bmi < 23){
			a = "(����)";
		}
		else if(bmi >= 23 && bmi < 25) {
			a = "(��ü��)";
		}
		else if(bmi > 25){
			a = "(��)";
		}
		
		System.out.println("Ű (cm) :" + height);
		System.out.println("������ (kg) :" + weight);
		System.out.println("BMI ���� : " + bmi +" "+ a);
		
		
	}

}
