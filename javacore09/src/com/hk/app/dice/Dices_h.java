package com.hk.app.dice;

import java.util.Random;

public class Dices_h {
	
	//상태
	int faceValue1;
	int faceValue2;
	int wudth;
	
	//행동
	void roll() {
		Random zen = new Random();
		faceValue1 = zen.nextInt(6)+1;
		faceValue2 = zen.nextInt(6)+1;
	}
	
	int getDice1(){
		return faceValue1;
	}
	
	int getDice2(){
		return faceValue2;
	}

}
