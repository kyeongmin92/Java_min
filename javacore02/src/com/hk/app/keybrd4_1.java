package com.hk.app;
import java.util.Scanner;

public class keybrd4_1 {

	public static void main(String[] args) {
		String id="";
		int toeic=0;
				
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를입력하시오?");
		id = scan.nextLine();
		Scanner scan2 = new Scanner(System.in);
		System.out.print("토익점수를입력하시오?");
		toeic = scan2.nextInt();
		
		
		System.out.println("아이디\t토익점수");
		System.out.println("-------------");
		System.out.println(id+"\t"+toeic);

	}

}
