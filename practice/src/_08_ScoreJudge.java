import java.util.Scanner;

/*8. 성적 처리 프로그램
사용자로부터 총 학생의 수와 합격 기준점을 입력 받는다. 그리고 각 학생의 성적과 결석 일수를 순차적으로 입력 받는다. 모든 학생의 데이터를 입력 받은 후 최종 성적이 합격 기준점 이상인 학생이 몇 번째로 입력 받았는지를 출력하는 코드를 작성하시요. 단, 결석 일수 1일 당 5점씩 감점하며 각 데이터는 공백으로 구분할 것.
예시) 입력: 3 60
80 3
45 8
90 1
출력: 1
3*/

public class _08_ScoreJudge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		String[] arr = line.split(" ");
		int count = Integer.parseInt(arr[0]);
		int passScore = Integer.parseInt(arr[1]);

		for (int i = 0; i < count; i++) {
			String[] str = sc.nextLine().split(" ");
			int miss = Integer.parseInt(str[1]);
			int score = Integer.parseInt(str[0]) - (miss * 5);
			int finalScore = score < 0 ? 0 : score;
			if (passScore <= finalScore)
				System.out.println(i + 1);
		}

		sc.close();
	}
}