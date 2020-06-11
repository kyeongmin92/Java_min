package com.hk.app;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

public class Swingitem extends JFrame implements ItemListener{
	
	//체크박스
	JCheckBox chk = new JCheckBox("스파게티-1000원");
	JCheckBox chk2 = new JCheckBox("떡볶이-1500원");
	JPanel pan = new JPanel();
	int sum =0;	
	
	Swingitem(){
		setTitle("스윙컨트롤-레이블");
		setSize(300, 300);		
		pan.add(chk);
		pan.add(chk2);
	}
	
	public void createWindow() {
		
		Container fmcont = getContentPane();
		fmcont.setLayout(new BorderLayout());
		fmcont.add(pan, BorderLayout.NORTH);
		
		//1번
		chk.addItemListener(this);
		chk2.addItemListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		
		Swingitem control = new Swingitem();
		control.createWindow();
		

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
		if(e.getSource().equals(chk) && e.getStateChange() == ItemEvent.SELECTED) {
			sum += 1000;			
			JOptionPane.showMessageDialog(null, "합계는 "+sum);
		} else if(e.getSource().equals(chk2) && e.getStateChange() == ItemEvent.SELECTED) {
			sum += 1500;
			JOptionPane.showMessageDialog(null, "합계는 "+sum);
		}
		
		
	}

}
