package com.hk.app;

public class Select_4_2 {

	public static void main(String[] args) {
		int age = 0;              // 나이
		char mil = ' ';      // 군대 공군 a 해군 m 육군 g
		String a = "공군", m= "해군", g="육군";
		// 중첩 if문
		// 입력
		    age = 15; 
		    mil = ' ';
		   
		// 나이가 18세 미만 m = ' ' 청소년이고 미필입니다
		// 나이가 18세 이상 m = 'a' 또는 'm' 또는 'g' 성인이고 군필입니다
        // 나이가 18세 이상 m = ' ' 성인이고 미필입니다
		if (age>=18 && mil!=' ') { 
			if(mil=='a') {
			System.out.println("성인이고 공군 군필");
		}else if(mil=='m') {
			System.out.println("성인이고 해군 군필");
		} else { 
			System.out.println("성인이고  육군 군필");
		}
		}else if (age>=18 && mil==' ') {
			System.out.println("성인이고 미필");
		}else if(age<=18) {
			System.out.println("청소년이고 미필");
		}

	}
}
