package com.hk.app;

import java.util.Scanner;

public class keybed3 {

	public static void main(String[] args) {
		
		Scanner scan2 = new Scanner(System.in);
		System.out.print("회원명?");
		String name = scan2.nextLine();
		System.out.println(name);
		System.out.print("이메일주소?");
		String email = scan2.nextLine();
		System.out.print(email);
		
		scan2.close();
		
		

	}

}
