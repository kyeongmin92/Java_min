package com.hk.app;

import java.awt.*;
import javax.swing.*;

public class LayoutBorder1 extends JFrame{
	
	static JButton btn = new JButton("1번째 버튼");
	static JButton btn2 = new JButton("2번째 버튼");
	static JButton btn3 = new JButton("3번째 버튼");
	static JButton btn4 = new JButton("4번째 버튼");
	static JButton btn5 = new JButton("5번째 버튼");
	// int n =10;  배열로 만드는게 좋음
	// JButton[] btn
	
	LayoutBorder1(){
		setTitle("보더레이아웃");
		setSize(500,600);
		BorderLayout border = new BorderLayout();
		setLayout(border);
	}
	
	public void createWindows() {
		
		add(btn, BorderLayout.CENTER); //위치값
		add(btn2, BorderLayout.NORTH); // 북
		add(btn3, BorderLayout.EAST); // 동
		add(btn4, BorderLayout.WEST); // 서
		add(btn5, BorderLayout.SOUTH); // 남
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// 일반적으로 다른 클래스가 좋다
	public static void main(String[] args) {
		LayoutBorder1 newWin = new LayoutBorder1();
		newWin.createWindows();
	}

}
