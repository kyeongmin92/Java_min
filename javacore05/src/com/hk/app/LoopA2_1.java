package com.hk.app;

public class LoopA2_1 {

	public static void main(String[] args) {
             
		int sum = 0;
		int  y =2;
		// 2 4 6 8 10 ...20
		for(int i=0; i<10; i++){
				sum = sum + y;
				y=y+2;
	}
	 System.out.println("짝수인(2~20)="+ sum);
	}

}
