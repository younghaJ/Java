package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx3 extends MFrame{
	
	Button btn;
	
	
	public EventEx3() {
		add(btn = new Button("¹öÆ°"), BorderLayout.SOUTH);
		MyAction ma = new MyAction(this);
		btn.addActionListener(ma);
	}
	
	class MyAction implements ActionListener{
		
		EventEx2 f;
		
		public MyAction(EventEx2 f) {
			this.f = f;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			f.setBackground(MColor.rColor());
			f.btn.setBackground(MColor.rColor());
		}
	}
	
	public static void main(String[] args) {
		new EventEx3();
	}
}
