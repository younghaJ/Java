package awt;

import java.awt.Label;
import java.awt.Color;
import java.util.Random;
import javax.swing.plaf.multi.MultiColorChooserUI;

public class LabelEx1 extends MFrame{
	
	//Label label1, label2, label3, label4;
	Label[] label = new Label[4]; //라벨이 들어갈 공간이 만들어짐, 객체가 만들어지는게 아님
	int pos[] = {Label.LEFT, Label.CENTER, Label.RIGHT, Label.LEFT};
	
	public LabelEx1(){
		
		super(200,200);
		//setResizable(true);
		setTitle("Label Example");
		String str = "오늘은 가지마";
		
		for (int i = 0; i < label.length; i++) {
			label[i] = new Label(str,pos[i]);
			label[i].setBackground(MColor.rColor());
			add(label[i]);
		}
		
		validate();
	}
	
	public static void main(String[] args) {
		new LabelEx1();
	}
}