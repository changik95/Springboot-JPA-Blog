//   *   012 ���� 3       ��
//  ***  01  ���� 234     ��
// ***** 0   ���� 12345   ��
//*******       0123456 ��

public class Self5 {
	
	public static void main(String[] args) {
		int a = 6;
		int b = 3;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print(' ');
			}
			for(int k = 0; k <= 6; k++) {
				if(k < a)continue;
				System.out.print('*');
			}
			b-=1;
			a-=2;
			System.out.println();
		}
		b = 1;
		a = 4;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < b; j++) {  // 3 >= 0
				System.out.print(' ');
			}
			for(int k= 0; k <= a; k++) {
				System.out.print('*');
			}
			b+=1;
			a-=2;
			System.out.println();
		}
	}
	
}