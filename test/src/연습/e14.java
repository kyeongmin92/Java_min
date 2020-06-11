package 연습;

import java.util.Scanner;

public class e14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum =0;
		for(int i=0; i<10; i++) {
			System.out.print((i+1)+"번째 금액을 입력하세요: ");
			int cost = scan.nextInt();
			sum += cost;
		}
		System.out.println("오늘수입은: "+sum+" 원입니다");

	}

}
