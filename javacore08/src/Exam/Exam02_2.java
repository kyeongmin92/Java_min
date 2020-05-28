package Exam;

import java.util.Scanner;

public class Exam02_2 {

	public static void main(String[] args) {
	/*	2. 구구단의 단을 입력 받아서 출력하는 gugudan(int dan)함수를
		작성하고 main 함수에서 사용
		출력할 단은 :3    */
		String z = null;
		System.out.print("단을 입력하세요: ");
		System.out.println(gugudan(z));
		
	
	}
	public static String gugudan (String dan) {
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		
		for(int i=a; i<=a; i++) {
			System.out.println(a+"단");
			for(int j=1; j<10; j++) {
				 System.out.println(i+"x"+j+"="+i*j);
			}
			
		}
		return " ";
		
	}
}
