package com.hk.app;

import java.util.Scanner;

public class SelectMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu=0; // 0 초기값; 선택안함
		String result = "선택안함";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("저녁에 먹고 싶은 메뉴번호?");
		menu = scan.nextInt();
		
		if(menu==1) {
			result = "중식 짜장면";
		} else if (menu == 2) {
			result = "일식 회덮밥";
		} else if (menu == 3) {
			result = "양식 돈까스";
		} else if (menu == 4) {
			result = "기타 스파게티";
		} else {
			result= "선택안함";
		}
		System.out.print("오늘저녁메뉴는? "+ result);
		

	}

}
