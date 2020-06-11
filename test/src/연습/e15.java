package 연습;

import java.util.Scanner;

public class e15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇단입니까:");
		int dan = scan.nextInt();
		
		for(int i=dan; i<=dan; i++) {
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		    System.out.println();
		}
	

	}

}
