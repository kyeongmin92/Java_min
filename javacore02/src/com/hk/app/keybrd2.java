package com.hk.app;
import java.util.Scanner;

public class keybrd2 {

	public static void main(String[] args) {
	  //문제:섭씨온도(double형)으로 입력
	  //화씨로 출력하시오
	
		
		Scanner scan2 = new Scanner(System.in);
	    System.out.print("섭씨온도:");
		double C = scan2.nextDouble();
		
		double F = 9.0/5.0 * C + 32;
			 
	 
	    System.out.println("화씨온도:"+F);
	    
	    
		

	}

}
