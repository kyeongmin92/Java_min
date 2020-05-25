package com.hk.app;

public class Arr2ChangeCol {

	public static void main(String[] args) {
		// 가변배열
		
		// 고정 컬럼 배열
		int[][] score = new int[5][5];
		
		// 가변 컬러 배열
		int[][] score2 = new int[5][]; // row = 5
		score2[0] = new int[4];  // col =4
		score2[1] = new int[3];  // 3
		score2[2] = new int[4];  // 4
		score2[3] = new int[2];  // 2
		score2[4] = new int[5];  // 5
	}

}
