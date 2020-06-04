package com.hk.app.shop;

public class MoPayServiceImpl implements PayService{

	@Override
	public void payBycard() {
		System.out.println("카카오뱅크로 결재한다");		
	}

	@Override
	public void payByMilege() {
		System.out.println("마일리지로 결재한다");		
	}

	@Override
	public void payByMoney() {
		System.out.println("무통장 입금한다");		
	}
	
	//
	public void payByFree() {
		
	}

	

}
