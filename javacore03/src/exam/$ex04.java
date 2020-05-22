package exam;

import java.util.Scanner;

public class $ex04 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("제품의 수량을 입력하세요: ");
        int buy = scan.nextInt();
        int price = 100000;
        int temp = (buy*price);
        int total = (buy>=10)? (temp-temp/10) : temp;
        System.out.println("가격은 총: "+total+" 원 입니다.");
        int sale = (buy>=10)?  temp/10 : 0;
        System.out.println("할인금액은 총 "+sale+"원 입니다.");
	}

}
