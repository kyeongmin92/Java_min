package com.hk.app.mac;

import java.util.Scanner;

public class Machine2 {

	public static void main(String[] args) {
		
		Product p = new Product();
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이스크림 자판기 시작할까요?(1: 예, 2: 아니오)");
			int kind = in.nextInt();
			if(kind!=1) {
				System.out.print("아이스크림 자판기를 종료합니다 Good Bye!");
				break;
			}
			
			System.out.println("Welcome to 아이스크림 자판기!!");
			System.out.print("아이스크림 자판기에 넣은 금액을 입력하세요: ");
			p.enterMoney(in.nextInt());
			
			System.out.print("선택(1:딸기3000, 2:바닐라3500, 3:초코4000, 4:블루베리5000, 5:없음0)");
			p.buy(in.nextInt());
			p.printMoney();
		}
		

	}

}
