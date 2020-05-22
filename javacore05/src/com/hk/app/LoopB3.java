package com.hk.app;

import java.util.Random;

public class LoopB3 {

	public static void main(String[] args) {
		/* Random 숫자 (0-9)
		 * 계속해서 숫자 발생하다가
		 * 7이 나오면 반복을 중지하고 전부출력
		 */
		int rnum =0;
		
		Random zen = new Random();
		while(true) { // true 참 -> 무한반복
			rnum = zen.nextInt(10); // 0~9
			System.out.println(rnum);
			if(rnum==7) {
				break;
			}
		}

	}

}
