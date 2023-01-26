package ch14;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class FileWriterEx2 extends MFrame implements ActionListener{

	TextArea ta;
	TextField tf;
	Button save;
	
	public FileWriterEx2() {
		super(300,400);
		setTitle("FileWriterEx1");
		add(ta=new TextArea());
		Panel p = new Panel();
		p.add(tf = new TextField(25));
		p.add(save = new Button("SAVE"));
		ta.setEditable(false);
		tf.addActionListener(this);
		save.addActionListener(this);
		add(p,BorderLayout.SOUTH);
		validate();
	}
	
	public static void main(String[] args) {
		new FileWriterEx2();
	}

	public void saveFile(String intxt) {
		try {
			long fName = System.currentTimeMillis();
			FileWriter fw = 
					new FileWriter("ch14/" + fName + ".txt");
			fw.write(intxt);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == tf) {
			ta.append(tf.getText() + "\n");
			tf.setText("");
			tf.requestFocus();
		}else if(obj==save) {
			String str = ta.getText(); 
			saveFile(str);
			System.out.println("�۾���!!");
			System.out.println(str);
		}
	}

}
