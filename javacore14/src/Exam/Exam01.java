package Exam;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = scan.nextInt();		
		
		for(int i=0; i<10; i++) {
			try {
				int n = (int)(Math.random()*10);
				double result = num/n;
				System.out.println(result+"/ "+n);
			} catch(ArithmeticException e) {
				System.out.println("계산불가능");
			} 
		
			
		}
	}

}
