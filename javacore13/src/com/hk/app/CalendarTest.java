package com.hk.app;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		//Calendar CAL = new Calendar();
		//Calendar CAL2 = new Calendar();
		
		// CAL 공유해도 괜찮다		
		Calendar CAL = Calendar.getInstance();
		// 싱글톤
		// if(cal != null) Calendar cal = new Calendar()
		// else cal
		System.out.println(CAL.get(Calendar.YEAR));
		System.out.println(CAL.get(Calendar.MONTH)+1); // 0:1월
		
		// 몇가지 예제
		System.out.println(CAL.get(Calendar.DATE)); //today
		System.out.println (CAL.get(Calendar.DAY_OF_WEEK));
		// 1(일) 2 3 4 5(목) 6
		
		//시간
		System.out.println (CAL.get(Calendar.HOUR));		
		System.out.println (CAL.get(Calendar.MINUTE));
		System.out.println (CAL.get(Calendar.MILLISECOND)); // 1000분의 1초
		
		// 이달의 마지막 날
		System.out.println (CAL.getActualMaximum(Calendar.DATE));
		
		// 일정관리용

	}

}
