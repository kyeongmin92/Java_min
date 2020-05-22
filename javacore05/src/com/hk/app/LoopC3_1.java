package com.hk.app;

import java.util.Random;

public class LoopC3_1 {

	public static void main(String[] args) {
		/* 세자리의 숫자를 만들려고 합니다
		(100 * x), (10 * y), (1*z) 3개의 숫자 랜덤(1~9)
		중복이 되지 않게 만들기 (중복되는경우 다시 만들기)
		(조건문, 반복문) */
		// do-while문 사용
		Random rnum = new Random();
		int x, y, z;
		do {
			x=rnum.nextInt(9)+1;
			y=rnum.nextInt(9)+1;
			z=rnum.nextInt(9)+1;
        } while(x==y || x==z || y==z);
		System.out.print(""+x+y+z);
	}

}
