package com.hk.app.elect;

public class TestElect {

	public static void main(String[] args) {
		
		// Tv클래스 선언해서 미니tv 생성
		// 비교1 - 기본타입변수 선언
		// int age; 
		// 비교2 - 배열변수 선언
		// int[] scores = new int[10];
		Tv mtv = new Tv();
		mtv.chgChn(10);
		System.out.println("현재채널은="+ mtv.chn);
		mtv.chgChn(5);
		System.out.println("현재채널은="+ mtv.chn);
		mtv.powOn();
		System.out.println("전원은 ="+mtv.pow);
		mtv.volUp();
		
		//ElectCar 클래스 선언해서 scar
		ElectCar scar = new ElectCar();
		scar.col = "blue";
		System.out.println("스카의 색깔="+scar.col);
		scar.year = "2015";
		System.out.println("스카의 속도="+scar.vel);
		scar.Accelate(5);
		scar.Accelate(5);
		System.out.println("스카의 속도="+scar.vel);
		scar.Break();
		System.out.println("차량 break="+scar.vel);
		
		ElectCar etruk = new ElectCar();
		etruk.col ="gray";
		etruk.year ="2018";
		System.out.println("트럭의 속도="+etruk.vel);
	}

}
