package hw;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MDialog extends Dialog implements ActionListener{
	
	Button ok;
	ChatClient1 ct3;
	
	public MDialog(ChatClient1 ct3,String title, String msg) {
		super(ct3, title, true);
		this.ct3 = ct3;
		 //////////////////////////////////////////////////////////////////////////////////////////
		   addWindowListener(new WindowAdapter() {
		    public void windowClosing(WindowEvent e) {
		     dispose();
		    }
		   });
		   /////////////////////////////////////////////////////////////////////////////////////////
		   setLayout(new GridLayout(2,1));
		   Label label = new Label(msg, Label.CENTER);
		   add(label);
		   add(ok = new Button("»Æ¿Œ"));
		   ok.addActionListener(this);
		   layset();
		   setVisible(true);
		   validate();
	}

	public void layset() {
		int width = 200;
		int height = 100;
		setSize(width, height);
		setLocationRelativeTo(ct3);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		//sendTf.setText("");
		dispose();
	}
}