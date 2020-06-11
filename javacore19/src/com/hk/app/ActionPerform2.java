package com.hk.app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionPerform2 extends JFrame implements ActionListener{
	
	JButton btnch = new JButton("Eagle");
	
	ActionPerform2(){
		setTitle("스윙컨트롤-ActionPerform");
		setSize(300, 300);		
	}
	
	public void createWindow() {
		
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		fmcont.add(btnch, BorderLayout.NORTH);
		
		btnch.addActionListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		
		ActionPerform2 control = new ActionPerform2();
		control.createWindow();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//JOptionPane.showMessageDialog(null, "확인");
		JButton btntemp =(JButton)e.getSource();
				btntemp.setText("독수리");
		
	}

}
