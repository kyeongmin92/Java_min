package com.hk.app;
import java.util.Scanner;

public class Triple2 {

	public static void main(String[] args) {
		// score = 키보드 입력 (0~100중)
		// 삼항연산자 60초과면 pass출력 60미만이면 fail
		Scanner scan = new Scanner(System.in);
		System.out.print("score:");
		int score = scan.nextInt();
		String result = (score>60)? "pass" : "fail";
		System.out.println(score+"점은"+" "+result+"입니다.");
		
		// int 선언
		// 데이터를 키보드 입력
		// 판별하시오? 60점이상, 결과를 result에 저장
		// 결과를 출력(pass, fail)
		
		/* int x=0; String result="";
		   Scanner scan = new Scanner(System.in);
		   System.out.print("점수를 입력하시오?");
		   x=scan.nextInt();
		   result (x>=60)? "pass" : "false";
		   System.out.print("시험결과는?"+result); */
		
		

	}

}
