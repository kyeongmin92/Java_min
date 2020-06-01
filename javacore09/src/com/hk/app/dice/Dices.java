package com.hk.app.dice;

import java.util.Random;

public class Dices {
	
	static double width =3;	 // 주사위의 가로 세로 높이 길이의 상태
	
	int roll() {
		Random zen = new Random();
		 int x = zen.nextInt(6)+1;
		
		 return x;
	}  // 첫번째 주사위 눈의 랜덤 값
			
	public int getDice1() {
		return roll();
	}
	
	public int getDice2() {
		return roll();
	}

}
