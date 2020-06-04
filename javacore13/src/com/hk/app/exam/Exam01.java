package com.hk.app.exam;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 05
		Scanner scan = new Scanner(System.in);
		// 한글로 문장을 입력 받아서 hangul에 저장
		System.out.print("첫번째 입력: ");
		String hangul = scan.nextLine();		
		
		System.out.print("두번째 입력: ");
		String text = scan.nextLine(); 
		
		// hangul 문자열에 text 문자가 몇개가 있는지 체크해서 개수 출력
		String[] num = hangul.split(text);

		int length = 0;
		for(int i=1; i<num.length; i++) {
			length++;
		}
		
		System.out.print("총개수: "+length+"개");
	}

}
