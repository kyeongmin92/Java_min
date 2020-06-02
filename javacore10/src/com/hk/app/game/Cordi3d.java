package com.hk.app.game;

public class Cordi3d extends Cordi{
	
	int z;
	
	void where_are_you() {
		getCordi(); // 1번 - z까지 출력
		super.getCordi(); // 2번
	}	
	
	// overriding
	@Override
	String getCordi() { //1번
		return "("+r+","+c+","+z+")";
	}
	

}
