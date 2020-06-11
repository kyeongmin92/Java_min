package com.hk.app;

import java.awt.*;
import javax.swing.*;

public class SwingButton extends JFrame{
	ImageIcon imgok = new ImageIcon("images/ok.png");
	ImageIcon imgcc = new ImageIcon("images/cancel.png");
//	ImageIcon img = new ImageIcon("images/rabbit.jpg");
	JButton btnok = new JButton("확인", imgok);
	JButton btncc = new JButton("취소", imgcc);
//	JLabel txt = new JLabel(img);
	
	SwingButton(){
		setTitle("스윙컨트롤-버튼");
		setSize(300, 300);		
	}
	
	public void createWindow() {
		
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		fmcont.add(btnok, BorderLayout.NORTH);
		fmcont.add(btncc, BorderLayout.SOUTH);
//		fmcont.add(txt, BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		
		SwingButton control = new SwingButton();
		control.createWindow();
		

	}

}
