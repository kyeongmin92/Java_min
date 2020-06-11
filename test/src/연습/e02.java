package 연습;

import java.util.Scanner;

public class e02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요: ");
		int a = scan.nextInt();
		System.out.print("두번째 정수를 입력하세요: ");
		int b= scan.nextInt();
		int c = a*b;
		System.out.println("두수의 곱은"+ c +"입니다");
		
				

	}

}
