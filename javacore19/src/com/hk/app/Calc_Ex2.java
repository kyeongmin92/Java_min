package com.hk.app;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 계산기 만들기
public class Calc_Ex2 extends JFrame implements ActionListener{ //JFrame 상속
	
	// 생성자 초기화
	Calc_Ex2(){
		setTitle("계산기예제2");
		setSize(220,250);
			}
	//버튼  생성
	//판넬 생성
	//텍스트필드 생성
	JButton btn1 = new JButton("7");
	JButton btn2 = new JButton("8");
	JButton btn3 = new JButton("9");
	JButton btn4 = new JButton("/");
	
	JButton btn5 = new JButton("4");
	JButton btn6 = new JButton("5");
	JButton btn7 = new JButton("6");
	JButton btn8 = new JButton("*");
	
	JButton btn9 = new JButton("1");
	JButton btn10 = new JButton("2");
	JButton btn11 = new JButton("3");
	JButton btn12 = new JButton("-");
	
	JButton btn13 = new JButton("C");
	JButton btn14 = new JButton("0");
	JButton btn15 = new JButton("=");
	JButton btn16 = new JButton("+");
	
	
	JPanel panel = new JPanel();
	JTextField text = new JTextField();
	String strnumber = "";
			
	
	//윈도우 그리는 함수
	public void createWindow() {
		
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		
		panel.setLayout(new FlowLayout());
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(btn7);
		panel.add(btn8);
		panel.add(btn9);
		panel.add(btn10);
		panel.add(btn11);
		panel.add(btn12);
		panel.add(btn13);
		panel.add(btn14);
		panel.add(btn15);
		panel.add(btn16);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn10.addActionListener(this);
		btn11.addActionListener(this);
		btn12.addActionListener(this);
		btn13.addActionListener(this);
		btn14.addActionListener(this);
		btn15.addActionListener(this);
		btn16.addActionListener(this);
		
		
		text.setHorizontalAlignment(JTextField.RIGHT);
		
		fmcont.add(text, BorderLayout.NORTH);
		fmcont.add(panel, BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	


    public static void main(String[] args) {
    	Calc_Ex2 calc = new Calc_Ex2();
    	calc.createWindow();
	
    }






	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn1)) {
			strnumber += 7;			
		} else if(e.getSource().equals(btn2)){
			strnumber += 8;			
		} else if(e.getSource().equals(btn3)) {
			strnumber +=9;
		} else if(e.getSource().equals(btn5)) {
			strnumber +=4;
		} else if(e.getSource().equals(btn6)) {
			strnumber +=5;
		} else if(e.getSource().equals(btn7)) {
			strnumber +=6;
		} else if(e.getSource().equals(btn9)) {
			strnumber +=1;
		} else if(e.getSource().equals(btn10)) {
			strnumber +=2;
		} else if(e.getSource().equals(btn11)) {
			strnumber +=3;
		} else if(e.getSource().equals(btn14)) {
			strnumber +=0;
		}
		text.setText(strnumber);
		
	}
}


