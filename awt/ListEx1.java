package awt;

import java.awt.Label;
import java.awt.event.ItemListener;
import java.util.List;

public class ListEx1 extends MFrame implements ItemListener {

	List list1, list2;
	Label label1, label2;
	
	String team1[] ={"·Ôµ¥","»ï¼º","ÇÑÈ­","KIA","NC"};
	String team2[] ={"LG","µÎ»ê","³Ø¼¾","SK","KT"};
	
	public ListEx1() {
		list1 = new List(3, false);
		for (int i = 0; i < team1.length; i++) {
			list1.add(team[i]);
		}
		list2 = new List(3, false);
		for (int i = 0; i < team2.length; i++) {
			list1.add(team[i]);
		}
		add(list1);
		add(list2);
		add(label = new Label("team1 :             "));
		add(label = new Label("team1 :             "));
		list1.addItemListener(this);
		list1.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e){
		String str1 = list1.getSelectedItem();
		label1.setText("Team1 : " + str1);
		str1 = "";
		String str2[] = list2.getSelectedItems();
		for (int i = 0; i < str2.length; i++) {
			str1+=str[i] + " ";
		}
		label2.setText("team2 : " + str1);
	}
	
	public static void main(String[] args) {
		new ListEx1();
	}

}
