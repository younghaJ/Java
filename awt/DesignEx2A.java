package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class DesignEx2A extends MFrame{

	TextField tf;
	TextArea ta;
	Button btn1, btn2;
	Panel p1, p2;
	
	public DesignEx2A() {
		super(500,400);
		setLayout(new BorderLayout());
		setTitle("디자인 예제2");
		Panel p1,p2;
		p1 = new Panel();
		tf = new TextField("dddd", 30);
		p1.add(tf);
		ta = new TextArea();
		p2 = new Panel();
		p2.add(btn1 = new Button("dddd"));
		p2.add(btn2 = new Button("ddddd"));
		
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.SOUTH);
		add(ta);
		
		validate();
		
	}
	
	
	public static void main(String[] args) {
		new DesignEx2A();
	}
}

