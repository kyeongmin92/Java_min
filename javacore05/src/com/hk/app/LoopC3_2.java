package com.hk.app;

import java.util.Random;

public class LoopC3_2 {

	public static void main(String[] args) {
		/* 세자리의 숫자를 만들려고 합니다
		(100 * x), (10 * y), (1*z) 3개의 숫자 랜덤(1~9)
		중복이 되지 않게 만들기 (중복되는경우 다시 만들기)
		(조건문, 반복문) */
		
		int x=0;
		int y=0;
		int z=0;
		Random zen = new Random();
		while(true) {
			x=zen.nextInt(9)+1;
			y=zen.nextInt(9)+1;
			z=zen.nextInt(9)+1;
			if(x!=y && y!=z && x!=z) {
				break;
			}
		}
		System.out.println(""+x+y+z);
	}

}
