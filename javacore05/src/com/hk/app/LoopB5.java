package com.hk.app;

public class LoopB5 {

	public static void main(String[] args) {
	/*	(연습예)무한루프를 돌다가
		sum = 1,000,000,000 원
		하루에 2,220,000원, sum <= 0 이면 멈춤
		몇일째에서 멈추는가? */
		
		int dayCost = 2220000;
		int bank = 1000000000;
		int day=1;
		while(true) {
			bank -= dayCost;
		
			if(bank<=0) {
				break;
			}
		System.out.println(day+"번째 날, "+day*dayCost+"원 지출, 잔고는 "+bank+"원 입니다.");
			day++;
		}		
	}

}
