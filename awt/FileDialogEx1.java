package awt;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialogEx1 extends MFrame
implements ActionListener{

	FileDialog openFile, saveFile;
	Button openBtn, saveBtn;
	
	public FileDialogEx1() {
		openFile = new FileDialog(this, "���� ����", FileDialog.LOAD);
		saveFile = new FileDialog(this, "���� ����", FileDialog.LOAD);
		Panel p = new Panel();
		p.add(openBtn = new Button("���� ����"));
		p.add(saveBtn = new Button("���� ����"));
		add(p);
		openBtn.addActionListener(this);
		saveBtn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == openBtn) {
			
		}	else if(e.getSource() == saveBtn) {
			
		}
	}
	
	public static void main(String[] args) {
		new FileDialogEx1();
	}

}
