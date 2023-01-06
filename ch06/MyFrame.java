package ch06;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MyFrame extends MFrame{
	
	Random r;
	
	public MyFrame() {
		super(500,500,Color.black,false);
		r = new Random();//랜덤 객체
	}
	
	@Override
	public void paint(Graphics g){
		
		//g.drawString("반갑습니다.", 50, 50);
		for (int i = 0; i < 10000; i++) {
			g.setColor(rColor());
			int x = r.nextInt(500);
			int y = r.nextInt(500);
			int w = r.nextInt(50)+5;
			int h = r.nextInt(50)+5;
			g.drawRect(x,y,w,h);
			
			try {
				Thread.sleep(25);
			} catch(Exception e) {}
		}
	}
	
	public  Color rColor(){
		int rr,gg,bb;
		rr = r.nextInt(256);
		gg = r.nextInt(256);
		bb = r.nextInt(256);
		return new Color(rr,gg,bb);
	}
	
	public static void main(String[] args) {
			new MyFrame();
	}

}