package Exam;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		int score = scan.nextInt();
		
		
		if(score>=90 ) {
			grade="A";
			if (score>=95) {
				grade += "+"; // grade = grade "+";
			}
		} else if(score>=80 ) {
			grade="B";
			if (score>=85) {
				grade += "+"; // grade = grade "+";
			}
		} else if(score>=70) {
			grade="C";
			if (score>=75) {
				grade += "+"; // grade = grade "+";
			}
		} else if(score>=60) {
			grade="D";
			if (score>=65) {
				grade += "+"; // grade = grade "+";
			}
		} else { 
			grade="재시험";
		}
		System.out.println(grade + " 입니다.");
		
	
			
		
		
		
	}

}
