package com.hk.app;

import java.awt.*;
import javax.swing.*;

//JFrame 상속
public class MyFrame2 extends JFrame{
	// 만들려고 하는 윈도우 기본 세팅 설정
	JButton btn = new JButton("테스트");
	JButton btn2 = new JButton("테스트2");
	
	
	MyFrame2(){
		setTitle("타이틀제목");
		setSize(300, 300);
	//	setVisible(true);
	}
	
	public void createWindows() {
		Container cont = getContentPane();
		BorderLayout mgr = new BorderLayout();
		cont.setLayout(mgr); // cont 컨테이너의 레이아웃을 변경해주는 함수 
		cont.add(btn, BorderLayout.CENTER);
		cont.add(btn2, BorderLayout.NORTH);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //윈도우 종료할 때 창을 완전히 닫아준다
	}
	
	//메인함수
	public static void main(String[] args) {
		MyFrame2 myfm = new MyFrame2();
		myfm.createWindows();
	}

}
