package com.hk.app;

import java.util.Scanner;

public class Select1 {

	public static void main(String[] args) {
		// score = ? 70점이상이면 합격
		// 70점 미만이면 불학격 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("시험점수를 입력하시오: ");
		int score = scan.nextInt();
		
		System.out.print("결과는 : ");
		if(score>=70) { System.out.println("합격"); }
		else { System.out.println("불합격"); }
		
	 

	}

}
