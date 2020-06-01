package com.hk.app;

public class DrawLine {
	
	public void draw() {
		for(int i=0; i<20; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	public void draw(char c) {
		for(int i=0; i<20; i++) {
			System.out.print(c);
		}
		System.out.println();
	}
	public void draw(char c, int n) {
		for(int i=0; i<n; i++) {
			System.out.print(c);
		}
		System.out.println();		
	}
	
	public static void main(String[] args) {
		
	System.out.println("drawLine 함수 오버로딩");
	DrawLine line = new DrawLine();
	 line.draw(); // ====================(20)
	 line.draw('*'); // ********************(20)
	 line.draw('+', 10); // ++++++++++ (10)

	}

}
