package com.hk.app;

public class Operate {
	// 상태(속성)변수
	int sum;    // iv 인스턴스변수
	int count;  // iv 
	int avg;    // iv 
	
	static int max; // cv 클래스 변수
	static int min; // cv
	
	// 지역변수 lv
	// 코드가 반복되는 걸 줄여준다
	public static double plus (double f, double s) {
		double r = f+s; // lv
		return r;
	}
	
	public static double minus (double f, double s) {
		double r = f-s; // lv
		return r;
	}
	
	public static double multiply (double f, double s) {
		double r = f*s; // lv
		return r;
	}
	
	public static double divide (double f, double s) {
		double r = f/s; // lv
		return r;
	}
	
	public static double power (double f, double s) {
		double r = 1; // lv
		for(int i=0; i<(int)s; i++) {
			r=r*f;
		} 
		return r;
	}

}
