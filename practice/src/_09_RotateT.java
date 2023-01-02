import java.util.Scanner;

/*9. 2차원 행렬 회전하기
다음과 같은 3행 3열의 2차원 배열을 생성하고, 사용자로부터 임의의 값을 입력 받을 때마다 시계 방향으로 90°씩 회전하여 출력하는 코드를 작성하시요. 단, 사용자가 입력한 값이 “exit”일 경우 프로그램을 종료할 것.
{ { "#", "#", "#" }, { " ", "#", " " }, { " ", "#", " " } }
예시) 출력:
###
#
#
입력: 1
출력:
  #
###
#
입력: a
출력:
 # 
 # 
###
입력: exit
출력:*/

public class _09_RotateT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] arr = { { "#", "#", "#" }, { " ", "#", " " }, { " ", "#", " " } };

		while (true) {
			String[][] copy = new String[3][3];

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}

			if ("exit".equals(sc.nextLine()))
				break;

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					copy[j][arr.length - 1 - i] = arr[i][j];
				}
			}

			arr = copy;
		}

		sc.close();
	}
}