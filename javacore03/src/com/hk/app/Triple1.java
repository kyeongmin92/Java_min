package com.hk.app;

public class Triple1 {

	public static void main(String[] args) {
		// 삼항연산자 형태 (비교식)? 실행1 : 실행2
		int x = -10;
		int result = (x<0)? -x : x; //절대값
        System.out.println(result);
	}

}
