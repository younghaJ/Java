package event;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventListener;

//�ܺ� Ŭ���� �̿�

class MyItem implements ItemListener{
	ItemEventEx2 f;
	
	public MyItem(ItemEventEx2 f) {
		this.f = f;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox cb = (Checkbox)e.getSource();
		String str = cb.getLabel() + " : " + cb.getState();
		f.label.setText(str);
		f.setTitle(str);
	}
	
}

public class ItemEventEx2 extends MFrame {
	
	Label label;
	Checkbox cb1, cb2, cb3;
	MyItem m;
	
	public ItemEventEx2() {
		super(300, 200);
		setLayout(new FlowLayout());
		add(cb1=new Checkbox("����"));
		add(cb2=new Checkbox("�ٳ���"));
		add(cb3=new Checkbox("���"));
		add(label = new Label("���� ���� :                    "));
		MyItem event = new MyItem(this);
		cb1.addItemListener(event);
		cb2.addItemListener(event);
		cb3.addItemListener(event);
	}
	

	public static void main(String[] args) {
		new ItemEventEx2();
	}
	
	//�ܺ�Ŭ�������� �ʿ��� �̺�Ʈ ������ ����(Event2.java)����
	
}






