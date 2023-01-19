package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class DesignEx2 extends MFrame{

	TextField tf;
	TextArea ta;
	Button btn1, btn2;
	Panel p1, p2;
	
	public DesignEx2() {
		super(500,400);
		setTitle("디자인 예제2");
		
	}
	
	
	public static void main(String[] args) {
		new DesignEx2();
	}
}

