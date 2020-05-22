package test1;

import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
        System.out.print("제품의 수량을 입력하세요: ");
        int i = scan.nextInt();
        int a = 100000;
        int b = (i*a);
        int result = (i>=10)? (int)(b-b*0.1) : b;
        System.out.println("가격은 총: "+result+" 원 입니다.");
	}

}
