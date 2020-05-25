package com.hk.app;

public class ArrCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] src = { 1,2,3,4,5};
		int[][] des = new int[5][5];
		/* 0 0 0 0 0
		 * 0 0 0 0 0
		 * 1 2 3 4 5 에 복사
		 * 0 0 0 0 0
		 * 0 0 0 0 0
		 */
		for(int i=0; i<5; i++) {
			des[2][i] = src[i];
		}
		
		for(int r=0; r<des.length; r++) {		
	     	for(int c=0; c<des[0].length; c++) {
			System.out.print(des[r][c]+" ");
		}
		System.out.println();
	  }	
		/* 0 0 0 0 1
		 * 0 0 0 0 2
		 * 0 0 0 0 3
		 * 0 0 0 0 4
		 * 0 0 0 0 5
		 *  
		 * for(int i=0; i<5; i++) {
			des[2][i] = src[i];
		}
		for(int r=0; r<des.length; r++) {		
	     	for(int c=0; c<des[0].length; c++) {
			System.out.print(des[r][c]+" ");
		}
		System.out.println();
	  }	
		 */

	}

}
