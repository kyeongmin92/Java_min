package com.hk.app;

public class Card <T> {
	//카드번호
	//카드모양
	 T num;
	 T type;
	public T getNum() {
		return num;
	}
	public void setNum(T num) {
		this.num = num;
	}
	public T getType() {
		return type;
	}
	public void setType(T type) {
		this.type = type;
	}
	
	
	

}
