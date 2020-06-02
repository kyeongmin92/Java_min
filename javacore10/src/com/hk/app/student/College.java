package com.hk.app.student;

public class College extends Learner{
	
	int toeic;
	College(){
		super(); // 부모 생성자 호출
		toeic = 600;
	}
	
	
	String calculate() {
		String grade ="D";
		if(score>=90)grade = "A";
		 else if(score>=80)	grade= "B";
		 else if (score>=70) grade= "C";
		 return grade;
				
	}
	
	void test() {
		calculate();
	}

}
