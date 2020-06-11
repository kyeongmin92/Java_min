package burger;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import com.hk.app.SwingLabel;

public class Ex extends JFrame{
	JPanel panel = new JPanel();
	ImageIcon img = new ImageIcon("images/찌개.png");
	JLabel txt = new JLabel(img);
	JButton btn = new JButton("관리자");
	JButton btn2 = new JButton("주문");
	
	Ex(){
		setTitle("햄버거 키오스크");
		setSize(720, 1080);
		
	}

public void createWindow() {
	setContentPane(panel); // 일반적인 컴포넌트들을 가질 수 있는 패널
		panel.setLayout(null);
		panel.add(txt);
		txt.setBounds(100, 0, 700, 800);
		panel.add(btn);
		panel.add(btn2);
		
		btn.setBounds(500, 20, 360, 300);
		btn2.setBounds(300, 20, 360, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		
		Ex control = new Ex();
		control.createWindow();
		

	}
}
