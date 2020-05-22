package com.hk.app;

public class Single1 {

	public static void main(String[] args) {
		
		// 증감연산자 ++ --
		int a=3;
		int b=6;
		//a--; 현재값에서1 감소 a++;  현재값에서 1증가
		//--b;  동일                 ++b;  동일
		System.out.println(a++); // 후위에 있으면 출력 먼저 되고 나서 연산됨
		System.out.println(++b);
		System.out.println(a);
		System.out.println(b);

	}

}
