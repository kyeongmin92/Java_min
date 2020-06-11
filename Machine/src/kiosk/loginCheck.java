package kiosk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class loginCheck {

	JFrame frame = new JFrame(""); // 프레임 선언
	JDialog dialog = new JDialog(frame, "관리자 로그인"); // 다이얼로그 선언
	JPanel pan = new JPanel(); // 패널 선언
	// 레이블 선언
	JLabel LblId = new JLabel("아이디");
	JLabel LblPw = new JLabel("비밀번호");
	// 아이디와 비번을 입력 받을 텍스트 필드 선언
	JTextField txtId = new JTextField("");
	JTextField txtPw = new JTextField("");
	// 리셋 버튼과 로그인 버튼을 선언
	JButton btnReset = new JButton("다시 입력");
	JButton btnLogin = new JButton("로그인");

	// GUI 구현 생성자
	public loginCheck() {
		dialog.setSize(300, 300); // 다이얼로그의 크기 설정
		dialog.setVisible(true); // 다이얼로그를 표시 해줌
		dialog.setResizable(false); // 창 크기 조절 불가
		dialog.setLocationRelativeTo(null); // 중앙에서 프레임 실행
		dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// X 버튼 누르면 다이얼로그만 종료
		dialog.setContentPane(pan); // 일반적인 컴포넌트들을 가질 수 있는 패널

		pan.setLayout(null); // 레이아웃에 속하지 않음
		// panel에 label과 textfield 추가, 좌표 지정
		pan.add(LblId);
		LblId.setBounds(40, 20, 60, 30);
		pan.add(LblPw);
		LblPw.setBounds(40, 60, 60, 30);
		pan.add(txtId);
		txtId.setBounds(120, 20, 120, 30);
		pan.add(txtPw);
		txtPw.setBounds(120, 60, 120, 30);
		pan.add(btnReset);
		btnReset.setBounds(20, 100, 100, 30);
		pan.add(btnLogin);
		btnLogin.setBounds(140, 100, 100, 30);

		// 다시 입력 버튼을 누르면 아이디와 패스워드 텍스트 초기화
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtId.setText("");
				txtPw.setText("");
			}

		});

		// 로그인 버튼을 누르면 DB와 연동하여
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtId.setText("");
				txtPw.setText("");
			}

		});
	}
}
