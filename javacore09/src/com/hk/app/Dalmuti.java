package com.hk.app;

public class Dalmuti {
	int kind;
	int count;
	
	// 역할 - 클래스의 인스턴스 변수 초기화
	// void 사용하지 않음
	Dalmuti() {} // 기본생성자 - 없어됨 (자동생성)
	Dalmuti(int k) { kind=k; } // 매개변수가 있는 생성자만(일반생성자) 생성시 기본생성자 자동생성 안됨

}
