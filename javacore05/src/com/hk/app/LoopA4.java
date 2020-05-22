package com.hk.app;

import java.util.Scanner;

public class LoopA4 {

	public static void main(String[] args) {
		// 키보드 입력을 5번을 반복해서 입력을 받아보시오
		// 숫자를 입력하면 sum에 모두 더하시오
		// sum = 343 + 34 + 324 + 343 + 239
		int sum = 0;
		int x=0; //입력받을 숫자
		
		Scanner scan = new Scanner(System.in);
		
		// 5번 반복
		for(int i=0; i<5; i++) {
			x = scan.nextInt();
			sum = sum + x;
		}
		System.out.println("입력한 5개의 숫자 합은 = "+ sum);

	}

}
