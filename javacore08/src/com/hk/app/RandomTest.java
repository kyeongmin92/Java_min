package com.hk.app;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
	      int result = RandomNum();            //호출
	    		  System.out.println("결과출력= "+result);
	    		  printResult(result);

	}
	
	// 함수작성 연습 0~9까지 랜덤한 숫자를 발생하는 함수
	public static int RandomNum() {
		Random zen = new Random();        // 클래스 선언 = 지역변수
		int rst = zen.nextInt(10);
		return rst;
	}
	
	 // 리턴타입이 없는 경우 = void
    public static void printResult(int r) {
   	 System.out.println("결과출력= "+r);
    }

}
