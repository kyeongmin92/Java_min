package Exam_H;

import java.util.Scanner;

public class ex04_h {

	public static void main(String[] args) {
    /* -변수선언
            제품가격 int price, 구매수량 int buy, 할인률 double sale, 총가격 double total
      price 100000, buy 입력하기, sale 0.1d
	   -buy 10이상이다 or 아니다  
	   -total = price * buy * sale * (1-sale) 
	   -총 가격 출력
   */
		System.out.println("간단한 POS 프로그램");
		int price=100000, buy =0;
		double sale=0.1d, total = 0;
		
		Scanner scan = new Scanner(System.in);
		// 클래스명 변수명 = new 클래스명(초기값);
		
		System.out.println("구매수량은?");
		buy = scan.nextInt();
		
		// 삼항식
		//(buy>=10)? yes : no;
		double temp = (double)price*buy;
		total = (buy>=10)? temp*(1-sale) : temp;
		
		System.out.println("총 구매가격="+(int)total+"원");
		
		scan.close();
		
		
	}

}
