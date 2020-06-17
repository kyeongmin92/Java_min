package kiosk_km;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class KioskPanel01 extends JPanel { // 1번째 패널

	/*JButton btnSetMenu = new JButton("세트메뉴");
	JButton btnSingleMenu = new JButton("단품");
	JButton btnSide = new JButton("사이드");
	JButton btnDrink = new JButton("음료");*/

	JButton setber1Plus = new JButton("+");
	JButton setber1Minus = new JButton("-");

	JButton setber2Plus = new JButton("+");
	JButton setber2Minus = new JButton("-");

	JButton setber3Plus = new JButton("+");
	JButton setber3Minus = new JButton("-");

	JButton setber4Plus = new JButton("+");
	JButton setber4Minus = new JButton("-");

	JButton btnOK = new JButton("주문");
	JButton btnCancel = new JButton("취소");
//	JButton btnOrders = new JButton("주문");

	JLabel setber1Label = new JLabel("0");
	JLabel setber2Label = new JLabel("0");
	JLabel setber3Label = new JLabel("0");
	JLabel setber4Label = new JLabel("0");
	
	JButton btnAdmin = new JButton("관리자");

	ImageIcon img1 = new ImageIcon("images/붉은대게와퍼세트.png");
	ImageIcon img2 = new ImageIcon("images/더콰트로치즈세트.png");
	ImageIcon img3 = new ImageIcon("images/트러플통모짜와퍼세트.png");
	ImageIcon img4 = new ImageIcon("images/통모짜와퍼세트.png");
	ImageIcon img5 = new ImageIcon("images/통모짜와퍼.png");
	ImageIcon img6 = new ImageIcon("images/통모짜와퍼.png");
	ImageIcon img7 = new ImageIcon("images/통모짜와퍼.png");
	ImageIcon img8 = new ImageIcon("images/통모짜와퍼.png");

	JLabel setber1 = new JLabel(img1);
	JLabel setber2 = new JLabel(img2);
	JLabel setber3 = new JLabel(img3);
	JLabel setber4 = new JLabel(img4);
	
	JLabel singleber1 = new JLabel(img5);
	JLabel singleber2 = new JLabel(img6);
	JLabel singleber3 = new JLabel(img7);
	JLabel singleber4 = new JLabel(img8);
	
	int setMenu1Price = 10600;
	int setMenu2Price = 10000;
	int setMenu3Price = 10300;
	int setMenu4Price = 10300;

	public KioskPanel01() {
		
		setLayout(null);

		btnOK.setSize(70, 20);
		btnOK.setLocation(450, 10);
		add(btnOK);

		btnCancel.setSize(70, 20);
		btnCancel.setLocation(530, 10);
		add(btnCancel);
		
		/*btnOrders.setSize(70,20);
		btnOrders.setLocation(370,10);
		add(btnOrders);	*/	

		/*btnSetMenu.setSize(90, 20);
		btnSetMenu.setLocation(10, 10);
		add(btnSetMenu);*/

		/*btnSingleMenu.setSize(70, 20);
		btnSingleMenu.setLocation(110, 10);
		add(btnSingleMenu);

		btnSide.setSize(80, 20);
		btnSide.setLocation(190, 10);
		add(btnSide);

		btnDrink.setSize(70, 20);
		btnDrink.setLocation(280, 10);
		add(btnDrink);*/
      
		setber1.setBounds(10, 50, 150, 150);
		add(setber1);
       
		setber2.setBounds(180, 50, 150, 150);
		add(setber2);
      
		setber3.setBounds(350, 50, 150, 150);
		add(setber3);
        
		setber4.setBounds(520, 50, 150, 150);
		add(setber4);
		
		singleber1.setBounds(10, 230, 150, 150);
		add(singleber1);
       
		singleber2.setBounds(180, 230, 150, 150);
		add(singleber2);
      
		singleber3.setBounds(350, 230, 150, 150);
		add(singleber3);
        
		singleber4.setBounds(520, 230, 150, 150);
		add(singleber4);

		btnAdmin.setBounds(630, 10, 80, 20);

		add(btnAdmin);

		setber1Minus.setBounds(30, 210, 20, 20);
		add(setber1Minus);
		setber1Plus.setBounds(80, 210, 20, 20);
		add(setber1Plus);
		add(setber1Label);
		setber1Label.setBounds(60, 210, 20, 20);
		
		setber2Minus.setBounds(200, 210, 20, 20);
		add(setber2Minus);
		setber2Plus.setBounds(250, 210, 20, 20);
		add(setber2Plus);
		add(setber2Label);
		setber2Label.setBounds(230, 210, 20, 20);

		setber3Minus.setBounds(370, 210, 20, 20);
		add(setber3Minus);
		setber3Plus.setBounds(420, 210, 20, 20);
		add(setber3Plus);
		add(setber3Label);
		setber3Label.setBounds(400, 210, 20, 20);

		setber4Minus.setBounds(550, 210, 20, 20);
		add(setber4Minus);
		setber4Plus.setBounds(600, 210, 20, 20);
		add(setber4Plus);
		add(setber4Label);
		setber4Label.setBounds(580, 210, 20, 20);

		// 관리자 버튼과 이벤트를 실행하는 메소드
		   btnAdmin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new LoginCheck();
			}
		});
		
		// + 버튼 클릭시 btn1Label 값 1씩 증가
		   setber1Plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = setber1Label.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				setber1Label.setText(Integer.toString(icnt));

			}
		});
		// - 버튼 클릭시 btn1Label 값 1씩 감소 (0까지)
		   setber1Minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = setber1Label.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					setber1Label.setText(Integer.toString(icnt));
				}
			}
		});

		   setber2Plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = setber2Label.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				setber2Label.setText(Integer.toString(icnt));

			}
		});
		   setber2Minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = setber2Label.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					setber2Label.setText(Integer.toString(icnt));
				}
			}
		});

		   setber3Plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = setber3Label.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				setber3Label.setText(Integer.toString(icnt));

			}
		});
		   setber3Minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = setber3Label.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					setber3Label.setText(Integer.toString(icnt));
				}
			}
		});

		   setber4Plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = setber4Label.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				setber4Label.setText(Integer.toString(icnt));

			}
		});
		   setber4Minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = setber4Label.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					setber4Label.setText(Integer.toString(icnt));
				}
			}
		});

		btnOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {				
				String count1 = setber1Label.getText();
				int icounnt1 = Integer.parseInt(count1);
				setber1Label.setText(Integer.toString(icounnt1));
				
				String count2 = setber2Label.getText();
				int icounnt2 = Integer.parseInt(count2);
				setber2Label.setText(Integer.toString(icounnt2));
				
				String count3 = setber3Label.getText();
				int icounnt3 = Integer.parseInt(count3);
				setber3Label.setText(Integer.toString(icounnt3));
				
				String count4 = setber4Label.getText();
				int icounnt4 = Integer.parseInt(count4);
				setber4Label.setText(Integer.toString(icounnt4));
				
				int sumPrice = (icounnt1*setMenu1Price)+(icounnt2*setMenu2Price)+(icounnt3*setMenu3Price)
						+(icounnt4*setMenu4Price);
				
				if (!setber1Label.getText().equals("0")) {						
					KioskPanel02.setTextBox("붉은대게와퍼세트  \t" + setber1Label.getText() +"개  \t"+icounnt1*setMenu1Price+ "원 \n");
				}
				if (!setber2Label.getText().equals("0")) {					
					KioskPanel02.setTextBox("더콰트로치즈세트  \t" + setber2Label.getText() + "개  \t"+icounnt2*setMenu2Price+ "원 \n");
				}
				if (!setber3Label.getText().equals("0")) {					
					KioskPanel02.setTextBox("트러플통모짜와퍼세트  \t" + setber3Label.getText() +"개  \t"+icounnt3*setMenu3Price+ "원 \n");
				}
				if (!setber4Label.getText().equals("0")) {					
					KioskPanel02.setTextBox("통모짜와퍼세트  \t" + setber4Label.getText() + "개  \t"+icounnt4*setMenu4Price+ "원 \n");
				}

				if (setber1Label.getText().equals("0") && setber2Label.getText().equals("0")
						&& setber3Label.getText().equals("0") && setber4Label.getText().equals("0")) {
					KioskPanel02.setTextBox("주문 내역이 없습니다." + "\n");
				}
				KioskPanel02.setTextBox("\n 세트 합계: "+sumPrice+"원 입니다. \n\n");
			}
		});

		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				KioskPanel02.textbox.setText("");
				setber1Label.setText("0");
				setber2Label.setText("0");
				setber3Label.setText("0");
				setber4Label.setText("0");
				
			}
		});				
		
	}
}
