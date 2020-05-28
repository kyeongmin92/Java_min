package com.hk.app;

public class Sum {

	public static void main(String[] args) {
		
		// 1~100까지 합을 구하시오
		// 1~n까지 합을 구하시오
		int n = 200;
		int sum =0, sum2 =0;
		for(int i=1; i<=n; i++) {
			sum += i;		
		}
		System.out.println(sum);
		//
		sum2 = summation(n);
		System.out.println(sum2);
		//
		System.out.println(summation(n));
		//
		int x =1000;
		summation(x);
		

	}
	
	public static int summation(int x) {
		int result = 0;
		
		for(int i=1; i<=x; i++) {
			result += i;		
		}
		return result;
	}

}
