package com.hk.app;

public class Cast1 {

	public static void main(String[] args) {
		float f = 1.678f; // 실수 기억 공간
		int i = 0;        // 정수 기억 공간
		// 서로 형이 다른 값을 대입
		i = (int)f;            // 실수 => 정수
		System.out.println(f);
		System.out.println(i);
		// 비교
		float f2 = 0.0f;
		int i2 = 10;
		f2 =i2; // 정수->실수 또는 작은타입 큰타입
		// 형변환 생략이 가능하다
		System.out.println(i2);
		System.out.println(f2);
				
		

	}

}
