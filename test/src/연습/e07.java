package 연습;

import java.util.Scanner;

public class e07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a = scan.nextInt();
		String x = (a>=0) ? "양수" : "음수";
		System.out.println(a+" 는 "+x+" 입니다");
		

	}

}
