package com.hk.app;
import java.util.Scanner;

public class keybrd4 {

	public static void main(String[] args) {
		String id;
		int score;
		// Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 영문아이디 입력 저장
		System.out.println("영문 아이디 입력");
		id = scan.nextLine();
		// 토익점수(정수) 입력 저장
		System.out.println("토익점수 입력");
		score = scan.nextInt();
		
		// 출력형태
		System.out.println("아이디\t토익점수");
		System.out.println("-------------");
		System.out.println(id+"\t"+score);
		// 아이디 토익점수
		// -------------
		// rose 678

		
	}

}
