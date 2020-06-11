package com.hk.app;

import java.awt.*;
import javax.swing.*;

public class SwingJTextArea extends JFrame{
	//텍스트영역
	JTextArea lontext = new JTextArea("여기에 글씨를 입력하시오",7, 20);
	//버튼
	JButton btn = new JButton("등록하기");
	//텍스트필드
	JTextField text = new JTextField("제목을 입력하시오");
	
	SwingJTextArea(){
		setTitle("스윙컨트롤-텍스트영역");
		setSize(300, 300);		
	}
	
	public void createWindow() {
		
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		fmcont.add(text,BorderLayout.NORTH);
		fmcont.add(lontext,BorderLayout.CENTER);
		fmcont.add(btn,BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		
		SwingJTextArea control = new SwingJTextArea();
		control.createWindow();
		

	}

}
