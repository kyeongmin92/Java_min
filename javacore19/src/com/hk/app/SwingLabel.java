package com.hk.app;

import java.awt.*;
import javax.swing.*;

public class SwingLabel extends JFrame{
	
	SwingLabel(){
		setTitle("스윙컨트롤-레이블");
		setSize(300, 300);		
	}
	
	public void createWindow() {
		
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		
		SwingLabel control = new SwingLabel();
		control.createWindow();
		

	}

}
