package com.hk.app;

public class Map2D03 {

	public static void main(String[] args) {
		/*	마방진의 조건
		행의 길이가 n이라고 하면 n*n 인 배열이된다
		가로 세로 대각선의 합의 결과값은 n(n*n+1)/2
		1 부터 n*n까지의 값이 들어간다  */
		int n =3;
		
		int[][] arr = new int[n][n];
		int a=1;
		int row=0, col = n/2;
		
		for(a=1; a<=(n*n); a++) {
			arr[row][col]=a;
			if(a%n==0) {
				row++;
			} else {
				row--;
				col++;
				if(row<0) {
					row=n-1;
				}
				if(col>=n) {
					col=0;
				}
			}
		}
		
		for(int r=0; r<n; r++) {
			for(int c=0; c<n; c++) {
				if(arr[r][c]<=9) {
					System.out.print(" "+arr[r][c]+" ");
				} else {
					System.out.print(arr[r][c]+" ");
				}
			}
			System.out.println();
		}		

	}

}
