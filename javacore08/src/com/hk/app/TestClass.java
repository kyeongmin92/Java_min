package com.hk.app;

public class TestClass {
	
	//인스턴스 변수 - 상태변수 - 클래스로 인스턴스 생성
	String kind;
	int num;
	//클래스 변수
	static int width;
	
	// 메소드 (동작합수)= 변수
	// 객체의 값을 가져오는 함수
	public String getKind() { return kind; }
	public int getNum() { return num; }
	
	public static int getWidth() {return width;}
	
	//여기부터 프로그램 시작 가정
	public static void main(String[] args) {
		TestClass heart7 = new TestClass();
		TestClass dia5 = new TestClass();
		heart7.kind = "하트";
		heart7.num =7;
		dia5.kind ="다이아몬드";
		dia5.num= 5;
		TestClass.width = 10;     // 독립적인 변수
		
		System.out.println(heart7.getKind());		
		System.out.println(heart7.getNum());
		System.out.println(dia5.getKind());
		System.out.println(dia5.getNum());
		
		System.out.println("클래스 변수? "+getWidth());
	}

}
