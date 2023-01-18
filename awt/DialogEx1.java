package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogEx1 extends MFrame
implements ActionListener{

	Button btn;
	String title = "메시지 대화상자";
	public DialogEx1() {
		super(300,300);
		setLayout(new BorderLayout());
		add(btn = new Button("보이기"),BorderLayout.SOUTH);
		setResizable(true);
		btn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(getWidth());
//		System.out.println(getHeight());
//		System.out.println(getX());
//		System.out.println(getY());
		MyDialog md = new MyDialog(this, title, true);
		//현재 Frame의 좌표
		int fx = getX();
		int fy = getY();
		//Dialog의 창크기
		int width = 100;
		int height = 150;
		int x = fx+getWidth()/2-width/2;
		int y = fy+getHeight()/2-height/2;
		md.setBounds(x, y, width, height);
		md.setVisible(true);
	}
	
	//내부클래스 : 외부클래스와 아주 밀접한 관계가 있는 클래스
	class MyDialog extends Dialog implements ActionListener{ //extends 오류나면 디폴트 생성자가 없다?
		Button b;
		
		public MyDialog(Frame owner, String title, boolean modal) {
			super(owner, title, modal);
			setLayout(new FlowLayout());
			b = new Button("확인");
			b.addActionListener(this);
			add(b);
		}
		
		public void actionPerformed(ActionEvent e) {
			dispose(); //없어지는 기능
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new DialogEx1();
	}

}
