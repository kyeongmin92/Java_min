package com.hk.app.student;

public class Exami extends Learner{	
	
	String calculate() {
		if(score>=80) {
			return "pass";
		} else {
			return "fail";
		}
		
	}
	
	void test() {
		calculate();
	}


}
