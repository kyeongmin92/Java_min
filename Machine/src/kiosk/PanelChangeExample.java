package kiosk;

import javax.swing.JFrame;

public class PanelChangeExample {

	public static void main(String[] args) {
		JPanelChange win = new JPanelChange();
		 
        win.setTitle("frame test");
        win.jpanel01 = new JPanel01(win);
        win.jpanel02 = new JPanel02(win);
        win.jpanel03 = new JPanel03(win);
        win.jpanel04 = new JPanel04(win);
 
        win.add(win.jpanel01);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        win.setSize(700, 900);
        win.setVisible(true);

	}

}
