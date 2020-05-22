package com.hk.app;

public class LoopA7 {

	public static void main(String[] args) {
		// 1~100까지 짝수의 합 %, continue 사용
		int sum = 0;  // 합계
				
		for (int i=1; i<=100; i++) {			
			if(i%2!=0) { // 홀수				
				continue;
			} 
	     	sum += i;			
		}
		System.out.println(sum);
	}

}
