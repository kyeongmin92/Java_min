package com.hk.app.sports;

public class Car {
	//상태 - 인스턴스 변수
	String color; // red, blue, gray, black
	boolean gear; // true - 오토, false - 수동
	int door;     // 4개 2개
	//생성자 - 변수초기화함수
	
	//동작-인스턴스 함수 메소드
	
	Car(){}
	Car(String c){
		color = c;
		// this(c, false, 4); // == Car(c, false, 4);
		}
	
	Car(String c, boolean g){
		color =c; gear =g;		
		}
	
	Car(String c, boolean g, int d){
		color =c; gear =g; door =d;
		}

}
