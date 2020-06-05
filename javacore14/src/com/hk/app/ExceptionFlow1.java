package com.hk.app;

public class ExceptionFlow1 {

	public static void main(String[] args) {
		
		try{
		System.out.println(1+"번째 코드");
		System.out.println(2+"번째 코드");
		System.out.println(3+"번째 코드");
		int a = 10;	int b = 0;	int c = a/b; // 계산오류 발생
		// 위에서 에러가 나면 어디로 가는가?
		// 오류가 발생한 시점에서 catch로 넘어감
		System.out.println(4+"번째 코드");
		System.out.println(5+"번째 코드");
		}catch(ArithmeticException e) {
		System.out.println(6+"번째 코드:예외코드 출력");
		System.out.println(7+"번째 코드");
		}
		System.out.println(8+"번째 코드");
		
		
	}

}
