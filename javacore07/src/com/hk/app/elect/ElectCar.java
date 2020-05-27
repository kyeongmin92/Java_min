package com.hk.app.elect;

public class ElectCar {
	// 1.상태
    String col;  // 차량 색깔
	int gear;    // 기어 1 2 3 4
	float vel;   // 현재속도 0.0 100.5
	String year; // 연식 2012 2020
	
	// 2.행동, 동작
	// 속도올리기	// 속도내리기
	void Accelate(int a) { vel += (float)a*10.0f; }
	// 기어변경 	// 브레이크 멈추기
    void ModifyGear(int g) {gear = g;}

    void Break() { 
    	vel -= 30.0f;
    	if(vel<0) {
    		vel =0.0f;
    	}
    }
}