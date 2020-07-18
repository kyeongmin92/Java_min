package com.hk.app;

public class Test6b {

	public static void main(String[] args) {
		
		for(int i=0; i<6; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");				
			}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<3; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
