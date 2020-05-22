package com.hk.app;

public class Select4 {

	public static void main(String[] args) {
		int age = 0;              // 나이
		char mil = ' ';      // 군대 공군 a 해군 m 육군 g
		String mi = "";
		
		// 입력
		    age = 50; //김건우
		  mil = 'a';
		  
		// 나이가 18세 미만 m = ' ' 청소년이고 미필입니다
		// 나이가 18세 이상 m = 'a' 또는 'm' 또는 'g' 성인이고 군필입니다
        // 나이가 18세 이상 m = ' ' 성인이고 미필입니다
		if (age>=18 && mil!=' ') {
			System.out.println("성인이고 군필");
		}else if(age>=18 && mil==' ') {
			System.out.println("성인이고 미필");
		} else { System.out.println("청소년이고 미필");
	}
	}
}
	
