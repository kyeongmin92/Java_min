package com.hk.app;

import java.awt.*;
import java.awt.event.*;



import javax.swing.*;

public class Calc_Action_Ex extends JFrame implements ActionListener{
	
	String[] btn = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3",
			"-", "0", "C", "=", "+"};
	JButton[] arrbtn = new JButton[16];	
	JPanel pan1 = new JPanel();
	JTextField text = new JTextField(" ");
	JLabel txt = new JLabel("자바계산기"); //?
	String strnumber = "";
	Calc_Action_Ex(){
		setTitle("Calculator");
		setSize(250	, 280);	
		pan1.setLayout(new GridLayout(4,4));
		for (int i = 0; i < btn.length; i++) {
			arrbtn[i] = new JButton(btn[i]);
			pan1.add(arrbtn[i]);			
		}
	}	
	
	public void creatWindow() {
		Container fmcont = getContentPane();
		
		fmcont.setLayout(new BorderLayout());		
		
		fmcont.add(text, BorderLayout.NORTH);
		fmcont.add(pan1, BorderLayout.CENTER);
		
		for(int i=0; i<arrbtn.length; i++) {
			arrbtn[i].addActionListener(this);
		}
		
		text.setHorizontalAlignment(JTextField.RIGHT);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	


    public static void main(String[] args) {
    	Calc_Action_Ex calc = new Calc_Action_Ex();
    	calc.creatWindow();
	
    }
    
    

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(arrbtn[0])) {
			strnumber += 7;			
		} else if(e.getSource().equals(arrbtn[1])){
			strnumber += 8;			
		} else if(e.getSource().equals(arrbtn[2])) {
			strnumber +=9;
		} else if(e.getSource().equals(arrbtn[4])) {
			strnumber +=4;
		} else if(e.getSource().equals(arrbtn[5])) {
			strnumber +=5;
		} else if(e.getSource().equals(arrbtn[6])) {
			strnumber +=6;
		} else if(e.getSource().equals(arrbtn[8])) {
			strnumber +=1;
		} else if(e.getSource().equals(arrbtn[9])) {
			strnumber +=2;
		} else if(e.getSource().equals(arrbtn[10])) {
			strnumber +=3;
		} else if(e.getSource().equals(arrbtn[13])) {
			strnumber +=0;
		}
		text.setText(strnumber);
		
		
				
	}
}


