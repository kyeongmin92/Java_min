package com.hk.app;

import java.awt.*;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MouseEvent extends JFrame implements MouseListener{
	
	// 텍스트 필드 // 라벨
	JTextField text = new JTextField();
	JLabel txt = new JLabel("마우스이벤트");
	
	MouseEvent(){
		setTitle("스윙컨트롤-마우스이벤트");
		setSize(300, 300);		
	}
	
	public void createWindow() {
		
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		
		fmcont.add(txt, BorderLayout.NORTH);
		fmcont.add(text, BorderLayout.SOUTH);
		
		this.addMouseListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		
		MouseEvent control = new MouseEvent();
		control.createWindow();
		

	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		
		text.setText("마우스 클릭됨");
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		
		text.setText("마우스 들어옴");
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		
		text.setText("마우스 나감");
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		
		text.setText("마우스 눌려짐");
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		
		text.setText("마우스 떼어짐");		
	}

}
