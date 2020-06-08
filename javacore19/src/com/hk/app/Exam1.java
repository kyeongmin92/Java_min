package com.hk.app;

import java.awt.*;

import javax.swing.*;

public class Exam1 extends JFrame {
	
	Exam1(){
		setTitle("login");
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		grid.setHgap(30);
		setLayout(grid);
		add(new JLabel("User"));
		add(new JTextField(""));
		add(new JLabel("Pass"));
		add(new JTextField(""));
		
		setSize(300,200);
		
		
	}

	public static void main(String[] args) {
		
		Exam1 e1 = new Exam1();
		Container con = e1.getContentPane();
		
		JButton btn1= new JButton("Reset");
		JButton btn2= new JButton("Login");
	//	JButton btn3= new JButton("회원가입");
		con.add(btn1);
		con.add(btn2);
	//	con.add(btn3);
		
		e1.setVisible(true);
		
		

	}

}
