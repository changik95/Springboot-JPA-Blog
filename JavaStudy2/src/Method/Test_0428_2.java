package Method;

public class Test_0428_2 {
	public static void main(String[] args) {
		int ans[] = new int[10];
		int stu[][] = new int[5][10];
		int sum = 0;
		
		
		// 선생님 이것도 문제를 잘못읽어서 랜덤 사용해서 답지,학생답안 비교로 착각해서 밑에 주석으로 또 코드 하나 더 짜놨습니다 ㅠㅠ...
		
		System.out.println("[ 정답  ]");  //답지 랜덤한숫자로 작성 , 출력
		for(int i = 0; i < ans.length; i++) {
		ans[i] = (int)(Math.random()*5 + 1);
		System.out.print(ans[i] + " ");
		}
		System.out.println();
		System.out.println();
			
		System.out.println("[ 학생들 제출 답안  ]");	//학생순서, 답안작성 , 출력
		for(int i = 0; i < 5; i++) {
			System.out.print("학생" + (i+1) + " : ");
			for(int j = 0; j < 10; j++) {
				stu[i][j] = (int)(Math.random()*5 + 1);
				System.out.print(stu[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("[ 채점 결과  ]");	//채점 결과 후 출력
		for(int i = 0; i < 5; i++) {
			System.out.print("학생" + (i+1) + " : ");
			for(int j = 0; j < 10; j++) {
				if(ans[j] == stu[i][j]) {
					System.out.print("O ");
					sum = sum + 10;
				}
				else {
					System.out.print("X ");
				}
			}
			System.out.print("(" + sum + "점)");
			System.out.println();
			sum = 0;
		}
		
	/*	
		int a[] = {1,2,3,4,1,2,3,4,1,2}; //답지
		int s1[][] = new int[5][10]; //학생 1~5
		int b1[] = {1,2,2,4,2,2,3,4,1,2};  //학생1~5에게 넣어줄 답안배열 
		int b2[] = {1,2,3,4,1,1,1,4,1,1};
		int b3[] = {1,2,3,4,1,2,3,4,1,2};
		int b4[] = {1,3,3,3,3,3,3,3,1,2};
		int b5[] = {1,2,3,4,1,2,3,1,1,2};
		
		System.out.println("[ 정답  ]");   //답지 배열 출력
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			if(i == 9) {
				System.out.print(a[i] + "\n");
			}
		}
		System.out.println();
		
		System.out.println("[ 학생들  제출 답안 ]");  //학생들 제출답안 대입 및 출력
		for(int i = 0; i < 5; i++) {
			System.out.print("학생"+(i+1)+" : ");
			if(i == 0) {
				for(int j = 0; j < 10; j++) {
					s1[i][j] = b1[j];
					System.out.print(s1[i][j] + " ");
				}
				System.out.println();
				}
			else if(i == 1) {
				for(int j = 0; j < 10; j++) {
					s1[i][j] = b2[j];
					System.out.print(s1[i][j] + " ");
				}
				System.out.println();
			}
			else if(i == 2) {
				for(int j = 0; j < 10; j++) {
					s1[i][j] = b3[j];
					System.out.print(s1[i][j] + " ");
				}
				System.out.println();
			}
			else if(i == 3) {
				for(int j = 0; j < 10; j++) {
					s1[i][j] = b4[j];
					System.out.print(s1[i][j] + " ");
				}
				System.out.println();
			}
			else if(i == 4) {
				for(int j = 0; j < 10; j++) {
					s1[i][j] = b5[j];
					System.out.print(s1[i][j] + " ");
				}
				System.out.println();
			}
		
		}
		
		System.out.println();
		System.out.println("[ 채점 결과  ]");	//채점 결과 후 출력
		for(int i = 0; i < 5; i++) {
			System.out.print("학생" + (i+1) + " : ");
			for(int j = 0; j < 10; j++) {
				if(a[j] == s1[i][j]) {
					System.out.print("O ");
					sum = sum + 10;
				}
				else {
					System.out.print("X ");
				}
			}
			System.out.print("(" + sum + "점)");
			System.out.println();
			sum = 0;
		}
	*/	
		
		

	}

}
