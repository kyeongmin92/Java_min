package com.hk.app.game;

public class Hunter extends Character{
	
	Hunter(){
		x=0;
	}

	@Override
	void move(int x, int y, int z) {
		
	   this.x = x*3;
	   this.y = y*3;
	   this.z = z*3;
	   redeHouse();
	}
	
	void redeHouse() {
		
	}

}
