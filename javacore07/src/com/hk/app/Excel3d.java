package com.hk.app;

public class Excel3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int[][][] scores = new int[3][4][2]; // 총 24개 [2][3][1]
		
		int[][][] scores = {
				{ {100, 70},
			      {90, 60},
				  {90, 80},
				  {100, 70} }, // 1반
				
				{ {90, 80},
				  {80, 70},
				  {90, 700},
				  {80, 80} }, // 2반
				 
				{ {80, 70},
				  {90, 70},
			      {100, 80},
				  {80, 80} } // 3반 				  
		};
		
		// 초기값 확인
		for(int z=0; z<3; z++) {
			for(int r=0; r<4; r++) {
				for(int c=0; c<2; c++) {
					System.out.print(scores[z][r][c]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		//	1~3반까지 국어점수의 총합은?
		System.out.println("===== 국어 점수의 총합 =====");
		int sum = 0;
		for(int z=0; z<3; z++) {
			for(int r=0; r<4; r++) {
				int c=0; // 국어
				sum += scores[z][r][c];
			}
		}
		System.out.println(sum+"점 입니다.");

	}

}
