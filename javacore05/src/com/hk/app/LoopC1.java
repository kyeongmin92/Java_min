package com.hk.app;

import java.util.Scanner;

public class LoopC1 {

	public static void main(String[] args) {

           int input = 0;
           int test = 0;
           Scanner scan = new Scanner(System.in);
           
           System.out.print("숫자를 입력하시오: ");
    	   input = scan.nextInt();
    	   
           while(input!=0) {
        	   System.out.print("숫자를 입력하시오: ");
        	   input = scan.nextInt();
        	   test += input;
           }
           System.out.println("결과는 = "+test);
           //결과값 잘못됨

	}

}
