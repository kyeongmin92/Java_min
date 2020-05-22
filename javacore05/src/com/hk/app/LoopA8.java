package com.hk.app;

public class LoopA8 {

	public static void main(String[] args) {
		// 1~100까지 반복 (int i를 사용)
		// 2의 배수 또는 3의 배수 아니면 건너뛰고 3의 배수는 더해줌
		int sum =0;
		for (int i=1; i<=100; i++) {
			if(i%2==0 || i%3!=0) {
				continue;				
			} 
				sum += i;						
		}
		System.out.println(sum); 
	/*	for (int i=1; i<=100; i++) {
			if(i%2==0) {
				continue;				
			} else if(i%3==0) {
				sum += i;		
			}
		} 
		System.out.println(sum); */
	}

}
