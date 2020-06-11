package com.hk.app;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class ActionPerform extends JFrame implements ActionListener{
	
	JButton btnprt = new JButton("프린트출력");
	JButton btncc = new JButton("출력취소");
	JLabel txt = new JLabel("상태:", JLabel.CENTER);
	JPanel pan = new JPanel();
	
	ActionPerform(){
		setTitle("이벤트-액션퍼폼");
		setSize(300, 300);		
		pan.add(btnprt);
		pan.add(btncc);
	}
	
	public void createWindow() {
		
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		fmcont.add(txt, BorderLayout.CENTER);
		fmcont.add(pan, BorderLayout.SOUTH);
		
		btnprt.addActionListener(this);
		btncc.addActionListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		
		ActionPerform control = new ActionPerform();
		control.createWindow();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) { // 버튼이벤트 클릭 - 리스너받아서
		
		if(e.getSource().equals(btnprt)) {
		JOptionPane.showMessageDialog(this, "출력중입니다");
		} else {
			JOptionPane.showMessageDialog(this, "취소중입니다");
		}
		
	}

}
