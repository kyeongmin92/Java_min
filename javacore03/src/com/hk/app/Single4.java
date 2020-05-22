package com.hk.app;

public class Single4 {

	public static void main(String[] args) {
		// 비트 전환 연산자
		byte test = 10; // 2진수로 바꿀 경우 -> 00001010 //1바이트=8비트
		//11110101
		byte result = (byte)(~test);
		System.out.println(result);
		// 정수의 연산이 이루어지는 경우에는 int(4바이트) 계산

	}

}
