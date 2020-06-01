package com.hk.app.dice;

public class Board1 {

	public static void main(String[] args) {
		
		Dices myDices = new Dices();
		int faceValue1 = myDices.getDice1();
		int faceValue2 = myDices.getDice2();
		System.out.println(faceValue1+", "+faceValue2);

	}

}
