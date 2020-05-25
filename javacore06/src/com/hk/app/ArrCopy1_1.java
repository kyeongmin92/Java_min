package com.hk.app;

public class ArrCopy1_1 {

	public static void main(String[] args) {
		// 배열의 복사
		int[] src = { 1,2,3,4,5};
		int[] des = new int[10];
	    int[] des2 = new int[10];
	
		for(int i=0; i<src.length; i++) {
			des[i+5] = src[i];
		}
		
		for(int i=0; i<des.length; i++) {
			System.out.print(des[i]+ " ");
		}
		
		for(int i=0; i<des2.length; i++) {
			System.arraycopy(src, 0, 1, 2, src[2]);
		}
		System.out.println();

	}

}
