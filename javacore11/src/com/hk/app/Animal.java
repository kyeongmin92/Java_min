package com.hk.app;

public class Animal {
	
	private int leg;
	private int wing;
	private String food;
	//생성자
	public Animal(){
		leg=4;
		wing=0;		
	}
	
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}
	
	public void setMyFood(String food) {
		setFood(food);
	}
	
	
	
	

}
