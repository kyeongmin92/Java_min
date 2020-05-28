package com.hk.app;

public class Pita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int a = 4;
		int b = 3;
		//c =Math.sqrt(a*a + b*b);
		//System.out.println("빗변의 길이 ="+c);
		
		System.out.println(distance(a,b));
		
		int x=0;
		int y=0;
		double z=0.0d; // 거리구할 때
		
		x=40;
		y=20;
		//z =Math.sqrt(x*x + y*y);
		//System.out.println("빗변의 길이="+z);
		z = distance(x,y);
		System.out.println(z);

	}
	
	// 피타고라스 거리구하는 공식
	public static double distance(int a, int b) {
		double result =0.0d;
		result = Math.sqrt(a*a + b*b);
		return result;
	}
	

}
