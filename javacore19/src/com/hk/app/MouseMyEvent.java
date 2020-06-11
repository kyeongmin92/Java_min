package com.hk.app;

import java.awt.Color;
import java.awt.event.*;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class MouseMyEvent implements MouseListener{
	
	public JButton btn;

	@Override
	public void mouseClicked(MouseEvent e) {
		btn.setBackground(Color.RED);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
