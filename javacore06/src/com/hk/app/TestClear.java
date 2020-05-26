package com.hk.app;

import java.io.IOException;

public class TestClear {

	public static void main(String[] args) {
		
		System.out.println("새로운 화면에서 hello world!!");
		clearConsole(); // 이클립스 콘솔에서 동작이 안됨
		System.out.println("새로운 화면에서 hello world!!");

	}
	
	public final static void clearConsole()
	{ //Clears Screen in Java
		try {
			if (System.getProperty("os.name").contains("Windows")) // 윈도우계열 플랫폼
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else // 유닉스(맥)ㅡ 리눅스(유닉스-free)
				Runtime.getRuntime().exec("clear");
		} catch (IOException | InterruptedException ex) {}
	}

}
