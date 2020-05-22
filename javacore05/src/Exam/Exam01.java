package Exam;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* 3번 점수 입력을 받음 (반복문)
		 * 영어점수?
		 * 불어점수?
		 * 자바점수?
		 * 입력한 숫자의 평균을 구해보시오
		 */
				
		int score = 0; // 각 과목입력값
		int sum = 0; // 총점
		int cnt = 0; // 과목갯수
		int avg = 0; // 평균점수
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<3; i++) { // 영어, 불어, 자바
			System.out.print((i+1) + "번째 과목점수 ? ") ;
			score = scan.nextInt();
			sum = sum + score;
			cnt++;
		}
		avg=sum/cnt;
		System.out.println("중간평가 : "+ sum);
        System.out.println("평균점수 : "+ avg);
	}

}
