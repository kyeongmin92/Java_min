package kiosk;

import java.awt.event.*;
import javax.swing.*;


public class order extends JFrame {

	loginCheck login;
	JPanel pan = new JPanel();
	JButton btnAdmin = new JButton("관리자");
	ImageIcon ber1 = new ImageIcon("images/더콰트로치즈.png");
	ImageIcon ber2 = new ImageIcon("images/더콰트로치즈세트.png");
	JButton btn = new JButton("", ber1);
	JButton btn2 = new JButton("", ber2);
	order() {
		setTitle("버거킹 키오스크"); // 프레임 이름
		setSize(720, 1080); // 프레임 크기
	}

	public void open() {
		setResizable(false); // 창 크기 조절 불가
		setLocationRelativeTo(null); // 중앙에서 프레임 실행
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setContentPane(pan);

		pan.setLayout(null);
		btnAdmin.setBounds(600, 10, 120, 30);
		pan.add(btnAdmin);
		pan.add(btn);
		pan.add(btn2);
		btn.setBounds(20, 20, 340, 350);
		btn2.setBounds(20, 380, 340, 350);
		add(btn);

		btnAdmin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new loginCheck();
			}

		});
	}
}
