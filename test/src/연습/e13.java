package 연습;

import java.util.Scanner;

public class e13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max=0;
		for(int i=0; i<10; i++) {
			System.out.print(i+1+"번:");
			int input = scan.nextInt();
			if(input>max) {
				max=input;
			}
		}
		System.out.println(max);
		

	}

}
