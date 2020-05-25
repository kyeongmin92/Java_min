package com.hk.app;

public class Arr2Score {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수 중 국어 점수만 출력
		int[][] score =  { {100,100,100}, //  0
                           {50,50,50},    //  1
                           {70,70,70},    //  2
                           {80,80,80},    //  3
                           {60,60,60} };  //  4
		int c=0;		
		System.out.println("--국어점수--");
		for(int r=0; r<5; r++ ) {
			System.out.println(score[r][c]);
			// 행이 r 열이 c
		}
		
		// [2]번 학생의 국,영,수 점수 출력
		int r=2;
		System.out.println("--[2]번 학생의 국영수 점수--");
		for(int cc=0; cc<3; cc++) {
			System.out.print(score[r][cc]+" ");
		}
		System.out.println();
		
		// 전체를 출력
		System.out.println("-- 전체 점수 --");
		for(int rr=0; rr<5; rr++) {
			for(int cc=0; cc<3; cc++) {
				System.out.print(score[rr][cc]+" ");
			}
			System.out.println();
		}  
		
	/*	System.out.println("-- 전체 점수 --");
		for(int rr=0; rr<score.length; rr++) {
			for(int cc=0; cc<score[0~4 사용가능].length; cc++) {
				System.out.print(score[rr][cc]+" ");
			}
			System.out.println();
		} */

	}

}
