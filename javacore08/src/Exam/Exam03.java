package Exam;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/*	3.정수값을 매개변수로 하여 절대값을 구하는 매크로 함수
			myABS(int num)를 작성하여 정수값을 입력받아 결과를 출력하는 프로그램작성  
			입력값 : -10, 결과값:10    */
			int no =0;;
			System.out.print("정수값을 입력하세요 : ");
			System.out.print(myABS(no));
		}
		
		public static int myABS(int num) {
			
			Scanner scan = new Scanner(System.in);
		int	number = scan.nextInt();
			number = Math.abs(number);
			System.out.print("입력한 정수의 절대값은 : ");
			return number;
		}

}
