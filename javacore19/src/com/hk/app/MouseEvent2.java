package com.hk.app;

import java.awt.*;
import javax.swing.*;

public class MouseEvent2 extends JFrame{
	
	//텍스트
	JTextField txt = new JTextField();
	//버튼
	
	
	// 생성자
	MouseEvent2(){
		setTitle("스윙컨트롤-마우스이벤트");
		setSize(300, 300);		
	}
	
	public void createWindow() {
		
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		
		MouseMyEvent mybtn = new MouseMyEvent();
		mybtn.btn = new JButton("마우스 이벤트 처리");
		
		fmcont.add(mybtn.btn, BorderLayout.NORTH);
		fmcont.add(txt, BorderLayout.SOUTH);
		
		mybtn.btn.addMouseListener(mybtn);
		
		MouseMyEvent myMouse = new MouseMyEvent();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		
		MouseEvent2 control = new MouseEvent2();
		control.createWindow();
		

	}

}
