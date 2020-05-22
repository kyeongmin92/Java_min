package com.hk.app;

public class Dual6 {

	public static void main(String[] args) {
		// 논리연산 && 양쪽모두 true일 경우 true
		// 김건우 age=23, tall=180
		// 이지호 age=19, tall=170
		int kage=23, ktall=180;
		int lage=19, ltall=170;
		
		boolean knes = kage>30 && ktall<190;
		boolean lnes = lage<30 && ltall<180;
		System.out.println(knes);
		System.out.println(lnes);
	

	}

}
