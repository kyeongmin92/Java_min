package com.hk.app;

import java.awt.*;
import javax.swing.*;

public class SwingCheck extends JFrame{
	
	//판넬
	JPanel pan = new JPanel();
	//체크박스 -> 판넬에 올려서  -> 프레임에 올리기
	JCheckBox ch1 = new JCheckBox("피자");
	JCheckBox ch2 = new JCheckBox("샌드위치", true);  // 선택상태로 체크박스 생성
	JCheckBox ch3 = new JCheckBox("스파케티");
	//임시버튼
	JButton btn = new JButton();
	
	SwingCheck(){
		setTitle("스윙컨트롤-체크박스");
		setSize(300, 300);		
		ch1.setSelected(true);   // 선택상태로 변경
		ch2.setSelected(false);  // 선택상태 해제로 변경
		pan.add(ch1);
		pan.add(ch2);
		pan.add(ch3);
	}
	
	public void createWindow() {
		
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		fmcont.add(pan, BorderLayout.NORTH);
		fmcont.add(btn, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		
		SwingCheck control = new SwingCheck();
		control.createWindow();
		

	}

}
