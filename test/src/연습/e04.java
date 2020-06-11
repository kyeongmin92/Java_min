package 연습;

import java.util.Scanner;

public class e04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요:");
		int a = scan.nextInt();
		System.out.print("두번째 정수를 입력하세요:");
		int b= scan.nextInt();
		int x = a%2;
		int y = b%3;
		System.out.println(a+" 를 2로 나눈값은: "+x);
		System.out.println(b+" 를 3으로 나눈값은: "+y);
		
		

	}

}
