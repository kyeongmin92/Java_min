package com.hk.app;

// 초기화 방법

public class Intvari {
	
	//인스턴스 변수
	int x;
	int door =4;  // 기본 문 =4
	int[] map = new int[10];
	{
		for(int i=0; i<10; i++) {
			map[i]= i;
		}
		door=3; // 초기화 블럭
	}
	
	// IntVari(){} --> 생성자를 알아야 하는 이유
	
	//인스턴스 메소드
	public void print(int a) {
		int lv = 10; // 지역변수는 반드시 초기화
		System.out.println("입력값을 출력하시오="+lv+a);
	}

}
