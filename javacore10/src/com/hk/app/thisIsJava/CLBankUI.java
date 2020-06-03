package com.hk.app.thisIsJava;

import java.util.Scanner;

public class CLBankUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		BankManager	Mng = new BankManager();
		
		boolean isLoop = true;
		
		while(isLoop)
		{
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택 : ");
			int sel = scan.nextInt();
			
			
			switch(sel)
			{
			case 1:
				Mng.AccountUI();
			break;
			
			case 2:
				Mng.DrawAccountList();
			break;
			
			case 3:
				Mng.InputUI();
			break;
			
			case 4:
				Mng.OutPutUI();
			break;
			
			case 5:
				System.out.println("프로그램 종료");
				isLoop = false;
			break;
			
			default:
				System.out.println("다시 입력하세요");
			break;
			}
		}

	}

}
