package kiosk;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class KioskPanel02  extends JPanel{
	
	static JTextArea textbox = new JTextArea();
//	JScrollPane scrollPane = new JScrollPane(textbox);	
	
	public KioskPanel02()
	{
		setLayout(null);					
		
		textbox.setBounds(7, 10, 710, 300);
		textbox.setEditable(false); // 텍스트 수정 X	
		add(textbox);
		
//		add(scrollPane);
//		scrollPane.setBounds(7, 10, 710, 200);
	}
	public static void setTextBox(String text)
	{
	  textbox.append(text);
	}
	


}
