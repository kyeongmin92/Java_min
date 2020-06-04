package com.hk.app;

public class StringBuf {

	public static void main(String[] args) {
		
		StringBuffer sbf = new StringBuffer("초기문자열"); 
		//문자열 추가
		sbf.append("=avcdefg");
		//문자열 추가
		sbf.append("+여름이 왔어요");
		
		String str=sbf.toString();
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer();
		sb.append("\n a0d0s");
		sb.append("\n a0dd12as");
		sb.append("\n asmdkmw");
		String str2 = sb.toString();
		System.out.println(str2);
		
		// 2 + 1.3125 + 23 / 4 -> input
		String exp = "2 ";
		exp += "+";		
		exp += " 1.3125 ";
		exp += "+";
		exp += " 23 ";
		exp += "/";
		exp += " 4";
		System.out.println(exp);
		
		StringBuffer cal = new StringBuffer();
		cal.append("2 + 1.3125 + 23 / 4 =");		
		cal.append(" 19.046875");
		String input = cal.toString();
		System.out.println(input);   

	}

}
