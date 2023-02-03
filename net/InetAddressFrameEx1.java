package net;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;

public class InetAddressFrameEx1 extends MFrame 
implements ActionListener{

	TextArea ta;
	TextField tf;
	Button lookup;
	InetAddress intAddr;
	
	public InetAddressFrameEx1() {
		setTitle("InetAddress Example");
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		p.add(new Label("호스트이름"),BorderLayout.NORTH);
		p.add(tf = new TextField("",40));
		p.add(lookup = new Button("호스트 정보 얻기"), BorderLayout.SOUTH);
		tf.addActionListener(this);
		lookup.addActionListener(this);
		add(p,BorderLayout.NORTH);
		ta = new TextArea("인터넷주소\n");
		ta.setFont(new Font("Dialog",Font.BOLD,15));
		ta.setForeground(Color.BLUE);
		ta.setEditable(false);
		add(ta);
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == lookup || obj==tf) {
			String host = tf.getText().trim();
			try {
				intAddr = InetAddress.getByName(host);
				String add = intAddr.getHostName();
				String ip = intAddr.getHostAddress();
				ta.append(" " + add + "\n");
				ta.append(" " + ip + "\n");
			} catch (Exception e2) {
				ta.append("[" + host + "]\n");
				ta.append("해당되는 호스트가 없습니다.\n");
			}
			tf.setText("");
			tf.requestFocus();
		}
	}
	
	public static void main(String[] args) {
		new InetAddressFrameEx1();
	}

}





//package net;
//
//import java.awt.BorderLayout;
//import java.awt.Button;
//import java.awt.Panel;
//import java.awt.TextArea;
//import java.awt.TextField;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.net.InetAddress;
//
//public class InetAddressFrameEx1 extends MFrame 
//implements ActionListener{
//
//	TextArea ta;
//	TextField tf;
//	Button load;
//	
//	public InetAddressFrameEx1() {
//		super(300,400);
//		setTitle("InetAddressFrameEx1");
//		add(ta=new TextArea());
//		Panel p = new Panel();
//		p.add(tf = new TextField(20));
//		p.add(load = new Button("호스트 정보 얻기"));
//		ta.setEditable(false);
//		tf.addActionListener(this);
//		load.addActionListener(this);
//		add(p,BorderLayout.NORTH);
//		validate();
//	}
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Object obj = e.getSource();
//		String str = tf.getText(); 
//		if(obj == load) {
//			try {
//				// ip 및 도메인 객체화
//				InetAddress add = InetAddress.getLocalHost();
//				add = InetAddress.getByName(str);
//				System.out.println(str + add.getHostAddress());
//				InetAddress adds[] = InetAddress.getAllByName(str);
//				ta.append(tf.getText() + "\n");
//				for (int i = 0; i < adds.length; i++) {
//					ta.append(" " + adds[i]);
//				}
//			} catch (Exception e1) {
//				e1.printStackTrace();
//			}
//			
//			tf.setText("");
//			tf.requestFocus();
//			System.out.println("str : " + str);
//			System.out.println("add : " + add);
//		}
//	}
//	
//	public static void main(String[] args) {
//		new InetAddressFrameEx1();
//	}
//
//}
