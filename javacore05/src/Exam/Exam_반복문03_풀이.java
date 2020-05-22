package Exam;

import java.util.Scanner;

public class Exam_반복문03_풀이 {

	public static void main(String[] args) {
		/*3. 택시 운전사가 10명의 손님을 태우면 그 날 영업을 중단하고
		 * 집에가서 쉰다고 하자. 이 경우 그날의 수입을 계산하여 출력하는
		 * 프로그램을 작성하시오
		 * 각 손님의 낸 요금을 읽어 들인다. 수입은 10명의 손님들이 낸 요금의 합이다
		 * 구현방법을 설명하고 자바 프로그램을 작성하시오
		 */
		int guest= 0;
		final int max = 10; // max값 변경 불가
		int total = 0;
		int fare = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("-- 오늘 택시 영업 시작");
		for(int i=0; i<max; i++) {
			System.out.print("요금을 입력하시오? ");
			fare = scan.nextInt();
			total = total + fare;
			guest++;
		}
		System.out.println("오늘 태운 손님수= "+ guest);
		System.out.println("오늘 수입금액= "+ total);
		System.out.println("-- 오늘 영업 끝");

	}

}
