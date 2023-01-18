package awt;

import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx3 extends MFrame
implements ItemListener{
	
	Choice name, star;
	String ms[] = {"�� ��","�� ��","�̹�ȣ","�����","����","������"};
	String fs[] = {"��ƶ�","�̿���","���ϴ�","��ä��","�� ��","�迬��"};
	
	public ChoiceEx3() {
		super(300,300, new Color(0,0,0));
		name = new Choice();
		name.add("���ڿ�����");
		name.add("���ڿ�����");
		star = new Choice();
		if(name.getSelectedItem() == "���ڿ�����") {
			for (int i = 0; i < ms.length; i++) {
				star.add(ms[i]);
			}
		} else if (name.getSelectedItem() == "���ڿ�����") {
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
