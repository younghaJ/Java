package hw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.ChatProtocol3;

public class ChatClient1 extends JFrame implements ActionListener, Runnable{
	
	JButton saveBtn, sendBtn;
	JTextField tf1, tf2;
	TextArea ta;
	JPanel p1, p2;
	BufferedReader in;
	PrintWriter out;
	public static final int PORT = 8002;
	String id;
	
	public ChatClient1(BufferedReader in, PrintWriter out, String id) {
		setSize(350, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyChat 1.0");
		p1 = new JPanel();
		p1.setBackground(new Color(200,0,200));
		//p1.add(new Label("HOST ",Label.CENTER));
		//p1.add(tf1 = new JTextField("127.0.0.1",15));
		p1.add(saveBtn = new JButton("SAVE"));
		
		p2 = new JPanel();
		p2.setBackground(new Color(200,0,200));
		p2.add(new Label("CHAT ",Label.CENTER));
		p2.add(tf2 = new JTextField("",15));
		p2.add(sendBtn = new JButton("SEND"));	
		
		//tf1.addActionListener(this);
		tf2.addActionListener(this);
		saveBtn.addActionListener(this);
		sendBtn.addActionListener(this);
		
		add(p1,BorderLayout.NORTH);
		add(ta=new TextArea());
		add(p2,BorderLayout.SOUTH);
		setVisible(true);
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==saveBtn) {
			String content = tf2.getText();
			//1970년1월1일 ~현재까지 1/1000초 단위로 계산
			long fileName = System.currentTimeMillis();
			try {
				FileWriter fw = new FileWriter("net/"+fileName+".txt");
				fw.write(content);
				fw.close();
				tf2.setText("");
				new MDialog(this, "Save", "대화내용을 저장하였습니다.");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}else if(obj==tf2||obj==sendBtn/*send*/){
			String str = tf2.getText().trim();
			if(str.length()==0)
				return;//서버로 전송하지 않고 메소드 탈출
			if(id==null) {//최초 한번만 실행
				id = str;
				setTitle(getTitle() + " [" + id + "]");
				ta.setText("채팅을 시작합니다.\n");
			}
			if(filterMgr(str)) {
				new MDialog(this, "경고", "입력하신 글짜는 금지어입니다.");
				return;
			}
			out.println(ChatProtocol3.CHATALL+ChatProtocol3.MODE+str);
			//out.println(str);
			tf2.setText("");
			tf2.requestFocus();
		}
	}//--actionPerformed
	
	public boolean filterMgr(String msg){
		boolean flag = false;//false이면 금지어 아님
		String str[] = {"바보","개새끼","새끼","자바","java"};
		//msg : 하하 호호 히히
		StringTokenizer st = new StringTokenizer(msg);//생략하면 구분자는 공백
		String msgs[] = new String[st.countTokens()];
		for (int i = 0; i < msgs.length; i++) {
			msgs[i] = st.nextToken();
		}
		for (int i = 0; i < str.length; i++) {
			if(flag) break;//첫번째 for문 빠져나감.
			for (int j = 0; j < msgs.length; j++) {
				if(str[i].equalsIgnoreCase(msgs[j])) {
					flag = true;
					break; //두번째 for문 빠져나감.
				}//if
			}//for2
		}//for1
		return flag;
	}
	
	@Override
	//서버로 부터 메세지가 들어오면 반응하는 기능
	public void run() {
		try {
			while(true) {
				ta.append(in.readLine() + "\n");
				tf2.requestFocus();
			}
		} catch (Exception e) {
			System.err.println("Error in run");
			e.printStackTrace();
			System.exit(1);
		}
	}//--run
	
	public void connect(String host){
		try {
			Socket sock = new Socket(host, PORT);
			in = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			out = new PrintWriter(sock.getOutputStream(),true);
			//서버에서 최초로 보내는 메세지 전달
			ta.append(in.readLine() + "\n");
			tf2.requestFocus();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Thread Start
		new Thread(this).start();
	}//--connect
	
	public static void main(String[] args) {
		new ChatClient1(null, null, null);
	}
}



