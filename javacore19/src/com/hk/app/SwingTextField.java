package com.hk.app;

import java.awt.*;
import javax.swing.*;

public class SwingTextField extends JFrame{
	
	//판넬
	JPanel pan = new JPanel();
	JPanel pan2 = new JPanel();
	JPanel pan3 = new JPanel();
	//체크박스 -> 판넬에 올려서  -> 프레임에 올리기
	JCheckBox ch1 = new JCheckBox("피자");
	JCheckBox ch2 = new JCheckBox("샌드위치", true);  // 선택상태로 체크박스 생성
	JCheckBox ch3 = new JCheckBox("스파케티");
	//라디오버튼
	JRadioButton ra1 = new JRadioButton("회원", true);
	JRadioButton ra2 = new JRadioButton("비회원");
	ButtonGroup btngrp = new ButtonGroup();
	//임시버튼
	JButton btn = new JButton("이름 입력하시오");
	//텍스트입력1줄
	JTextField text = new JTextField("", 10);
	
	SwingTextField(){
		setTitle("스윙컨트롤-텍스트필드");
		setSize(300, 300);		
		ch1.setSelected(true);   // 선택상태로 변경
		ch2.setSelected(false);  // 선택상태 해제로 변경
		pan.add(ch1);
		pan.add(ch2);
		pan.add(ch3);
		btngrp.add(ra1); // radio1
		btngrp.add(ra2); // radio2을 같은 그룹으로 묶음
		pan2.add(ra1);
		pan2.add(ra2);
		pan3.add(text);
		pan3.add(btn);
	}
	
	public void createWindow() {
		
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		fmcont.add(pan, BorderLayout.NORTH);
		fmcont.add(pan3, BorderLayout.CENTER);
		fmcont.add(pan2, BorderLayout.SOUTH);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		
		SwingTextField control = new SwingTextField();
		control.createWindow();
		

	}

}
