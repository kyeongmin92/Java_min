package 연습;

import java.util.Scanner;

public class e10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if(number%3==0) {
			System.out.println("3의 배수이다");
		} else {
			System.out.println("3의 배수가 아니다");
		}

	}

}
