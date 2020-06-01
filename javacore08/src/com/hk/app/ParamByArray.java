package com.hk.app;

public class ParamByArray {

	public static void main(String[] args) {
		
		// 배열들의 합을 구하는 함수
		int[] score = {100, 60, 90, 70, 80};
		int sum = add(score);
		int z = 10;
		System.out.println(sum);
		System.out.println(score[0]);
		System.out.println(z);

	}
	
	public static int add(int[] x) {
		// 객체형 - 참조값이 실제 같은것
		// 기본형 - 복사값 가는 것
		int result=0;
		// 코드구현?
		for(int i=0; i<x.length; i++) {
			result += x[i];
		}
		return result;
	}

}
