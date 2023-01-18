package awt;

import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx3 extends MFrame
implements ItemListener{
	
	Choice name, star;
	String ms[] = {"현 빈","원 빈","이민호","김수현","김우빈","이종석"};
	String fs[] = {"고아라","이연희","이하늬","문채원","수 지","김연아"};
	
	public ChoiceEx3() {
		super(300,300, new Color(0,0,0));
		name = new Choice();
		name.add("남자연예인");
		name.add("여자연예인");
		star = new Choice();
		if(name.getSelectedItem() == "남자연예인") {
			for (int i = 0; i < ms.length; i++) {
				star.add(ms[i]);
			}
		} else if (name.getSelectedItem() == "여자연예인") {
			for (int i = 0; i < fs.length; i++) {
				star.add(fs[i]);
			}
		}
		
		add(name);
		add(star);
		//System.out.println(name.getSelectedItem().getClass().getName());
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		//star.removeAll();
		repaint();
	}
	
	public static void main(String[] args) {
		new ChoiceEx3();
	}

}
