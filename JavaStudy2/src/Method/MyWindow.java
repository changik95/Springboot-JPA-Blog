package Method;

import java.awt.Frame;

public class MyWindow extends Frame{ //frame 상위 mywindow 하위클래스

	public MyWindow() {
		super("창의 제목");
		setBounds(400, 200, 300, 300); //가로 400 세로200위치에 가로 300 세로 200을 만듬
		setVisible(true);
		
	
	}
}
