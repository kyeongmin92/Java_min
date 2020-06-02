package com.hk.app.game;

public class Marine extends Unit{
	
	String weapon;
	int water;
	
	Marine(){		
		initPos(); // 메소드도 상속이 가능
		life = true;
		getWeapon("Knife");
		water = 3;		
	}
	
	void getWeapon(String w) {
		weapon = w;
	}
	

}
