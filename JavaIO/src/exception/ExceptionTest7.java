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
		System.out.println("점수는 : " + n);
	}
		
	public static int inputScore() throws ScoreException { //이 메소드를 호출한 곳으로 예외 전달
		Scanner scan = new Scanner(in);
		int score = 0;
		System.out.print("점수 입력:");
		score = scan.nextInt();
		
		if(score < 0 || score > 100) throw new ScoreException();//throw 예외를 던짐, 이 시점에서 발생함, 예외를 임의적으로발생시킴
		return score;
	}
		

}
