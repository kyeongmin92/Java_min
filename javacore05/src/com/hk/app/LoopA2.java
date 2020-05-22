package com.hk.app;

public class LoopA2 {

	public static void main(String[] args) {
		// 반복문 0 2 4 6 8 ....20의 합
				int sum = 0;
				
				for(int i=0; i<11; i++) {
					sum = sum+(i*2);
					
				}
		System.out.println(sum);

	}

}
