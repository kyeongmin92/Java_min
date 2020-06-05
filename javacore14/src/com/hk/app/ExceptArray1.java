package com.hk.app;

public class ExceptArray1 {

	public static void main(String[] args) {
		
		// 배열 선언
		int[] score = new int[5]; // 토익점수 0 ~ 4
		
		//점수별로 확인하려면 반복문
		//예외가 날 것 같다고 생각되면
		try {
		 for(int i=0; i<10; i++) {
		 	int test = score[i];  // 5 6 7 8 ....10 멈춤  i값이 배열값 초과함
		 }
		} catch(Exception e) {
			System.out.println("프로그램에 오류가 있습니다!! = "+"JAVA-0111");
		}
		System.out.println("좋은 코드들 많이 있어도");

	}

}
