package net;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;



public class URLFrameEx1 extends MFrame implements ActionListener {

	TextArea ta;
	TextField tf;
	Button connect;
	Button save;
	URL url;

	public URLFrameEx1() {
		super(500, 500);
		setTitle("ViewHost");
		Panel p = new Panel();
		p.add(tf = new TextField("http://", 40));
		p.add(connect = new Button("connect"));
		p.add(save = new Button("save"));
		ta = new TextArea();
		add(p, BorderLayout.NORTH);
		add(ta);
		save.setEnabled(true);
		connect.addActionListener(this);
		save.addActionListener(this);
		tf.addActionListener(this);
		validate();
	}
	
	@Override 
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		try {
			url = new URL(tf.getText());
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(obj == connect) {
			connectHost(url);
		} else if(obj == save) {
			createFile(tf.getText(), ta.getText());
		}
	}
	
	public void connectHost(URL url) {
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							url.openStream(),"UTF-8"));
			String line = "";
			while (true) {
				line = br.readLine();
				if(line==null) break;
				ta.append(line + "\n");
			}
			br.close();
		} catch (Exception e) {
			ta.append("해당하는 호스트가 없습니다.");
		}
	}
	
	public void createFile(String file, String content) {
		try {
			FileWriter fw = new FileWriter("net/" + file + ".html");
			fw.write(content);
			fw.close();
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		URLFrameEx1 ex = new URLFrameEx1();
	}
}






















//package net;
//
//
//import java.awt.BorderLayout;
//import java.awt.Button;
//import java.awt.Panel;
//import java.awt.TextArea;
//import java.awt.TextField;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.BufferedReader;
//import java.io.FileWriter;
//import java.io.InputStreamReader;
//import java.net.InetAddress;
//import java.net.URL;
//import java.net.URLConnection;
//
//
//
//public class URLFrameEx1 extends MFrame implements ActionListener {
//
//	TextArea ta;
//	TextField tf;
//	Button connect;
//	Button save;
//
//	public URLFrameEx1() {
//		super(500, 500);
//		setTitle("ViewHost");
//		Panel p = new Panel();
//		p.add(tf = new TextField("http://", 40));
//		p.add(connect = new Button("connect"));
//		p.add(save = new Button("save"));
//		ta = new TextArea();
//		add(p, BorderLayout.NORTH);
//		add(ta);
//		save.setEnabled(true);
//		connect.addActionListener(this);
//		save.addActionListener(this);
//		tf.addActionListener(this);
//		validate();
//	}
//
//	public void saveFile(String str) {
//		try {
//			long fName = System.currentTimeMillis();
//			FileWriter fw = 
//					new FileWriter("net/" + "URLFrameEx1_" + fName + ".txt");
//			fw.write(str);
//			fw.flush();
//			fw.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@Override 
//	public void actionPerformed(ActionEvent e) {
//		Object obj = e.getSource();
//		String pageContents = "";
//		if(obj == connect) {
//			try {
//				URL url = new URL(tf.getText());
//	            URLConnection con = (URLConnection)url.openConnection();
//	            InputStreamReader reader = new InputStreamReader (con.getInputStream(), "utf-8");
//	            BufferedReader buff = new BufferedReader(reader);
//	 
//	            while((pageContents = buff.readLine())!=null){
//	                //System.out.println(pageContents);
//	            	ta.append(pageContents + "\n");
//	            }
//	            buff.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		} else if (obj==save) {
//			saveFile(pageContents);
//			System.out.println("저장 끝!!");
//		}
//	}
//
//	
//	public static void main(String[] args) {
//		URLFrameEx1 ex = new URLFrameEx1();
//	}
//}
//
//
//
//
//
//
//
//
