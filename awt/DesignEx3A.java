package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;

public class DesignEx3A extends MFrame{

	List list;
	Button b[] = new Button[4];
	String lab[] = {"�߰�","�����","��ü�����","����"};
	TextField tf;
	String food[] ={"¥���","«��","�쵿"};
	
	public DesignEx3A() {
		super(300,200);
		setTitle("������ ����3");
		list = new List();
		for (int i = 0; i < food.length; i++) {
			list.add(food[i]);
		}
		Panel p =new Panel();
		p.setLayout(new GridLayout(4,1));
		for (int i = 0; i < b.length; i++) {
			p.add(b[i] = new Button(lab[i]));
		}
		list.select(0);
		add(list);
		add(p, BorderLayout.EAST);
		add(tf = new TextField(), BorderLayout.SOUTH);
		tf.requestFocus(); //Ŀ�� ������
		validate();
	}

	public static void main(String[] args) {
		new DesignEx3A();
	}
}








