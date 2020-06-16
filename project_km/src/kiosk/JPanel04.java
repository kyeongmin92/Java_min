package kiosk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class JPanel04 extends JPanel {

	JPanelChange win;
	JButton btnSetMenu = new JButton("세트메뉴");
	JButton btnSingleMenu = new JButton("단품");
	JButton btnSide = new JButton("사이드");
	JButton btnDrink = new JButton("음료");
	
	JButton btn1MenuPlus = new JButton("+");
	JButton btn1MenuMinus = new JButton("-");
	
	JButton btn2MenuPlus = new JButton("+");
	JButton btn2MenuMinus = new JButton("-");
	
	JButton btn3MenuPlus = new JButton("+");
	JButton btn3MenuMinus = new JButton("-");
	
	JButton btn4MenuPlus = new JButton("+");
	JButton btn4MenuMinus = new JButton("-");
	
	JLabel btn1Label = new JLabel("0");
	JLabel btn2Label = new JLabel("0");
	JLabel btn3Label = new JLabel("0");
	JLabel btn4Label = new JLabel("0");
	
	JButton btnOK= new JButton("확인");
	JButton btnCancel = new JButton("취소");

	JButton btnAdmin = new JButton("관리자");

	ImageIcon img1 = new ImageIcon("images/코카콜라.png");
	ImageIcon img2 = new ImageIcon("images/스프라이트.png");
	ImageIcon img3 = new ImageIcon("images/아메리카노.png");
	ImageIcon img4 = new ImageIcon("images/핫초코.png");

	JLabel drink1 = new JLabel(img1);
	JLabel drink2 = new JLabel(img2);
	JLabel drink3 = new JLabel(img3);
	JLabel drink4 = new JLabel(img4);
	
	int Drink1Price = 2500;
	int Drink2Price = 2500;
	int Drink3Price = 2100;
	int Drink4Price = 2600;

	public JPanel04(JPanelChange win) {
		setLayout(null);
		this.win = win;
		
		btnOK.setSize(70, 20);
		btnOK.setLocation(450, 10);
		add(btnOK);

		btnCancel.setSize(70, 20);
		btnCancel.setLocation(530, 10);
		add(btnCancel);

		btnSetMenu.setSize(90, 20);
		btnSetMenu.setLocation(10, 10);
		add(btnSetMenu);
		btnSingleMenu.setSize(70, 20);
		btnSingleMenu.setLocation(110, 10);
		add(btnSingleMenu);
		btnSide.setSize(80, 20);
		btnSide.setLocation(190, 10);
		add(btnSide);
		btnDrink.setSize(70, 20);
		btnDrink.setLocation(280, 10);
		add(btnDrink);

//		pan.setLayout(null);
//		pan.add(drink1);
		drink1.setBounds(10, 50, 130, 150);
		add(drink1);

//		pan.add(drink2);
		drink2.setBounds(160, 50, 130, 150);
		add(drink2);

//		pan.add(drink3);
		drink3.setBounds(310, 50, 130, 150);
		add(drink3);

//		pan.add(drink4);
		drink4.setBounds(460, 50, 135, 150);
		add(drink4);

		btnAdmin.setBounds(630, 10, 80, 20);
//		pan.add(btnAdmin);
		add(btnAdmin);
		
		btn1MenuMinus.setBounds(30, 210, 20, 20);
		add(btn1MenuMinus);
		btn1MenuPlus.setBounds(80, 210, 20, 20);
		add(btn1MenuPlus);
		add(btn1Label);
		btn1Label.setBounds(60, 210,20, 20);
		
		btn2MenuMinus.setBounds(200, 210, 20, 20);
		add(btn2MenuMinus);
		btn2MenuPlus.setBounds(250, 210, 20, 20);
		add(btn2MenuPlus);
		add(btn2Label);
		btn2Label.setBounds(230, 210,20, 20);
		
		btn3MenuMinus.setBounds(370, 210, 20, 20);
		add(btn3MenuMinus);
		btn3MenuPlus.setBounds(420, 210, 20, 20);
		add(btn3MenuPlus);
		add(btn3Label);
		btn3Label.setBounds(400, 210,20, 20);
		
		btn4MenuMinus.setBounds(550, 210, 20, 20);
		add(btn4MenuMinus);
		btn4MenuPlus.setBounds(600, 210, 20, 20);
		add(btn4MenuPlus);
		add(btn4Label);
		btn4Label.setBounds(580, 210,20, 20);

		// 관리자 버튼과 이벤트를 실행하는 메소드
		btnAdmin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new loginCheck();
			}
		});

		btnSetMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				win.change("panel01");
			}
		});

		btnSingleMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				win.change("panel02");
			}
		});

		btnSide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				win.change("panel03");
			}
		});

		btnDrink.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				win.change("panel04");
			}
		});

		btn1MenuPlus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = btn1Label.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				btn1Label.setText(Integer.toString(icnt));

			}
		});

		btn1MenuMinus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = btn1Label.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					btn1Label.setText(Integer.toString(icnt));
				}
			}
		});

		btn2MenuPlus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = btn2Label.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				btn2Label.setText(Integer.toString(icnt));

			}
		});
		btn2MenuMinus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = btn2Label.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					btn2Label.setText(Integer.toString(icnt));
				}
			}
		});

		btn3MenuPlus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = btn3Label.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				btn3Label.setText(Integer.toString(icnt));

			}
		});
		btn3MenuMinus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = btn3Label.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					btn3Label.setText(Integer.toString(icnt));
				}
			}
		});

		btn4MenuPlus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = btn4Label.getText();
				int icnt = Integer.parseInt(cnt) + 1;
				btn4Label.setText(Integer.toString(icnt));

			}
		});
		btn4MenuMinus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cnt = btn4Label.getText();

				if (!cnt.equals("0")) {
					int icnt = Integer.parseInt(cnt) - 1;
					btn4Label.setText(Integer.toString(icnt));
				}
			}
		});

		btnOK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {				
				String count1 = btn1Label.getText();
				int icounnt1 = Integer.parseInt(count1);
				btn1Label.setText(Integer.toString(icounnt1));
				
				String count2 = btn2Label.getText();
				int icounnt2 = Integer.parseInt(count2);
				btn2Label.setText(Integer.toString(icounnt2));
				
				String count3 = btn3Label.getText();
				int icounnt3 = Integer.parseInt(count3);
				btn3Label.setText(Integer.toString(icounnt3));
				
				String count4 = btn4Label.getText();
				int icounnt4 = Integer.parseInt(count4);
				btn4Label.setText(Integer.toString(icounnt4));
				
				int sumPrice = (icounnt1*Drink1Price)+(icounnt2*Drink2Price)+(icounnt3*Drink3Price)
						+(icounnt4*Drink4Price);
				
				if (!btn1Label.getText().equals("0")) {						
					win.jpanel05.setTextBox("코카콜라  \t" + btn1Label.getText() +"개  \t"+icounnt1*Drink1Price+ "원 \n");
				}
				if (!btn2Label.getText().equals("0")) {					
					win.jpanel05.setTextBox("스프라이트  \t" + btn2Label.getText() + "개  \t"+icounnt2*Drink2Price+ "원 \n");
				}
				if (!btn3Label.getText().equals("0")) {					
					win.jpanel05.setTextBox("아메리카노  \t" + btn3Label.getText() +"개  \t"+icounnt3*Drink3Price+ "원 \n");
				}
				if (!btn4Label.getText().equals("0")) {					
					win.jpanel05.setTextBox("21핫초코  \t" + btn4Label.getText() + "개  \t"+icounnt4*Drink4Price+ "원 \n");
				}

				if (btn1Label.getText().equals("0") && btn2Label.getText().equals("0")
						&& btn3Label.getText().equals("0") && btn4Label.getText().equals("0")) {
					win.jpanel05.setTextBox("주문 내역이 없습니다." + "\n");
				}
				win.jpanel05.setTextBox("\n 음료 합계: "+sumPrice+"원 입니다. \n\n");
			}
		});

		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				win.jpanel05.textbox.setText("");
				btn1Label.setText("0");
				btn2Label.setText("0");
				btn3Label.setText("0");
				btn4Label.setText("0");
			}
		});
	}
}
