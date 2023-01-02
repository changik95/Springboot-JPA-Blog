package exception;

public class ScoreException extends Exception{
	public ScoreException() {
		super("점수의 범위를 벗어남 ");
	}
}
