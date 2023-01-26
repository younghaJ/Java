package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

// 쓰레드 기능
// 9개의 프레임 실행
// 3열 3행의 위치에 세팅
// 크기는 200*200
// 원 색상은 랜덤색이고 개수는 30개
public class RunnableFrameEx3 extends MFrame implements Runnable{
	Random r = new Random();
	int x,y, x1, y1;
	Color c;
	
	public RunnableFrameEx3(int x1,int y1) {
		super(200, 200);
		setLocation(x1,y1);
		c = MColor.rColor();
		//this.c = c;
	}
	
	public void run() {
		for (int i = 0; i < 30; i++) {
			x = r.nextInt(200);
			y = r.nextInt(200);
			try {
				Thread.sleep(500);
				repaint();
			} catch (Exception e) {	}
		} // --for
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(MColor.rColor());
		g.fillOval(x, y, 10, 10);
	}
	
	@Override
	public void update(Graphics g) {
		g.clipRect(x, y, 10, 10);
		paint(g);
	}
	
	public static void main(String[] args) {
		RunnableFrameEx3[] r1 = new RunnableFrameEx3[9];
		//Thread[] t1 = new Thread[9];
		
//		for (int i = 0; i < 9; i++) {
//			r1[i] = new RunnableFrameEx3(MColor.rColor());
//			r1[i].setLocation(300*i,0);
//			t1[i] = new Thread(r1[i]);
//			t1[i].start();
//		}
		
		for (int i = 0; i < r1.length; i++) {
			int x1 = 200 + (200*(i%3)); // Math.floor
			int y1 = 200 + (200*(i/3));
			r1[i] = new RunnableFrameEx3(x1,y1);
			new Thread(r1[i]).start();
		}

		
	}

}