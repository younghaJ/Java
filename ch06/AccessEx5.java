//java.awt.Frame에 ParamString 결과 출력
package ch06;

import java.awt.Color;
import java.awt.Graphics;

public class AccessEx5 extends MFrame{
	
	@Override
	protected String paramString() {
		return super.paramString();
	}
	
	public AccessEx5() {
		super(500,500,Color.white,false);
	}
	
	@Override
	public void paint(Graphics g){
		g.drawString(paramString(), 50, 50);
	}
	
	public static void main(String[] args) {
		new AccessEx5();
	}

}