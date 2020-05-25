package com.hk.app;

import java.util.Random;

public class ArrRandom {

	public static void main(String[] args) {
	/*	정수배열[10], 랜덤한 숫자를 입력 ArrRandom
		ran[0] = 1~10 (중복되도 상관없음) 
		.
		.
		.
		ran[9] 홀수와 짝수를 분리해서 출력 */
		
		// 정수배열선언 생성
		int[] ran = new int[10];
		// 배열안에 랜덤값을 대입하기 위해 Random클래스 선언
		Random zen = new Random();
		
		// | | | | | | | | | | 
		for (int i=0; i<ran.length; i++) {
		ran[i] = zen.nextInt(10)+1;
		System.out.print(ran[i]+ " ");
		}
		System.out.println();
		
		for(int i=0; i<ran.length; i++) {
			if(ran[i]%2==0) {
				System.out.print(ran[i]+ " ");
			}			
		}
		
		System.out.println();
		
		for(int i=0; i<ran.length; i++) {
			if(ran[i]%2==1) {
				System.out.print(ran[i]+" ");
			}
		}
		System.out.println();

	}

}
