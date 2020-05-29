package com.hk.app.vo;

// 모듈 분해해서 표현
public class Rabbit { // 2차원에 토끼 한마리
	// DTO, 구조체, vo 
	
	// 좌표 x, y
	private int x;
	private int y;
	private String col;
	private boolean status; // true-화날때, false-얌전할 때
	
	// 상태값 변경, 볼려면  - getter & setter
	// 샘플 1
	public void setCol(String c){
		col = c;
	}
	public String getCol(){
		return col;
	}

}
