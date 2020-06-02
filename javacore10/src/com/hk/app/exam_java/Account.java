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
	
/*	private String ano;
	private String owner;
	private int balance;
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() { return ano;}
	public void setAno(String ano) { this.ano = ano;}
	public String getOwner() { return owner;}
	public void setOwner(String owner) { this.owner = owner;}
	public int getBalance() { return balance;}
	public void setBalance(int balance) { this.balance = balance;}  */
	

}
