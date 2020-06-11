package com.hk.app;

import java.awt.*;

import javax.swing.*;

public class Calc_Ex_1 extends JFrame{
	
	String[] btn = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3",
			"-", "0", "C", "=", "+"};
	JButton[] btn2 = new JButton[16];	
	JPanel pan1 = new JPanel();
	JTextField text = new JTextField(" ");
	JLabel txt = new JLabel("자바계산기"); //?
	
	Calc_Ex_1(){
		setTitle("Calculator");
		setSize(250	, 280);			
	}	
	
	public void creatWindow() {
		Container fmcont = getContentPane();
		
		fmcont.setLayout(new BorderLayout());
		
		
		pan1.setLayout(new GridLayout(4,4));
		for (int i = 0; i < btn.length; i++) {
			btn2[i] = new JButton(btn[i]);
			pan1.add(btn2[i]);
		}
		fmcont.add(text, BorderLayout.NORTH);
		fmcont.add(pan1, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
	
	


    public static void main(String[] args) {
    	Calc_Ex_1 calc = new Calc_Ex_1();
    	calc.creatWindow();
	
    }
}


