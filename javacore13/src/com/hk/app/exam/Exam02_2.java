package com.hk.app.exam;

import java.util.Scanner;

public class Exam02_2 {

	public static void main(String[] args) {
		/* 첫번째는 영어로 문장을 입력 받아서 String 변수 english에 저장
		 * english 문자열에서 모음의 개수와 자음의 개수를 구하여 출력
		 * 공백의 개수는 필요하면 출력(선택사항)
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문장을 입력하시오: ");
		String english = scan.nextLine();
		
		int consonant = 0; // 모음 갯수
		int vowel = 0;  // 자음 갯수
		int blank =0;
		
		for(int i=0; i<english.length(); i++) {
			String eng =english.valueOf(english.charAt(i));
	         if(eng.equals("a")||eng.equals("e")||
	            eng.equals("i")||eng.equals("o")||
	            eng.equals("u")) { consonant++;
	         }else if(eng.equals(" ")) { blank++;
	         }else vowel++;
		}
		System.out.println("모음의 갯수: "+ consonant+"개");
		System.out.println("자음의 갯수: "+vowel+"개");
		System.out.println("공백의 갯수: "+blank+"개");

	}

}
