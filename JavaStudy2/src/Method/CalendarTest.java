package Method;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		//Ķ���� ��ü ����
		Calendar c = Calendar.getInstance();
		
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH) + 1;
		int d = c.get(Calendar.DATE);
		int i = c.get(Calendar.DAY_OF_WEEK);
		int q = c.get(Calendar.AM_PM);
		int h = c.get(Calendar.HOUR);
		int M = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		
		
		
		
		System.out.println(c);
		System.out.print(y + "��" + m + "��" + d + "�� ");
		if(i == Calendar.SUNDAY) {
			System.out.print("�Ͽ��� ");
		}
		else if(i == Calendar.MONDAY) {
			System.out.print("������ ");
		}
		else if(i == Calendar.TUESDAY) {
			System.out.print("ȭ���� ");
		}
		else if(i == Calendar.WEDNESDAY) {
			System.out.print("������ ");
		}
		else if(i == Calendar.THURSDAY) {
			System.out.print("����� ");
		}
		else if(i == Calendar.FRIDAY) {
			System.out.print("�ݿ��� ");
		}
		else {
			System.out.print("����� ");
		}
		System.out.print(q == 0 ? "����" : "����");
		System.out.print(h + "��" + M + "��" + s + "��");
		
		
		
	}

}
