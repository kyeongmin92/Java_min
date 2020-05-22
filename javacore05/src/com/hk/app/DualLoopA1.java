package com.hk.app;

public class DualLoopA1 {

	public static void main(String[] args) {
		// 구구단
		// 4 * 3 = 12 ( i * j = i*j)
		for(int i=1; i<=10; i++) {
			System.out.println(i+"단");
			for(int j=1; j<=10; j++) {
				
				System.out.println(i+" x "+ j + " = "+ (i*j));
			}
		
		}


	}

}
