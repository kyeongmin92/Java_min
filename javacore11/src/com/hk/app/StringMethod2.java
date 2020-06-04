package com.hk.app;

public class StringMethod2 {

	public static void main(String[] args) {
		
		String article ="Court begins process to sell assets"
				        +"of Japanese firm incolved"
				        +"in wartime forced labor";
		String[] word = article.split(" ");
		
		int i=0;
		while(i<word.length) {
			System.out.println(word[i]);
			i++;
		}
		
		String test = "010-9355-1234|김천사|kimha";
		test.split("|"); 
	/*	String[] word2 = test.split("|"); 
		while(i<word2.length) {
			System.out.println(word2[i]);
			i++;
		} */
		
		// split 없이 Japanese만 출력하려면?
		int start = article.indexOf("J"); // J가 처음 시작하는 위치
		int end = start + 8;
		String result = article.substring(start, end);
		System.out.println("추출문자열= "+result);
		
		//System.out.println("문자출력= "+article.substring(38,46));

	}

}
