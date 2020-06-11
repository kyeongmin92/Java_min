package 연습;

import java.util.Scanner;

public class e08 {

	public static void main(String[] args) {
		int product = 100000;
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int cost = product * count;
		int sale = (int) (cost*0.1);
		if(count>=10) {
			System.out.println("총가격은 "+(cost-sale)+"입니다");
		} else {
			System.out.println("총가격은 "+ cost + "입니다");
		}

	}

}
