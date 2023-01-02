package exception;

import static java.lang.System.in;

import java.util.Scanner;

public class ExceptionTest7 {

	public static void main(String[] args) {
		int n = 0;
		
		try {
			n = inputScore();
		}
		catch(ScoreException e){
			e.printStackTrace();
		}
		System.out.println("������ : " + n);
	}
		
	public static int inputScore() throws ScoreException { //�� �޼ҵ带 ȣ���� ������ ���� ����
		Scanner scan = new Scanner(in);
		int score = 0;
		System.out.print("���� �Է�:");
		score = scan.nextInt();
		
		if(score < 0 || score > 100) throw new ScoreException();//throw ���ܸ� ����, �� �������� �߻���, ���ܸ� ���������ι߻���Ŵ
		return score;
	}
		

}
