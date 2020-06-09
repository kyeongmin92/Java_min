package com.hk.app;

import java.awt.*;
import javax.swing.*;



public class MyFrame1 extends JFrame{ // JFrame 으로 윈도우창을 생성
	
	MyFrame1(){
		setTitle("JFrame 메인창");
		setSize(400,300);
		//setVisible(true);
	}

	public static void main(String[] args) {
		
		MyFrame1 myFm = new MyFrame1();
		Container myCont = myFm.getContentPane();
		
		//레이아웃 변경
		FlowLayout mgr = new FlowLayout(); // 직선형태 배치
	//	GridLayout mgr = new GridLayout();
		myCont.setLayout(mgr);
		
		JButton btn = new JButton("테스트버튼1"); // 버튼 생성
		JButton btn2 = new JButton("테스트버튼2"); // 버튼 생성
		myCont.add(btn);  // 컨테이너에 부착(add)
		myCont.add(btn2);  // 컨테이너에 부착(add)
		
		myFm.setVisible(true);
		
		myFm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void close() {
		//myFm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 화면 + 프로세스 멈춤
	}

}
