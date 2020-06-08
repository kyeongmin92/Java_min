package com.hk.app;

import java.awt.*;  // swint 부모클래스

import javax.swing.*;

//JFrame Container를 먼저 구현
//1. JFrame 상속
public class FlowLayout1 extends JFrame{
	
	FlowLayout1(){ // 초기화
		//프레임 초기값
		setTitle("FLOW LAYOUT 1");
		setSize(300, 600);	
		setLayout(new FlowLayout((FlowLayout.CENTER), 20, 20)); // 기본(Border) --> 직선형태 배치
	}

	public static void main(String[] args) {
		
		FlowLayout1 f1 = new FlowLayout1();
		
		Container con = f1.getContentPane(); // 회색영역에 배치
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		con.add(btn1);
		con.add(btn2);
		con.add(btn3);
		
		f1.setVisible(true);
	}

}
