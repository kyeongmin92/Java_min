package com.hk.app.thisIsJava;

import java.util.Scanner;

public class BankManager {
	
	
	BankUser[]	B_user = new BankUser[100];
	int m_curr;
	
	BankManager()
	{
		//생성자에서 초기화까지해준다
		for(int i=0;i<B_user.length;i++)
		{
			B_user[i] = new BankUser();
		}
		m_curr = 0;
	}
	
	
	boolean CreateAccount(String acnt, String name, double money)
	{
		if(acnt.length() > 1 && name.length() > 1 && money > 1)
		{
			B_user[m_curr].SetData(acnt, name, money);			
			m_curr++;
			
			return true;
		}
		
		return false;
	}
	
	double InMoney(String acnt, double money)
	{
		if(money <= 0) return -1;		
		
		for(int i=0;i<m_curr;i++)
		{
			if(B_user[i].Number.equals(acnt))
			{
				B_user[i].SetMoney(1, money);
				return B_user[i].GetMoney();
			}
		}
		
		return -1;
	}
	
	double OutMoney(String acnt, double money)
	{
		if(money <= 0) return -1;
		
		for(int i=0;i<m_curr;i++)
		{
			if(B_user[i].Number.equals(acnt))
			{
				double result = B_user[i].GetMoney() - money;
				if(result <= 0)
					return -1;
				
				B_user[i].SetMoney(0, result);
				return B_user[i].GetMoney();
			}
		}
		
		return -1;
	}

	
	void DrawAccountList()
	{
		if(m_curr == 0)
		{
			System.out.println("생성된 계좌가 없습니다");
			return ;
		}
		
		
		for(int i=0;i<m_curr;i++)
		{
			if(B_user[i].Name.length() > 0)
				B_user[i].Draw();
		}
	}
	
	void AccountUI()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("---------------");
		System.out.println("계좌생성 ");
		System.out.println("---------------");
		System.out.println();
		
		System.out.print("계좌번호 : ");
		String ac = scan.nextLine();
		
		System.out.print("계좌주 : ");
		String nm = scan.nextLine();
		
		System.out.print("초기입금금액 : ");
		double mo = scan.nextDouble();
		
		
		if(CreateAccount(ac, nm, mo))
			System.out.println("결과 : 계좌가 생성되었습니다");
		else
			System.out.println("결과 : 계좌생성에 실패했습니다");
	}
	
	void InputUI()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("---------------");
		System.out.println("입금 ");
		System.out.println("---------------");
		System.out.println();
		
		System.out.print("계좌번호 : ");
		String ac = scan.nextLine();
	
		System.out.print("입금액 : ");
		double mo = scan.nextDouble();
		
		//double InMoney(String acnt, double money)
		
		double result = InMoney(ac, mo);
		
		if(result == -1)
			System.out.println("입금처리에 실했습니다");
		else
			System.out.println("입금성공 잔액 : "+result);		

	}
	
	//double OutMoney(String acnt, double money)
	
	void OutPutUI()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("---------------");
		System.out.println("출금 ");
		System.out.println("---------------");
		System.out.println();
		
		System.out.print("계좌번호 : ");
		String ac = scan.nextLine();
	
		System.out.print("출금액 : ");
		double mo = scan.nextDouble();
		
	
		double result = OutMoney(ac, mo);
		
		if(result == -1)
			System.out.println("출금처리에 실했습니다");
		else
			System.out.println("출금성공 잔액 : "+result);
		
	}
}
