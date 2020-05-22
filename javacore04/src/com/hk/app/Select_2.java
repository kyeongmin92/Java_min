package com.hk.app;

public class Select_2 {

	public static void main(String[] args) {
		int score=0;
		
		if(score>=90) {
			System.out.println("very good");			
		} else if (score>=80) {System.out.println("good");
		} else {System.out.println("not bad");
		}
		// 잘못된 식인거 같음 70 이하일때도 not bad 출력됨

	}

}
