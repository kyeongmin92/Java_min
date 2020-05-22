package com.hk.app;

public class LoopA6 {

	public static void main(String[] args) {
		// continue 3의배수 제외하고 출력
		
	/*	for(int i=1; i<=10; i++){
			if(i%3==0) {
				continue;
			}
			System.out.println("순서= "+i);
		} */
		for(int i=1; i<=100; i++){
			if(i%3==0) {
				continue;
			}
			if(i%10!=0) {
			System.out.println("순서= "+i);
			} else {
				System.out.println("짝짝");
			}
			if(i>=30) {
				break;
			}
		}	

	}

}
