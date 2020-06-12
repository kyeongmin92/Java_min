package kiosk;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class JPanel03 extends JPanel{
	
	JPanelChange win;
    JButton btn = new JButton("세트메뉴");
    JButton btn2 = new JButton("단품");
    JButton btn3 = new JButton("사이드");
    JButton btn4 = new JButton("음료");
    JPanel pan = new JPanel();
    
    ImageIcon img1 = new ImageIcon("images/프렌치프라이.png");
   	ImageIcon img2 = new ImageIcon("images/쉐이킹프라이.png");
   	ImageIcon img3 = new ImageIcon("images/너겟킹.png");
   	ImageIcon img4 = new ImageIcon("images/21치즈스틱.png");
    
    JButton side1 = new JButton("", img1);
    JButton side2 = new JButton("", img2);
    JButton side3 = new JButton("", img3);
    JButton side4 = new JButton("", img4);
    
    public JPanel03(JPanelChange win) {
        setLayout(null);
        this.win = win;
        
        btn.setSize(90, 20);
        btn.setLocation(10, 10);
        add(btn);
        btn2.setSize(70, 20);
        btn2.setLocation(110, 10);
        add(btn2);
        btn3.setSize(80, 20);
        btn3.setLocation(190, 10);
        add(btn3);
        btn4.setSize(70, 20);
        btn4.setLocation(280, 10);
        add(btn4);    
        
        pan.setLayout(null);
        pan.add(side1);        
        side1.setBounds(10,50,137,130);       
        add(side1);
        
        pan.add(side2);        
        side2.setBounds(160,50,137,130);       
        add(side2);
        
        pan.add(side3);        
        side3.setBounds(310,50,137,130);       
        add(side3);
        
        pan.add(side4);        
        side4.setBounds(460,50,137,130);       
        add(side4);
        
       
        
       btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 win.change("panel01");
				
			}
		});
        
        btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 win.change("panel02");
				
			}
		});
        
        btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 win.change("panel03");
				
			}
		});
        
        btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 win.change("panel04");
				
			}
		});
    }

}
