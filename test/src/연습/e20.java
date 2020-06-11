package 연습;

import java.util.Scanner;

public class e20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = new String[5];
		for(int i=0; i<5; i++) {
			System.out.print("문자를 입력하세요: ");
			String input = scan.nextLine();
			str[i] = input;
		}
		System.out.println(str[0]);
		System.out.println(str[2]);
		System.out.println(str[4]);

	}

}
