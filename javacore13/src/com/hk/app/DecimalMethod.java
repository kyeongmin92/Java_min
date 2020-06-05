package com.hk.app;

import java.text.*;

public class DecimalMethod {

	public static void main(String[] args) {
		
		//선언, 생성자로 초기화형태
		DecimalFormat df = new DecimalFormat("#,###,###");
		//금액에 대한 포멧
		//정수 --> 문자열 포맷 변경
		int money = 1200000;
		money += 1250000;
		String result = df.format(money);
		System.out.println(result);
		
		// 문자열 포맷 --> 정수 변경
		String dbmoney = "123,567";
		try {
			Number temp = df.parse(dbmoney);
			int num = temp.intValue();
			System.out.println(num);
			System.out.println(num+10000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("=====================");
		// 원의 넓이를 출력하시오
		int r = 15;
		// 원의 넓이 area 선언
		double area = Math.PI*Math.pow(r, 2);
		// 원의 길이
		double c = 2*Math.PI * r;
		
		//원의 넓이와 길이 값 출력
		System.out.println("원의 넓이"+area);
		System.out.println("원의 길이"+c);
		// DecimalFormat으로 "0,##" 패턴 생성
		DecimalFormat fmt = new DecimalFormat("0.##");
		System.out.println(fmt.format(area));
		System.out.println(fmt.format(c));
		
		
	}

}
