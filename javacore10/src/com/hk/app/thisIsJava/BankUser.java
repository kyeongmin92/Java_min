package com.hk.app.thisIsJava;

public class BankUser {
	
	String Number;
	String Name;
	double money;
	
	BankUser()
	{
		Number = "";
		Name = "";
		money = 0;
	}
	
	void SetData(String Nb, String Nm, double mo)
	{
		Number = Nb;
		Name = Nm;
		money = mo;
	}
	
	double GetMoney()		{ return money;	}
	void SetMoney(int opt, double mon)
	{
		if(opt == 1)
			money += mon;
		else
			money = mon;
	}
	
	void Draw()
	{
		System.out.println(Number+' '+Name+' '+money);
	}
}
