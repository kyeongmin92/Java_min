package com.hk.app;

public class ArrUse01 {

	public static void main(String[] args) {
	/*	// score 과학 점수배열 선언하고
		// {100, 70, 60, 80, 90, 100}
				
		int[] score = { 100, 70, 60, 80, 90, 100};
		//각각 출력
		System.out.println("배열의 사이즈= "+ score.length);
		for(int x=0; x<score.length; x++) {
			System.out.println(x+"번째 배열값="+score[x]);
		}
		    System.out.println(score[2]);    */
		
		// score 국어 점수배열 선언, 학생 여섯명
		// {100, 70, 60, 80, 90, 100} 총합 구하기
		
		int[]score = {100, 70, 60, 80, 90, 100};
		int sum =0;
		for(int i=0; i<score.length; i++) {
			 System.out.println(i+"번째 학생 국어점수 = " + score[i]);
			sum += score[i];			
		}
		System.out.println("국어 점수의 합은 : "+sum);
	}

}
