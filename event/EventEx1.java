package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
//2.��ư�� Ŭ���ϸ� ActionEvent �̺�Ʈ ��ü�� �߻��Ǿ �̺�Ʈ �ҽ��� ActionEvent ��ü�� �����ϱ� ���� ActionListener�� ����
import java.awt.event.ActionListener;

public class EventEx1 extends MFrame
implements ActionListener{ //�̺�Ʈ ������ActionListener

	//1.�̺�Ʈ �ҽ� ����
	Button btn;
	public EventEx1() {
		add(btn = new Button("��ư"), BorderLayout.SOUTH);
		//4.�̺�Ʈ�ҽ��� �̺�Ʈ �ڵ鷯 ����(add XxxListener)
		btn.addActionListener(this);
		validate();
	}
	//3.�̺�Ʈ�������� �޼ҵ�(�̺�Ʈ�ڵ鷯)����
	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(MColor.rColor());
	}
	
	public static void main(String[] args) {
		new EventEx1();
	}

}
