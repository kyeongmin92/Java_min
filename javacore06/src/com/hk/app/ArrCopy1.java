package com.hk.app;

public class ArrCopy1 {

	public static void main(String[] args) {
		// 배열의 복사
		int[] src = { 1,2,3,4,5};
		int[] des = new int[10];
		
	/*	// 1 2 3 4 5 0 0 0 0 0
	 * for(int i=0; i<src.length; i++) {
			des[i] = src[i];
		}
	
		for(int i=0; i<des.length; i++) {
			System.out.print(des[i]+ " ");
		} */
		
		// 0 0 0 0 1 2 3 4 5
		for(int i=0; i<src.length; i++) {
			des[i+5] = src[i];
		}
		
		for(int i=0; i<des.length; i++) {
			System.out.print(des[i]+ " ");
		}
		

	}

}
