package com.hk.app;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class MouseEvent3 extends JFrame{ //익명클래스
	
	JButton btntitle = new JButton("마우스 이벤트 확인");
	JTextField text = new JTextField();
	
	MouseEvent3(){
		setTitle("스윙컨트롤-마우스");
		setSize(300, 300);		
	}
	
	public void createWindow() {
		
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		
		fmcont.add(btntitle, BorderLayout.NORTH);
		fmcont.add(text, BorderLayout.SOUTH);
		
		//객체에 바로 붙여서 사용		
		this.addMouseMotionListener(new MouseMotionAdapter() {
								
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				String result ="("+ x+" , "+y +")";
				text.setText(result);
				
			}
		});
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				text.setText("마우스가 안으로 들어옴!");
			}
		});
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		
		MouseEvent3 control = new MouseEvent3();
		control.createWindow();
		

	}

}
