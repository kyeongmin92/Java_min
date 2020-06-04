package com.hk.app;

public class MathMethod {

	public static void main(String[] args) {
		
		double input = 35.621313;
		System.out.println(Math.round(input));
		// 35.621313 -> 3562.51313 -->(round로 소수점이하자름) 3562 ---> 35.62
		System.out.println(Math.round(input*100)/100.0);

	}

}
