package com.hk.app.exam;

public class College extends Student{
	
	//기본생성자로 name 초기화
	College(String n){
		name=n;
	}

	@Override
	public void computeGrade() {
		if(score>=90) {
			grade = "A";
		} else if (score>=80) {
			grade = "B";
		} else if (score>=70) {
			grade = "C";
		} else {
			grade = "D";
		}		
	}
	
	public static void main(String[] args) {
		//Student boy = new Student(); 추상클래스는 선언불가
		College choi = new College("최수정");
		choi.score=90; //수학점수
		choi.computeGrade();
		System.out.println(choi.name);
		System.out.println(choi.grade);
	}

}
