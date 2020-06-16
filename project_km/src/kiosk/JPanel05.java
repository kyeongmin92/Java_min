package kiosk;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JPanel05  extends JPanel{
	JPanelChange win;
	JTextArea textbox = new JTextArea();
//	JScrollPane scrollPane = new JScrollPane(textbox);
	
	public JPanel05(JPanelChange win)
	{
		setLayout(null);
		this.win = win;				
		
		textbox.setBounds(7, 10, 710, 200);
		textbox.setEditable(false); // 텍스트 수정 X
		add(textbox);
	//	add(scrollPane);
	}
	public void setTextBox(String text)
	{
	  textbox.append(text);
	}
	


}
