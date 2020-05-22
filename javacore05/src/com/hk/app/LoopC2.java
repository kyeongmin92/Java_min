package com.hk.app;

import java.util.Scanner;

public class LoopC2 {

	public static void main(String[] args) {

        int sum =0;
        int input =0;
        Scanner scan = new Scanner(System.in);
        do {
        	System.out.print("정수를 입력하세요: ");
        	input = scan.nextInt();
        	sum += input;
        } while(input!=0);
        System.out.println(sum);

	}

}
