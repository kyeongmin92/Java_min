package com.hk.app;

public class Map2D_1 {

	public static void main(String[] args) {
		//var
				int[][] map =new int[5][5]; // 5행5열
				int k =1; // 대입할값
				
				// 2중반복문
				for(int r=0; r<5; r++) {
					
					for(int c=0; c<5; c++) {
						
						map[r][c] = k;
						
						k++;
						System.out.print(" "+map[r][c]+" ");
					}
					System.out.println();
				}

		        for(int y=0; y<5; y++) {
					
					for(int x=0; x<5; x++) {
						
						System.out.print(" "+map[y][x]+" ");
					
				  }
					System.out.println();
		        } 

	}

}
