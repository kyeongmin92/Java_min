package com.hk.app;
import java.util.*; // *은 모든 클래스 

public class Keybrd1 {

	public static void main(String[] args) {
		
		// int score
		//-------------------------------------------------
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오");
		//int score = scan.nextDouble(); // 실수입력
		int score = scan.nextInt(); // 정수입력
		//-------------------------------------------------
		System.out.println(score); 
		scan.close(); // 생략가능 why 가비지 콜렉션

	}

}
