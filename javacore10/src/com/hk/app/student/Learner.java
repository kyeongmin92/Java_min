package com.hk.app.student;

public class Learner { // 부모 클래스
	
	int score;
	
	String calculate() {
		if(score>=60) {
			return "pass";
		} else {
			return "fail";
		}
		
	}
	
	void test() {
		calculate();
	}

}
