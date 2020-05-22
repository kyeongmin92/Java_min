package Exam;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		/* 정수 number를 키보드를 통해 입력을 받고 3의 배수인지 아닌지를 결정하는 순서도를 작성하라
		 * -3의 배수라면 "3의 배수이다"
		 * -아니라면 "3의 배수가 아니다"라고 출력하라
		 * 순서도를 기반으로 자바 프로그램을 작성하라
		 */
         Scanner scan = new Scanner(System.in);
         System.out.println("***3배수 체크 프로그램***");
         System.out.print("정수를 입력하시오: ");
         int number = scan.nextInt();
         String msg = "";
         if(number%3==0) {
        	 msg = "는 3의 배수이다";
         }else {
        	 msg = "는 3의 배수가 아니다";
         }
         System.out.println(number + msg);
	}

}
