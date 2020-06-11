package com.hk.app;

import java.awt.*;
import javax.swing.*;

public class SwingLabel2 extends JFrame{
	JLabel txt = new JLabel("타이틀제목: 레이블");
	JLabel txt2 = new JLabel("", JLabel.CENTER);
	// 333x499
	ImageIcon img = new ImageIcon("images/rabbit.jpg");
	JLabel txt3 = new JLabel(img);
	
	SwingLabel2(){
		setTitle("스윙컨트롤-레이블");
		setSize(400, 600);		
	}
	
	public void createWindow() {
		
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		fmcont.add(txt, BorderLayout.NORTH);
	//	String temp = txt.getText(); // 텍스트를 가져오는 함수
	//	txt2.setText(txt);  // txt "타이틀제목: 레이블" 가져옴
		txt2.setText("중앙컨텐츠 입니다");
		txt2.setOpaque(true);                 // 투명도
		txt2.setForeground(Color.BLUE);       // 글자색
		txt2.setBackground(Color.lightGray);  // 배경색
		fmcont.add(txt3, BorderLayout.CENTER);
		fmcont.add(txt2, BorderLayout.SOUTH);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		
		SwingLabel2 control = new SwingLabel2();
		control.createWindow();
		

	}

}
