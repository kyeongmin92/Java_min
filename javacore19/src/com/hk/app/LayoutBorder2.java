package com.hk.app;

import java.awt.*;
import javax.swing.*;

public class LayoutBorder2 extends JFrame {
	
	JPanel pan1 = new JPanel();
	JButton btn = new JButton("확인");
	JButton btn2 = new JButton("취소");
	JButton btn3 = new JButton("사진이미지");
	JLabel text = new JLabel("출력할 제목은 라이온.jpg");
	
	LayoutBorder2(){
		setTitle("보더레이아웃_판넬");
		setSize(500, 500);
		
		FlowLayout mgr = new FlowLayout();
		pan1.setLayout(mgr);
		pan1.add(btn);
		pan1.add(btn2);
	}
	
	public void createWindow() {
		
		Container cont = getContentPane();
		BorderLayout mgr2 = new BorderLayout();
		cont.setLayout(mgr2);
		
		cont.add(btn3, BorderLayout.CENTER);
		cont.add(pan1, BorderLayout.SOUTH);
		cont.add(text, BorderLayout.NORTH);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		LayoutBorder2 border_pan = new LayoutBorder2();
		border_pan.createWindow();
	}

}
