package If;

public class If1 {

	public static void main(String[] args) {
		int n = 95;
		
		
		//1
		if (n >= 70) {
			System.out.println("�հ�");
		}
			
		else {
			System.out.println("���հ�");
		}	
		
		
		
		//2
		if (n % 2 == 0) {
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
		
		
	
		//3
		if ( n < 0) {
			System.out.println("����");
		}
		else if (n > 0) {
			System.out.println("���");
		}
		else {
			System.out.println("0");
		}
				
		//4
		if (n >= 90) {
			System.out.println("A");
		}
		else if (n >= 80) {			//else if�� and�� �����
			System.out.println("B");
		}
		else if (n >= 70) {
			System.out.println("C");
		}
		else { 
			System.out.println("D");
		}
			
		
		
		System.out.println("���α׷��� ��");
		/* if,switch �� ������ �ǳʶ�. while , for , do while�� �ݺ���
		if(����)
		  // ����1
		} else {
		  // ���� 2
		}
		
		���� if~else��
		



		*/
	}

}
