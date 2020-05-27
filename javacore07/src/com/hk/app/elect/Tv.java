package com.hk.app.elect;

public class Tv { // 전체프로그램 한 모듈(부분)
	// 1. 상태
	boolean pow; // 전원 true, false
	String col;  // 색깔
	int vol;     // 볼륨
	float size;  // 크기
	int chn;      // 채널
	
	// 2.행동
	// 전원 on
	void powOn() { pow = !pow; }
	// 볼륨 up
	void volUp() { vol++; }
	// 채널 change
	void chgChn(int c) { chn =c; }
  

}
