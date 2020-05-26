package com.hk.app;

import java.io.IOException;

public class TestClear2 {

	public static void main(String[] args) {
		
		// 1~100 출력
		int x=1;
		while(true) {
			// 1-화면지우기
			clearConsole();
			
			// 2-화면출력
		    System.out.println(x+"초");
			x++;
			
			// 3-sleep
			try { // 1초간 잠깐자고 오세요
				Thread.sleep(1000); //1000ms =1s
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			// 4-다시돌아오면
			if(x>100) {
				break;
			}
		}
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

