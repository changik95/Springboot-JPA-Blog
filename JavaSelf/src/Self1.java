// ������ �����ϱ�?  39p~69p

public class Self1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int level;  // int �ڷ��� level ������ , ������ ���� level�� ����
		level = 10; // �� 10�� level ������ ����
		
		
		short Sval = 10; //���α׷��� ����Ǿ� ���� ���� �����Ҷ� �ڵ����� int ������ ��ȯ��
		byte Bval = 20;
		System.out.println(Sval + Bval);
		
		//���(final) �����ϱ�  ��� = ������ �ʴ� ��
		
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
//		MAX_NUM = 1000; �������� final�� ���� ������Ŵ 

//		���ͷ� = ���α׷����� ����ϴ� ��� ���� ���� ����
	
//		����� �� ��ȯ (����)
		int iNum = 10;
		byte bNum = (byte)iNum; //������ int���� byte���� �־���
		
		int aNum = 1000;
		byte eNum = (byte)aNum; //����Ʈ�� -128~127 ������ �����ε�, �Ѿ��⶧���� �ڷ�ս��� �߻��� -24�� ��µ�
		
		System.out.println(eNum);
	
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		int iNum3 = (int)dNum1 + (int)fNum2;//�� �Ǽ��� ���� ����ȯ �� ����
		int iNum4 = (int)(dNum1 +fNum2); //�Ѵ� �������� ����ȯ�� �̷����
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		
		
		
		
		
		
		
	}

}
