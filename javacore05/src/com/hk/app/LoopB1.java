package com.hk.app;

public class LoopB1 {

	public static void main(String[] args) {
		// while문으로 1~100까지 누적합 구하기
		int sum = 0;
		int x = 1;
		while(x<=100) { // 1~100 참 101 거짓
			sum += x++;
		//	x++;
		}
		System.out.println("1~100까지의 합= "+sum);

	}

}
