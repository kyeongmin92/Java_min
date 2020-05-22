package com.hk.app;

public class DualLoopB1 {

	public static void main(String[] args) {
		// 중첩 while문으로 구구단 작성하기
	/*	int x =2;		
		
		while(x<=9) {
			int y =1;	
			while(y<=9) {
				System.out.println(x+" x "+y+" = "+x*y);
				y++;
			}
			x++;
		} */
		int result = 0;
		int x=1, y=1;
		while(x<=10) { // x=1 2
			y=1; // 다음 다시 반복을 위해서 y초기화
			while(y<=10) { // y = 1 2 3 ... 10
				result=x*y;
				System.out.println(x+" x "+y+" = "+result);
				y++;
			}
			x++;
		}

	}

}
