package com.hk.app;

public class LoopA3 {

	public static void main(String[] args) {
		
		int mux = 1; //곱셈인 경우 초기값이 0이 되면 안됨
		// 곱은 값이 커지니까 int, long 사용
		// 주의해야할 초기값
		int z =1;
		for(int i=0; i<10; i++) {
			mux =mux*z;
			z=z+2;
		}
		System.out.println(mux);

	}

}
