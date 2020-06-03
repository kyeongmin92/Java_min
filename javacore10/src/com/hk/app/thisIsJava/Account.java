package com.hk.app.thisIsJava;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	public Account(String ano, String owner, int balance) {
		this.ano = ano;  // 계좌번호
		this.owner = owner; // 계좌주
		this.balance = balance; // 초기입금액
	}
	
	public String getAno() { return ano;}
	public void setAno(String ano) { this.ano = ano;}
	public String getOwner() { return owner;}
	public void setOwner(String owner) { this.owner = owner;}
	public int getBalance() { return balance;}
	public void setBalance(int balance) { this.balance = balance;}  

}

