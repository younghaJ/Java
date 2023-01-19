package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DesignEx1 extends MFrame {
	
	Label label;
	Checkbox cb1, cb2, cb3;
	CheckboxGroup cbg;
	Button btn1, btn2;
	Panel p1, p2, p3;
	
	public DesignEx1() {
		super(250,150);
		setTitle("디자인 예제1");
		String str = "과일을 골라주세요";
		
		Panel p1 = new Panel();
		p1.setBackground(Color.green);
		p1.add(label = new Label(str,Label.CENTER));
		add(p1,BorderLayout.NORTH);
		
		Panel p2 = new Panel();
		cbg = new CheckboxGroup();
		p2.add(cb1 = new Checkbox("라디오1",cbg,true));
		p2.add(cb2 = new Checkbox("라디오2",cbg,true));
		p2.add(cb3 = new Checkbox("라디오3",cbg,true));
		add(p2,BorderLayout.CENTER);
		
//		Panel p1 = new Panel(); 
//		panel.setLayout(null);
//		panel.setBounds(100, 100, 100, 50);
//		panel.setBackground(Color.LIGHT_GRAY);	
//		add(panel);
		
		Panel p3 = new Panel();
		btn1 = new Button("Start");
		btn2 = new Button("End");
		p3.add(btn1);
		p3.add(btn2);
		add(p3,BorderLayout.SOUTH);
		
		validate();
	}	

	public static void main(String[] args) {
		new DesignEx1();
	}

}

