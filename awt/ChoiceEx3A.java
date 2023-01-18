package awt;

import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx3A extends MFrame
implements ItemListener{
	
	Choice name, star;
	String ms[] = {"�� ��","�� ��","�̹�ȣ","�����","����","������"};
	String fs[] = {"��ƶ�","�̿���","���ϴ�","��ä��","�� ��","�迬��"};
	
	public ChoiceEx3A() {
		super(300,300, new Color(0,0,0));
		name = new Choice();
		name.add("���ڿ�����");
		name.add("���ڿ�����");
		star = new Choice();
		
		add(name);
		add(star);
		name.addItemListener(this);
		//System.out.println(name.getSelectedItem().getClass().getName());
	}
	public void inputItem(Choice c, String item[]) {
		c.removeAll();
		for (int i = 0; i < item.length; i++) {
			c.add(item[i]);
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(name.getSelectedItem().equals("���ڿ�����")) {
			inputItem(star,ms);
		}else if(name.getSelectedItem().equals("���ڿ�����")) {
			inputItem(star,fs);
		}
	}
	
	public static void main(String[] args) {
		new ChoiceEx3();
	}

}
