package Exam;

import java.util.Scanner;

public class Exam_반복문03 {

	public static void main(String[] args) {
		/*3. 택시 운전사가 10명의 손님을 태우면 그 날 영업을 중단하고
		 * 집에가서 쉰다고 하자. 이 경우 그날의 수입을 계산하여 출력하는
		 * 프로그램을 작성하시오
		 * 각 손님의 낸 요금을 읽어 들인다. 수입은 10명의 손님들이 낸 요금의 합이다
		 * 구현방법을 설명하고 자바 프로그램을 작성하시오
		 */
        
        int sum = 0;
        Scanner scan = new Scanner(System.in);
       
        for(int i=0; i<10; i++) {
        System.out.print((i+1)+"번째 금액을 입력하세요:");        
        
        int cost = scan.nextInt(); 
        sum = sum + cost;
        
        }
        System.out.println("오늘의 수입은 : "+ sum + "원 입니다.");
	}

}
