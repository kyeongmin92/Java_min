package com.hk.app.vo;

public class TestUnitR {

	public static void main(String[] args) {
		
		Rabbit whiteR = new Rabbit();
		whiteR.setCol("white");
		
		Rabbit pinkR = new Rabbit();
		pinkR.setCol("pink");
		
		// babyR[5] // int[] score = new int[5];
		Rabbit[] babyR = new Rabbit[5];
		for(int i=0; i<5; i++) {
			babyR[i] = new Rabbit();	
			babyR[i].setCol("brown");
		}
		
		System.out.println("pinkR= "+pinkR.getCol());
		System.out.println("babyr= "+babyR[2].getCol());
		
		// 늑대 두 마리 - blackW, insaneW
		// "아우" true
		// 무음 false
		
		Wolf blackW = new Wolf();
		blackW.setStatus(true);
		blackW.setSound("아우");
		System.out.println(blackW.isStatus()+blackW.getSound());
		
		Wolf insaneW = new Wolf();
		

	}

}
