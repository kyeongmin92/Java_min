package com.hk.app;

import java.util.Scanner;

public class Calculate2 {

	public static void main(String[] args) {
		// 계산기 예제
		
		Scanner reader = new Scanner(System.in);
		System.out.println("두 수를 계산하는 계산기 프로그램");
		
		// 실수값을 키보드로 입력
		System.out.print("첫번째 수를 입력하시오->");
		double first = reader.nextDouble();
		System.out.print("두번째 수를 입력하시오->");
		double second = reader.nextDouble();
		
		System.out.print("연산자를 선택하시오(+, -, *, /, &)->");
		char operator = reader.next().charAt(0);
		
		double result = 0.0d;
		
		switch(operator){
			case '+':
				result =  Operate.plus (first, second);
				break;
			case '-':
				result =  Operate.minus (first, second);
				break;
			case '*' :
				result =  Operate.multiply (first, second);
				break;
			case '/' :
				result =  Operate.divide (first, second);
				break;
			case '&' :
			// first * first ....* first (second 횟수만큼 곱하기)
			// first 3 second = 3 -> 3 * 3 * 3
		    // first 10 second = 2 -> 10 * 10
				result = Operate.power (first, second);
				break;
			// 연산자가 맞지 않는 경우 (+, -, *, /,&)
			default:
				System.out.printf("오류:연산자가 잘못되었습니다");
				return;				
		}
		System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);

	}
	

}
