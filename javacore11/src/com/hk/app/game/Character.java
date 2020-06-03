package com.hk.app.game;

// 추상클래스 --> 반드시 상속
abstract public class Character {
	
	//abstract
	int x;
	int y;
	int z;
	
	// 추상메소드 - { } 대신 abstract 붙인다
	abstract void move(int x, int y, int z);// {	}
	
	// 파일종류 - docx, jpg, txt -save();
	

}
