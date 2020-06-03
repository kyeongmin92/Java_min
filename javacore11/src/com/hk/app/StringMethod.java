package com.hk.app;

public class StringMethod {

	public static void main(String[] args) {
		//12강 String 클래스의 생성자와 메소드
		
		String name = "Smith";   // |S|m|i|t|h| 0 1 2 3 4
		char guess = name.charAt(0);
		System.out.println("무슨문자? "+guess);
		
		String test = name.substring(0, 2);  // substring(시작숫자, 끝숫자-1)
		System.out.println("무슨문자? "+test); 
		test = name.substring(1, 3);
		System.out.println("무슨문자? "+test);
		
		String text = "Today Star Coffee Travel";
		String[] result = text.split(" ");
		System.out.println(result[0]+","+result[2]);
		//String text = "1111|kim|student|23";

	}

}
