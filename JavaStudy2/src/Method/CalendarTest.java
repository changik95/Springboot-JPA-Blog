package Method;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		//캘린더 객체 생성
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
		System.out.print(y + "년" + m + "월" + d + "일 ");
		if(i == Calendar.SUNDAY) {
			System.out.print("일요일 ");
		}
		else if(i == Calendar.MONDAY) {
			System.out.print("월요일 ");
		}
		else if(i == Calendar.TUESDAY) {
			System.out.print("화요일 ");
		}
		else if(i == Calendar.WEDNESDAY) {
			System.out.print("수요일 ");
		}
		else if(i == Calendar.THURSDAY) {
			System.out.print("목요일 ");
		}
		else if(i == Calendar.FRIDAY) {
			System.out.print("금요일 ");
		}
		else {
			System.out.print("토요일 ");
		}
		System.out.print(q == 0 ? "오전" : "오후");
		System.out.print(h + "시" + M + "분" + s + "초");
		
		
		
	}

}
