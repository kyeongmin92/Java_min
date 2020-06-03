package com.hk.app;

public class Zoo {

	public static void main(String[] args) {
		
		System.out.println("서울대공원에 오신 것을 환영합니다.");
		System.out.println("-----------------------");
		
		Animal lion = new Animal();
		System.out.println("사자 다리="+lion.getLeg());
	//	System.out.println("사자 다리="+lion.Leg());  변수가 private접근안됨 
		
		System.out.println("사자가 좋아하는 음식="+lion.getFood());
		
		lion.setMyFood("햄버거");
		System.out.println("사자가 좋아하는 음식="+lion.getFood());
	}

}
