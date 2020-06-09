package com.hk.app;

import java.awt.*;

import javax.swing.*;

public class Calc_Ex extends JFrame{
	
	String[] btn = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3",
			"-", "0", "C", "=", "+"};
	JButton[] btn2 = new JButton[16];	
	JPanel pan1 = new JPanel();
	JTextField text = new JTextField(" ");
	JLabel txt = new JLabel("자바계산기"); //?
	
	Calc_Ex(){
		setTitle("Calculator");
		setSize(400	, 400);				
		add(text, BorderLayout.NORTH);
		
		GridLayout mgr = new GridLayout(4,4);
		pan1.setLayout(mgr);				
		
		for (int i = 0; i < btn.length; i++) {
			btn2[i] = new JButton(btn[i]);
			pan1.add(btn2[i]);
		}	
		add(pan1);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}	
	
	
	
	
	
	


    public static void main(String[] args) {
	    new Calc_Ex();
	
    }
}


