package com.hk.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionSample3 {

	public static void main(String[] args) {

	      int answer = (int)(Math.random()*100) +1;
	      int input = 0;
	      int count = 0;
	      Scanner sc = new Scanner(System.in);
	      
	      do {
	         count++;
	         System.out.print("1~100 중 값을 입력하세요 : ");
	         
	         try {
	            input = sc.nextInt();
	         } catch (InputMismatchException e) {
	            System.out.println("유효하지 않은 값입니다. 다시 입력해주세요.");
	            continue;
	         }
	         if (input < 1 || input > 100) {
	            System.out.println("숫자 범위 오류");
	            continue;
	         }
	         
	         if (answer > input) {
	            System.out.println("더 큰 수를 입력하세요.");
	         } else if (answer < input) {
	            System.out.println("더 작은 수를 입력하세요.");
	         } else {
	            System.out.println("맞췄습니다.");
	            System.out.println("시도 횟수 : " + count + "번");
	            break;
	         }
	         
	      } while(true);
	      sc.close();
	   }

}
