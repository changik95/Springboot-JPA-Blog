package ArraySolt;

import java.util.Scanner;
public class ArrayTest5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ar[] = new int[6];
		int n;
		int b;
		//������ �����ʱ�ȭ
		for(int i = 0; i < ar.length; i++) {
			ar[i] =(int)(Math.random()*45 + 1);
		}
		//�Է¹���
		System.out.println("������ �Է��ϼ��� : ");
		n = scan.nextInt();
		
		//boolean �Ǵ� int�� ���� �غ�
		boolean flag = false;
		
		//Ȯ���� ���
		for(b = 0; b < ar.length; b++) {
			if(n == ar[b]) {
				flag = true;
				break;
			}
		}
		
		if (flag) {
			System.out.println(b + "��°");
		}
		else {
			System.out.println("����");
		}
		
	// int�� 6��¥�� �迭 ����
	// 1~45������ ������ ���ڷ� �ʱ�ȭ
	// ���� n �� Ű����� �����Է¹���
	// �Է¹��� ���ڰ� �迭���� �ִ��� Ȯ���ϰ� ���	
		
	}

}
/*
	������ �Է��ϼ��� : 3 
	[10,5,1,3,2,6]�߿��� 3����ҿ� �ֽ��ϴ�.
*/