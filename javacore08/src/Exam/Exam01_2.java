package Exam;

import java.util.Scanner;

public class Exam01_2 {
	
	public static void main(String[] args) {
	 /*    1. "Java Funtion"이라고 출력하는 함수를 작성하고 main 함수에서 5번 작성
	       1-2. 위의 함수의 파라미터에 숫자를 입력 받아서 횟수 만큼 출력하는 함수로 변경       */
		String x = null;
			
		
		System.out.print("출력할 횟수 입력: ");
		Java(x);
		

	}
	public static void Java(String j) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.println("Java Funtion");
		}
		
	}

}
