package Method;

public class Test_0428_2 {
	public static void main(String[] args) {
		int ans[] = new int[10];
		int stu[][] = new int[5][10];
		int sum = 0;
		
		
		// ������ �̰͵� ������ �߸��о ���� ����ؼ� ����,�л���� �񱳷� �����ؼ� �ؿ� �ּ����� �� �ڵ� �ϳ� �� ¥�����ϴ� �Ф�...
		
		System.out.println("[ ����  ]");  //���� �����Ѽ��ڷ� �ۼ� , ���
		for(int i = 0; i < ans.length; i++) {
		ans[i] = (int)(Math.random()*5 + 1);
		System.out.print(ans[i] + " ");
		}
		System.out.println();
		System.out.println();
			
		System.out.println("[ �л��� ���� ���  ]");	//�л�����, ����ۼ� , ���
		for(int i = 0; i < 5; i++) {
			System.out.print("�л�" + (i+1) + " : ");
			for(int j = 0; j < 10; j++) {
				stu[i][j] = (int)(Math.random()*5 + 1);
				System.out.print(stu[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("[ ä�� ���  ]");	//ä�� ��� �� ���
		for(int i = 0; i < 5; i++) {
			System.out.print("�л�" + (i+1) + " : ");
			for(int j = 0; j < 10; j++) {
				if(ans[j] == stu[i][j]) {
					System.out.print("O ");
					sum = sum + 10;
				}
				else {
					System.out.print("X ");
				}
			}
			System.out.print("(" + sum + "��)");
			System.out.println();
			sum = 0;
		}
		
	/*	
		int a[] = {1,2,3,4,1,2,3,4,1,2}; //����
		int s1[][] = new int[5][10]; //�л� 1~5
		int b1[] = {1,2,2,4,2,2,3,4,1,2};  //�л�1~5���� �־��� ��ȹ迭 
		int b2[] = {1,2,3,4,1,1,1,4,1,1};
		int b3[] = {1,2,3,4,1,2,3,4,1,2};
		int b4[] = {1,3,3,3,3,3,3,3,1,2};
		int b5[] = {1,2,3,4,1,2,3,1,1,2};
		
		System.out.println("[ ����  ]");   //���� �迭 ���
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			if(i == 9) {
				System.out.print(a[i] + "\n");
			}
		}
		System.out.println();
		
		System.out.println("[ �л���  ���� ��� ]");  //�л��� ������ ���� �� ���
		for(int i = 0; i < 5; i++) {
			System.out.print("�л�"+(i+1)+" : ");
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
		System.out.println("[ ä�� ���  ]");	//ä�� ��� �� ���
		for(int i = 0; i < 5; i++) {
			System.out.print("�л�" + (i+1) + " : ");
			for(int j = 0; j < 10; j++) {
				if(a[j] == s1[i][j]) {
					System.out.print("O ");
					sum = sum + 10;
				}
				else {
					System.out.print("X ");
				}
			}
			System.out.print("(" + sum + "��)");
			System.out.println();
			sum = 0;
		}
	*/	
		
		

	}

}
