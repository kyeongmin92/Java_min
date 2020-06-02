package com.hk.app.dice;

public class Board1_h {

	public static void main(String[] args) {
		
		System.out.println("모두의 마블 시작");
		
		Dices_h myDice = new Dices_h();
		
		myDice.roll();
		
		System.out.println("첫번째 플레이어의 주사위 수 =" +"(" +myDice.getDice1()
		+ ", "+ myDice.getDice2()+")");
		System.out.println("두 수의 합은 ="+(myDice.getDice1()+myDice.getDice2()));

	}

}
