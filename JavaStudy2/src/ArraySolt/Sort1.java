package ArraySolt;

public class Sort1 {

	public static void main(String[] args) {
		int ar[] = {3,5,4,11,17,6,44,2,43,1};
		int i, j, temp,c;
		System.out.print("������ : ");
		for (i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		
		
		int n1 = 0, n2 = 0;
		
		for (i = 0; i < ar.length - 1; i++) {
			for(j = i + 1; j < ar.length; j++) {
				n1++;
				if(ar[i] > ar[j]) {
					n2++;
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println("��ȯ���� ��Ƚ��:" + n1 + ", ��ȯ :" + n2);
		
		System.out.print("������ : ");
		for (i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
		System.out.println();		
	int br[] = {3,5,4,11,17,6,44,2,43,1};
		
		//�������� 
		int a1 =0,a2 =0;
		boolean flag;
		
		for (i = br.length - 1; i > 0; i--) {
			flag = true;
			for(j = 0; j < i; j++) {
				a1++;
				if(br[j] > br[j+1]) {
					flag = false;
					a2++;
					temp = br[j];
					br[j] = br[j+1];
					br[j+1] = temp;
				}
			}
			if (flag) break;
		}
		System.out.println("�������� ��Ƚ��:" + a1 + ", ��ȯ :" + a2);
	
	
		
		System.out.print("������ : ");
		for (i = 0; i < ar.length; i++) {
			System.out.print(br[i] + " ");
		}
		System.out.println();		
		
	}

}
