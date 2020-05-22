package exam;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		/* 하나에 100,000원인 제품 10개 이상사는 고객에게는 10% 할인
		 * 고객이 구입한 제품 수량 입력하면
		 * 총 가격 계산하는 프로그램 순서도 작성, 자바프로그램 작성
		 */
       Scanner scan = new Scanner(System.in);
       System.out.print("제품의 수량을 입력하세요: ");
       int i = scan.nextInt(); 
       int a1 = 100000, a10 = (a1*10); // a10 필요없음
       int b = (i*a1); 
       int result = (b>=a10)? (b-b/10) : b; // b 대신 i, a10 대신 10 입력
       // int result = (i>=10)? (int)(b-b*0.1) : b; => 결과값 동일
       // double result = (i>=10)? (b-b*0.1) : b;  => 결과값 동일, 소수점 표시
       System.out.println("가격은 총 : "+result+" 원 입니다.");
              
       /* Scanner scan =new Scanner(System,in);
        * System.out.print("제품의 수량을 입력하세요: ");
        * int i = scan.nextInt();
        * int a = 100000;
        * int b = (i*a);
        * int result = (i>=10)? (b-b/10) : b;
        * System.out.println("가격은 총: "+result+" 원 입니다.");
        */
	}

}
