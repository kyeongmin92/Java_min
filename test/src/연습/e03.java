package 연습;

import java.util.Scanner;

public class e03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("반지름의 값을 입력하세요: ");
		int r = scan.nextInt(); // 반지름
		double a =Math.PI * Math.pow(r, 2);
		System.out.println("원의 면적은"+a+"입니다.");
		
	}

}
