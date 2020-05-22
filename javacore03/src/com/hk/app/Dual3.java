package com.hk.app;

public class Dual3 {

	public static void main(String[] args) {
		// 형변환
		char c = 'A';
		//char result = c + 1; // char(int) + int
        // int -> char (강제적, 명시적)
		char result = (char)(c+1);
		System.out.println(result);
	}

}
