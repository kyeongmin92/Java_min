package com.hk.app;

import java.util.Random;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		int[] num = new int[3];
		Random zen = new Random();
		
		while(true) {
			num[0] = zen.nextInt(9)+1;  // 100의자리  1~9
			num[1] = zen.nextInt(9)+1;  // 10의자리  1~9
			num[2] = zen.nextInt(10);   // 1의 자리 0~9
			
			if(num[0]!=num[1] && num[0]!=num[2] && num[1]!=num[2]) {
				break;
			}			
		}
		System.out.println("3자리 숫자맞추기 게임을 시작합니다 !!!");		
		
		int[] num2 = new int[3];
		Scanner scan = new Scanner(System.in);
		int input = 0; 
		int count = 0; // 입력횟수
		while(true) 
		{
			while(true) {
				System.out.print("123~987 사이의 숫자를 입력하시오=");				
				count ++;
				input = scan.nextInt();
				num2[0] = input / 100;  // 100의 자리
				num2[1] = input / 10;   // 10의 자리
				num2[2] = input % 100;  // 1 의자리
				if(input>=123 && input <=987)
				{					
					if(num2[0]!=num2[1] && num2[0]!=num2[2] && num2[1]!=num2[2]) {
						break;
					}else {
						System.out.println("다시 입력하시오");
					}
				}
				else {
					System.out.println("다시 입력하시오");
				}
			}
			
			
			// 랜덤숫자와 입력숫자 비교
			if(num[0]*100+num[1]*10+num[2] > input) {
				System.out.println("Up");
			}else if(num[0]*100+num[1]*10+num[2] <input) {
				System.out.println("Down");
			}else {
				System.out.println(count+"번 만에 정답을 맞추셨습니다.");
				break;
			}
		}
		

	}

}
