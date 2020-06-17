package kiosk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class KioskPanel01 extends JPanel { // 1번째 패널
    //
	ImageIcon plusImage = new ImageIcon("images/+.png");
	ImageIcon minusImage = new ImageIcon("images/-.png");
	
	// 세트버거 + - 버튼
	JButton ber1Plus = new JButton(plusImage);
	JButton ber1Minus = new JButton(minusImage);
	JButton ber2Plus = new JButton(plusImage);
	JButton ber2Minus = new JButton(minusImage);
	JButton ber3Plus = new JButton(plusImage);
	JButton ber3Minus = new JButton(minusImage);
	JButton ber4Plus = new JButton(plusImage);
	JButton ber4Minus = new JButton(minusImage);
	
	// 사이드 + - 버튼
	JButton side1Plus = new JButton(plusImage);
	JButton side1Minus = new JButton(minusImage);
	JButton side2Plus = new JButton(plusImage);
	JButton side2Minus = new JButton(minusImage);
	JButton side3Plus = new JButton(plusImage);
	JButton side3Minus = new JButton(minusImage);
	JButton side4Plus = new JButton(plusImage);
	JButton side4Minus = new JButton(minusImage);
	// 음료 + - 버튼
	JButton drink1Plus = new JButton(plusImage);
	JButton drink1Minus = new JButton(minusImage);
	JButton drink2Plus = new JButton(plusImage);
	JButton drink2Minus = new JButton(minusImage);
	JButton drink3Plus = new JButton(plusImage);
	JButton drink3Minus = new JButton(minusImage);
	JButton drink4Plus = new JButton(plusImage);
	JButton drink4Minus = new JButton(minusImage);
	
    // 주문 , 취소 , 관리자 버튼
	JButton btnOrders = new JButton("주문");
	JButton btnCancel = new JButton("취소");
	JButton btnAdmin = new JButton("관리자");
    // 세트버거 수량  (기본 0)
	JLabel ber1cnt = new JLabel("0");
	JLabel ber2cnt = new JLabel("0");
	JLabel ber3cnt = new JLabel("0");
	JLabel ber4cnt = new JLabel("0");
    // 사이드 수량 (기본 0)
	JLabel side1cnt = new JLabel("0");
	JLabel side2cnt = new JLabel("0");
	JLabel side3cnt = new JLabel("0");
	JLabel side4cnt = new JLabel("0");
	// 음료 수량 (기본 0) 
	JLabel drink1cnt = new JLabel("0");
	JLabel drink2cnt = new JLabel("0");
	JLabel drink3cnt = new JLabel("0");
	JLabel drink4cnt = new JLabel("0");
	
	
	// 단품버거 이미지
	ImageIcon img1Ber = new ImageIcon("images/붉은대게와퍼.png");
	ImageIcon img2Ber = new ImageIcon("images/더콰트로치즈.png");
	ImageIcon img3Ber = new ImageIcon("images/트러플통모짜와퍼.png");
	ImageIcon img4Ber = new ImageIcon("images/통모짜와퍼.png");
	// 사이드 이미지
	ImageIcon img1Side = new ImageIcon("images/프렌치프라이.png");
	ImageIcon img2Side = new ImageIcon("images/쉐이킹프라이.png");
	ImageIcon img3Side = new ImageIcon("images/너겟킹.png");
	ImageIcon img4Side = new ImageIcon("images/21치즈스틱.png");
	// 음료 이미지
	ImageIcon img1Drink = new ImageIcon("images/코카콜라.png");
	ImageIcon img2Drink = new ImageIcon("images/스프라이트.png");
	ImageIcon img3Drink = new ImageIcon("images/아메리카노.png");
	ImageIcon img4Drink = new ImageIcon("images/핫초코.png");
    
	// JLbel 선언 후 이미지 부착
	JLabel ber1 = new JLabel(img1Ber);
	JLabel ber2 = new JLabel(img2Ber);
	JLabel ber3 = new JLabel(img3Ber);
	JLabel ber4 = new JLabel(img4Ber);

	JLabel sideMenu1 = new JLabel(img1Side);
	JLabel sideMenu2 = new JLabel(img2Side);
	JLabel sideMenu3 = new JLabel(img3Side);
	JLabel sideMenu4 = new JLabel(img4Side);
	
	JLabel drink1 = new JLabel(img1Drink);
	JLabel drink2 = new JLabel(img2Drink);
	JLabel drink3 = new JLabel(img3Drink);
	JLabel drink4 = new JLabel(img4Drink);	
	
    // 가격 변수 선언    
	int ber1Price = 10600;
	int ber2Price = 10000;
	int ber3Price = 10300;
	int ber4Price = 10300;
	int sideMenu1Price = 2700;
	int sideMenu2Price = 2500;
	int sideMenu3Price = 2600;
	int sideMenu4Price = 2200;
	int drink1Price=2500;
	int drink2Price=2500;
	int drink3Price=2100;
	int drink4Price=2600;	

	public KioskPanel01() {

		setLayout(null);
		// 주문, 취소, 관리자 버튼 사이즈 및 위치
		btnOrders.setSize(90, 50);
		btnOrders.setLocation(235, 650);
		add(btnOrders);
		btnCancel.setSize(90, 50);
		btnCancel.setLocation(355, 650);
		add(btnCancel);		
		btnAdmin.setBounds(630, 10, 80, 20);
		add(btnAdmin);
		// 버거 사이즈 및  위치
		ber1.setBounds(10, 50, 150, 150);
		add(ber1);
		ber2.setBounds(180, 50, 150, 150);
		add(ber2);
		ber3.setBounds(350, 50, 150, 150);
		add(ber3);
		ber4.setBounds(520, 50, 150, 150);
		add(ber4);			
		// 사이드메뉴 사이즈 및 위치
		sideMenu1.setBounds(10, 230, 150, 150);
		add(sideMenu1);
		sideMenu2.setBounds(180, 230, 150, 150);
		add(sideMenu2);
		sideMenu3.setBounds(350, 230, 150, 150);
		add(sideMenu3);
		sideMenu4.setBounds(520, 230, 150, 150);
		add(sideMenu4);	
		// 음료 사이즈 및 위치
		drink1.setBounds(10, 420, 150, 150);
		add(drink1);
		drink2.setBounds(180, 420, 150, 150);
		add(drink2);
		drink3.setBounds(350, 420, 150, 150);
		add(drink3);
		drink4.setBounds(520, 420, 150, 150);
		add(drink4);
		
		// 버거  +, -, 수량 사이즈 및 위치		
		ber1Minus.setBounds(50, 210, 20, 20);
		add(ber1Minus);
		ber1Plus.setBounds(100, 210, 20, 20);
		add(ber1Plus);
		add(ber1cnt);
		ber1cnt.setBounds(80, 210, 20, 20);
		// 버튼 채우기 투명으로 변경
		ber1Minus.setBorderPainted(false);
		ber1Plus.setBorderPainted(false);

		ber2Minus.setBounds(220, 210, 20, 20);
		add(ber2Minus);
		ber2Plus.setBounds(270, 210, 20, 20);
		add(ber2Plus);
		add(ber2cnt);
		ber2cnt.setBounds(250, 210, 20, 20);
		ber2Minus.setBorderPainted(false);
		ber2Plus.setBorderPainted(false);

		ber3Minus.setBounds(390, 210, 20, 20);
		add(ber3Minus);
		ber3Plus.setBounds(440, 210, 20, 20);
		add(ber3Plus);
		add(ber3cnt);
		ber3cnt.setBounds(420, 210, 20, 20);
		ber3Minus.setBorderPainted(false);
		ber3Plus.setBorderPainted(false);

		ber4Minus.setBounds(570, 210, 20, 20);
		add(ber4Minus);
		ber4Plus.setBounds(620, 210, 20, 20);
		add(ber4Plus);
		add(ber4cnt);
		ber4cnt.setBounds(600, 210, 20, 20);
		ber4Minus.setBorderPainted(false);
		ber4Plus.setBorderPainted(false);
		// 사이드 메뉴 +, -, 수량 사이즈 및 위치
		side1Minus.setBounds(50, 390, 20, 20);
		add(side1Minus);
		side1Plus.setBounds(100, 390, 20, 20);
		add(side1Plus);
		add(side1cnt);
		side1cnt.setBounds(80, 390, 20, 20);
		side1Minus.setBorderPainted(false);
		side1Plus.setBorderPainted(false);
		
		side2Minus.setBounds(220, 390, 20, 20);
		add(side2Minus);
		side2Plus.setBounds(270, 390, 20, 20);
		add(side2Plus);
		add(side2cnt);
		side2cnt.setBounds(250, 390, 20, 20);
		side2Minus.setBorderPainted(false);
		side2Plus.setBorderPainted(false);
		
		side3Minus.setBounds(390, 390, 20, 20);
		add(side3Minus);
		side3Plus.setBounds(440, 390, 20, 20);
		add(side3Plus);
		add(side3cnt);
		side3cnt.setBounds(420, 390, 20, 20);
		side3Minus.setBorderPainted(false);
		side3Plus.setBorderPainted(false);
		
		side4Minus.setBounds(570, 390, 20, 20);
		add(side4Minus);
		side4Plus.setBounds(620, 390, 20, 20);
		add(side4Plus);
		add(side4cnt);
		side4cnt.setBounds(600, 390, 20, 20);
		side4Minus.setBorderPainted(false);
		side4Plus.setBorderPainted(false);
		// 음료 +, -, 수량 사이즈 및 위치
		drink1Minus.setBounds(50, 580, 20, 20);
		add(drink1Minus);
		drink1Plus.setBounds(100, 580, 20, 20);
		add(drink1Plus);
		add(drink1cnt);
		drink1cnt.setBounds(80, 580, 20, 20);
		drink1Minus.setBorderPainted(false);
		drink1Plus.setBorderPainted(false);
		
		drink2Minus.setBounds(220, 580, 20, 20);
		add(drink2Minus);
		drink2Plus.setBounds(270, 580, 20, 20);
		add(drink2Plus);
		add(drink2cnt);
		drink2cnt.setBounds(250, 580, 20, 20);
		drink2Minus.setBorderPainted(false);
		drink2Plus.setBorderPainted(false);
		
		drink3Minus.setBounds(390, 580, 20, 20);
		add(drink3Minus);
		drink3Plus.setBounds(440, 580, 20, 20);
		add(drink3Plus);
		add(drink3cnt);
		drink3cnt.setBounds(420, 580, 20, 20);
		drink3Minus.setBorderPainted(false);
		drink3Plus.setBorderPainted(false);
		
		drink4Minus.setBounds(570, 580, 20, 20);
		add(drink4Minus);
		drink4Plus.setBounds(620, 580, 20, 20);
		add(drink4Plus);
		add(drink4cnt);
		drink4cnt.setBounds(600, 580, 20, 20);
		drink4Minus.setBorderPainted(false);
		drink4Plus.setBorderPainted(false);

		// 관리자 버튼과 이벤트를 실행하는 메소드
		btnAdmin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new LoginCheck();
			}
		});

		// 버거 수량  증가 감소 이벤트 실행
		ber1Plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = ber1cnt.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				ber1cnt.setText(Integer.toString(icnt));

			}
		});		
		ber1Minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = ber1cnt.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					ber1cnt.setText(Integer.toString(icnt));
				}
			}
		});

		ber2Plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = ber2cnt.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				ber2cnt.setText(Integer.toString(icnt));

			}
		});
		ber2Minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = ber2cnt.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					ber2cnt.setText(Integer.toString(icnt));
				}
			}
		});

		ber3Plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = ber3cnt.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				ber3cnt.setText(Integer.toString(icnt));

			}
		});
		ber3Minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt =ber3cnt.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					ber3cnt.setText(Integer.toString(icnt));
				}
			}
		});

		ber4Plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = ber4cnt.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				ber4cnt.setText(Integer.toString(icnt));

			}
		});
		ber4Minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = ber4cnt.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					ber4cnt.setText(Integer.toString(icnt));
				}
			}
		});
		
		// 사이드 메뉴 수량 증가 감소 이벤트 실행
		side1Plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = side1cnt.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				side1cnt.setText(Integer.toString(icnt));

			}
		});		
		side1Minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = side1cnt.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					side1cnt.setText(Integer.toString(icnt));
				}
			}
		});
		
		side2Plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = side2cnt.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				side2cnt.setText(Integer.toString(icnt));

			}
		});		
		side2Minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = side2cnt.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					side2cnt.setText(Integer.toString(icnt));
				}
			}
		});
		
		side3Plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = side3cnt.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				side3cnt.setText(Integer.toString(icnt));

			}
		});		
		side3Minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = side3cnt.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					side3cnt.setText(Integer.toString(icnt));
				}
			}
		});
		
		side4Plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = side4cnt.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				side4cnt.setText(Integer.toString(icnt));

			}
		});		
		side4Minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = side4cnt.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					side4cnt.setText(Integer.toString(icnt));
				}
			}
		});
		
		// 음료 메뉴 수량 증가 감소 이벤트 실행
		drink1Plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = drink1cnt.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				drink1cnt.setText(Integer.toString(icnt));

			}
		});		
		drink1Minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = drink1cnt.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					drink1cnt.setText(Integer.toString(icnt));
				}
			}
		});
		
		drink2Plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = drink2cnt.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				drink2cnt.setText(Integer.toString(icnt));

			}
		});		
		drink2Minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = drink2cnt.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					drink2cnt.setText(Integer.toString(icnt));
				}
			}
		});
		
		drink3Plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = drink3cnt.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				drink3cnt.setText(Integer.toString(icnt));

			}
		});		
		drink3Minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = drink3cnt.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					drink3cnt.setText(Integer.toString(icnt));
				}
			}
		});
		
		drink4Plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = drink4cnt.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				drink4cnt.setText(Integer.toString(icnt));

			}
		});		
		drink4Minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = drink4cnt.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					drink4cnt.setText(Integer.toString(icnt));
				}
			}
		});

		btnOrders.addActionListener(new ActionListener() {  // 주문버튼 이벤트 발생

			@Override
			public void actionPerformed(ActionEvent e) {
				// 버거 가격 합계
				String countBer1 = ber1cnt.getText();
				int icounntBer1 = Integer.parseInt(countBer1);      // Integer.parseInt 문자열 숫자로 변환
				ber1cnt.setText(Integer.toString(icounntBer1));

				String countBer2 = ber2cnt.getText();
				int icounntBer2 = Integer.parseInt(countBer2);
				ber2cnt.setText(Integer.toString(icounntBer2));

				String countBer3 = ber3cnt.getText();
				int icounntBer3 = Integer.parseInt(countBer3);
				ber3cnt.setText(Integer.toString(icounntBer3));

				String countBer4 = ber4cnt.getText();
				int icounntBer4 = Integer.parseInt(countBer4);
				ber4cnt.setText(Integer.toString(icounntBer4));
              
				int berSumPrice = (icounntBer1 * ber1Price) + (icounntBer2 * ber2Price) + (icounntBer3 * ber3Price)
						+ (icounntBer4 * ber4Price); 
				// 사이드 합계
				String countSide1 = side1cnt.getText();
				int icounntSide1 = Integer.parseInt(countSide1);      
				side1cnt.setText(Integer.toString(icounntSide1));

				String countSide2 = side2cnt.getText();
				int icounntSide2 = Integer.parseInt(countSide2);      
				side2cnt.setText(Integer.toString(icounntSide2));

				String countSide3 = side3cnt.getText();
				int icounntSide3 = Integer.parseInt(countSide3);      
				side3cnt.setText(Integer.toString(icounntSide3));

				String countSide4 = side4cnt.getText();
				int icounntSide4 = Integer.parseInt(countSide4);      
				side4cnt.setText(Integer.toString(icounntSide4));
			
				int sideSumPrice =(icounntSide1 * sideMenu1Price) + (icounntSide2 * sideMenu2Price) + (icounntSide3 * sideMenu3Price)
						+ (icounntSide4 * sideMenu4Price); 				
				
				// 음료 가격 합계
				String countDrink1 = drink1cnt.getText();
				int icounntDrink1 = Integer.parseInt(countDrink1);      
				drink1cnt.setText(Integer.toString(icounntDrink1));
				
				String countDrink2 = drink2cnt.getText();
				int icounntDrink2 = Integer.parseInt(countDrink2);      
				drink2cnt.setText(Integer.toString(icounntDrink2));
				
				String countDrink3 = drink3cnt.getText();
				int icounntDrink3 = Integer.parseInt(countDrink3);      
				drink3cnt.setText(Integer.toString(icounntDrink3));
				
				String countDrink4 = drink4cnt.getText();
				int icounntDrink4 = Integer.parseInt(countDrink4);      
				drink4cnt.setText(Integer.toString(icounntDrink4));
				
				int drinkSumPrice = (icounntDrink1 * drink1Price) + (icounntDrink2 * drink2Price) + (icounntDrink3 * drink3Price)
						+ (icounntDrink4 * drink4Price);
				
				// 버거 선택시 수량 및 가격 출력
				if (!ber1cnt.getText().equals("0")) {
					KioskPanel02.setTextBox(
							"붉은대게와퍼  \t\t" + ber1cnt.getText() + "개  \t" + icounntBer1 * ber1Price + "원 \n");
				}
				if (!ber2cnt.getText().equals("0")) {
					KioskPanel02.setTextBox(
							"더콰트로치즈  \t\t" + ber2cnt.getText() + "개  \t" + icounntBer2 * ber2Price + "원 \n");
				}
				if (!ber3cnt.getText().equals("0")) {
					KioskPanel02.setTextBox(
							"트러플통모짜와퍼 \t" + ber3cnt.getText() + "개  \t" + icounntBer3 * ber3Price + "원 \n");
				}
				if (!ber4cnt.getText().equals("0")) {
					KioskPanel02.setTextBox(
							"통모짜와퍼  \t\t" + ber4cnt.getText() + "개  \t" + icounntBer4 * ber4Price + "원 \n");
				}								
				
				// 사이드메뉴 선택시 수량 및 가격 출력
				if (!side1cnt.getText().equals("0")) {
					KioskPanel02.setTextBox(
							"프렌치프라이  \t\t" + side1cnt.getText() + "개  \t" + icounntSide1 * sideMenu1Price + "원 \n");
				}
				if (!side2cnt.getText().equals("0")) {
					KioskPanel02.setTextBox(
							"쉐이킹프라이  \t\t" + side2cnt.getText() + "개  \t" + icounntSide2 * sideMenu2Price + "원 \n");
				}
				if (!side3cnt.getText().equals("0")) {
					KioskPanel02.setTextBox(
							"너겟킹  \t\t" + side3cnt.getText() + "개  \t" + icounntSide3 * sideMenu3Price + "원 \n");
				}
				if (!side4cnt.getText().equals("0")) {
					KioskPanel02.setTextBox(
							"21치즈스틱  \t\t" + side4cnt.getText() + "개  \t" + icounntSide4 * sideMenu4Price + "원 \n");
				}				
				
				// 음료 선택시 수량 및 가격 출력
				if (!drink1cnt.getText().equals("0")) {
					KioskPanel02.setTextBox(
							"코카콜라  \t\t" + drink1cnt.getText() + "개  \t" + icounntDrink1 * drink1Price + "원 \n");
				}
				if (!drink2cnt.getText().equals("0")) {
					KioskPanel02.setTextBox(
							"스프라이트  \t\t" + drink2cnt.getText() + "개  \t" + icounntDrink2 * drink2Price + "원 \n");
				}
				if (!drink3cnt.getText().equals("0")) {
					KioskPanel02.setTextBox(
							"아메리카노  \t\t" + drink3cnt.getText() + "개  \t" + icounntDrink3 * drink3Price + "원 \n");
				}
				if (!drink4cnt.getText().equals("0")) {
					KioskPanel02.setTextBox(
							"핫초코  \t\t" + drink4cnt.getText() + "개  \t" + icounntDrink4 * drink4Price + "원 \n");
				}
				// 모든 메뉴 카운트가 0일 경우 멘트 출력
				if (ber1cnt.getText().equals("0") && ber2cnt.getText().equals("0")
						&& ber3cnt.getText().equals("0") && ber4cnt.getText().equals("0")
						&& side1cnt.getText().equals("0") && side2cnt.getText().equals("0")
						&& side3cnt.getText().equals("0") && side4cnt.getText().equals("0")
						&& drink1cnt.getText().equals("0") && drink2cnt.getText().equals("0")
						&& drink3cnt.getText().equals("0") && drink4cnt.getText().equals("0")) {
					KioskPanel02.setTextBox("주문 내역이 없습니다." + "\n");
				}
				
				//  총 가격
				KioskPanel02.setTextBox("\n 합계: " + (berSumPrice+sideSumPrice+drinkSumPrice) + "원 입니다. \n\n");
			}
		});

		btnCancel.addActionListener(new ActionListener() {  // 취소버튼 이벤트 발생

			@Override
			public void actionPerformed(ActionEvent e) {
				KioskPanel02.textbox.setText("");
				ber1cnt.setText("0");ber2cnt.setText("0");ber3cnt.setText("0");	ber4cnt.setText("0");
				side1cnt.setText("0");side2cnt.setText("0");side3cnt.setText("0");side4cnt.setText("0");
				drink1cnt.setText("0");drink2cnt.setText("0");drink3cnt.setText("0");drink4cnt.setText("0");
			}
		});

	}
}
