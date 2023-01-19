package event;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx2 extends MFrame{

	Button move;
	
	public KeyEventEx2() {
		super(400, 500, new Color(100, 200, 100));
		setLayout(null);
		move = new Button("move");
		move.setBounds(200,250,50,30);
		move.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				String txt =  KeyEvent.getKeyText(code);
				//System.out.println(code + " : " + txt);
				
				int x = move.getX();
				int y = move.getY();
				if(txt.equals("Right")) {
					x +=10;
	
				}
				else if(txt.equals("Left")) {
					x+= 10;
				} else if(txt.equals("Left")) {
					y+=10;
				}else if(txt.equals("Left")) {
					y-=10;
				}
				if(x>0 && y<getWidth()-50 && y>20 &&y<getHeight()-30) {
					move.setLocation(x,y);
				}
				move.setLocation(x,y);
			}
		});
		add(move);
		move.requestFocus();
		//메소드가 다수의 리스너를 implement하면 어댑터
		//익명 클래스 만들때 어댑터 사용
		
		validate();
	}
	
	public static void main(String[] args) {
		new KeyEventEx2();
	}
}
