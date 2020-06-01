package com.hk.app;

public class UnitTestDal {

	public static void main(String[] args) {
		
		// 달무티 카드 생성
		Dalmuti king = new Dalmuti();
		king.kind = 1;
		
		Dalmuti minister = new Dalmuti();
		Dalmuti minister2 = new Dalmuti();
		minister.kind =2;
		
		Dalmuti[] leader = new Dalmuti[3];
		leader[0] = new Dalmuti();
		leader[0].kind =3;
		
		Dalmuti Baron = new Dalmuti(4);
	/*	Dalmuti Baron = new Dalmuti();
		Baron.kind =4;  */

	}

}
