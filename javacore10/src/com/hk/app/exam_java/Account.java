package com.hk.app.exam_java;

public class Account {
	private int balance;
	static int MIN_BALANCE =0;
	static int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		
		if(MIN_BALANCE>balance) {
			return;
		} else if(balance>MAX_BALANCE) {
			return;
		}
		this.balance = balance;
	}  

}
