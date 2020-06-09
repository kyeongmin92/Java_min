package com.hk.app;

import java.awt.*;
import javax.swing.*;

public class LayoutBorder3 extends JFrame {
	
	JPanel pan1 = new JPanel();
	JButton btn = new JButton("확인");
	JButton btn2 = new JButton("취소");
	JButton btn3 = new JButton("사진이미지");
	JLabel text = new JLabel("출력할 제목은 라이온.jpg");
	
	LayoutBorder3(){
		setTitle("보더레이아웃_판넬");
		setSize(500, 500);
		
		FlowLayout mgr = new FlowLayout();
		pan1.setLayout(mgr);
		pan1.add(btn);
		pan1.add(btn2);
		
		
		BorderLayout mgr2 = new BorderLayout();
		setLayout(mgr2);
		
		add(btn3, BorderLayout.CENTER);
		add(pan1, BorderLayout.SOUTH);
		add(text, BorderLayout.NORTH);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		
		new LayoutBorder3();
		
	}

}
