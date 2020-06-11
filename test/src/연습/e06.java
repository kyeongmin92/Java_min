package 연습;

import java.util.Scanner;

public class e06 {

	public static void main(String[] args) {
		double p1 = 0.45359237;
		Scanner scan = new Scanner(System.in);
		System.out.print("파운드를 입력하세요: ");
		int p = scan.nextInt();
		double kg = p*p1;
		System.out.println(p+"파운드는"+kg+"kg입니다.");
		

	}

}
