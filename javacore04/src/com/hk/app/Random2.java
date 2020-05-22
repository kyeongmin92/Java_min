package com.hk.app;

public class Random2 {

	public static void main(String[] args) {
		// Math.random() = ? 반환값 double
		double num = Math.random();
		System.out.println("임의의 실수숫자 : "+num);
		// 0.00000~0.99999
		
		// 0~9까지
		double num2 = num*10; // 0.00000~ 9.99999
		System.out.println("임의의 실수 숫자2 " + num2);
		int no2 = (int)num2;
		System.out.println("임의의 정수숫자 : "+ no2);
		int no3 = (int)no2+1;
		System.out.println("임의의 정수숫자 : "+ no3);
		
		// 주사위 1~6
		double num0 = Math.random();
		// 0.0000~0.9999(=1)
		// 0.0000~0.9999(=6)
		int result = (int)(num0*6)+1;
		System.out.println("주사위게임수는? "+ result);

	}

}
