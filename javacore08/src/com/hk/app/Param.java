package com.hk.app;

public class Param {

	public static void main(String[] args) {
		
		// 정수변수 2개 x, y 곱하기
		int x =3;
		int y =4;
		int mux = Multiply(x, y);
		System.out.println("두 수의 곱 = "+mux);
		System.out.println("x = "+x);
		System.out.println("y = "+y);

	}
	
	// 곱하는 함수 Multiply(int a, int b)
	public static int Multiply(int a, int b) {
		int result = a * b;
		a += 10; // x값에 영향없음
		b += 20; // y값에 영향없음
		return result;
	}

}
