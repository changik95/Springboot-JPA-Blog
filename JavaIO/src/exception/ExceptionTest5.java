package exception;

public class ExceptionTest5 {

	public static void main(String[] args) {
		String num[] = {"10","aaa","25","test","***","100","1","2.35","0","1E-2"};
		int cnt = 0;
	
		for(int i = 0; i < num.length; i++) {
			try {
				Integer.parseInt(num[i]); //��Ʈ���� �޽���Ʈ�� ��Ʈ�� �ٲ� 
				System.out.println(num[i]); //Ȯ��
				cnt++; //ī��Ʈ����
			}
			catch (NumberFormatException e) {
			}
		}
		
		System.out.println(cnt + "��");
	}

}
