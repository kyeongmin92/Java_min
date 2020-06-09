package com.hk.app;

import java.awt.*;
import javax.swing.*;


//jfrmae 상속하지 않고
public class LayoutGrid1 {
	
	JFrame frame = new JFrame("grid");
/*	JButton btn = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");   */
	JButton[] btn = new JButton[4];
	
	LayoutGrid1() {
		for(int i=0; i<4; i++) {
			btn[i] = new JButton(i+1+"");
		}
	}
	
	public void createWindow() {
		frame.setTitle("그리드레이아웃");
		frame.setSize(400,400);
		
		GridLayout manager = new GridLayout(2,2);
		frame.setLayout(manager);
		
	/*	frame.add(btn);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);   */
		for(int i=0; i<4; i++) {
			frame.add(btn[i]);
		}
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		LayoutGrid1 gridwin = new LayoutGrid1();
		gridwin.createWindow();
	}

}
