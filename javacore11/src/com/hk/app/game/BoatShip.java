package com.hk.app.game;

public class BoatShip extends Character{

	// move 재정의(오버라이드)하시오
		//x * 50
		//y * 50
	
	@Override
	void move(int x, int y, int z) {
		this.x = x*50;
		this.y = x*50;		
	}
	
	
	

}
