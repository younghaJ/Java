package ch14;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyEx2 extends MFrame 
implements ActionListener{
	
	Button open, save;
	TextArea ta;
	FileDialog openDialog, saveDialog;
	String sourceDir;
	String sourceFile;
	
	public FileCopyEx2() {
		super(400,500);
		setTitle("FileCopyEx2");
		add(ta = new TextArea());
		Panel p = new Panel();
		p.add(open = new Button("OPEN"));
		p.add(save = new Button("SAVE"));
		ta.setEditable(false);
		open.addActionListener(this);
		save.addActionListener(this);
		add(p,BorderLayout.SOUTH);
		validate();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==open) {
			openDialog = new FileDialog(this, "���Ͽ���", FileDialog.LOAD);
			openDialog.setVisible(true);
			String dir, file;
			dir = openDialog.getDirectory();
			file = openDialog.getFile();
			//System.out.println(dir + " : " + file);
			
			
			//fileReader("ch14/FileCopyEx2.java");
			fileReader(dir+file);
		}else if(obj==save) {
			saveDialog = new FileDialog(this, "���Ͽ���", FileDialog.SAVE);
			saveDialog.setVisible(true);
			String dir, file;
			dir = saveDialog.getDirectory();
			file = saveDialog.getFile();
			fileWriter(dir+file);
//			fileWriter("ch14/FileCopyEx2.java");
		}
	}
	
	//���õ� ������ ������ ta�� append �ؾ���
	public void fileReader(String file){
		try {
			FileReader fr = new FileReader(file);
			int a;
			String s = "";
			if((a=fr.read())!=-1) {
				s +=(char)a;
			}
			ta.setText(s);
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		String str = "";
//		try {
//			FileReader fr = new FileReader(file);
//			int a;
//			while ((a=fr.read())!=-1) {
//				str += Character.toString(a);
//				System.out.print((char)a);
//			}
//			ta.append(str + "\n");
//			fr.close();
//			
//			System.out.println("���ϸ���");
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	
	//ta�� ���µ� �ؽ�Ʈ�� ������ ���Ϸ� ���� �ؾ���
	public void fileWriter(String file){
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(ta.getText());
			for (int i = 5; i > 0; i--) {
				ta.setText("�����Ͽ����ϴ� - " + i + "���Ŀ� ������ϴ�.");
				Thread.sleep(1000);
			}
			ta.setText("");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		try {
//			long fName = System.currentTimeMillis();
//			FileWriter fw = 
//					new FileWriter("ch14/" + fName + ".txt");
//			fw.write(file);
//			fw.flush();
//			fw.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
	}
	
	public static void main(String[] args) {
		new FileCopyEx2();
	}
}










