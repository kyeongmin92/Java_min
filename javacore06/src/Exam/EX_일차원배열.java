package Exam;

import java.util.Scanner;

public class EX_일차원배열 {

	public static void main(String[] args) {
	/*	1. 1반부터 6반까지의 int[] avg 평균점수를 저장한 후 
		(반별 평균점수는 초기값으로 1반부터 차례로 85 79 83 80 78 75로 초기화)

		두 반의 반 번호를 입력받아
		두 반 평균점수의 합을 출력하는 프로그램을 작성하시오

		[키보드 입력예]
		첫번째반 : 1
		두번째반 : 3
		(주의점: 반번호, 배열번호 다름)
		두반의 평균점수 합은:168 */
		
		int[] avg = { 85, 79, 83, 80, 78, 75};
		Scanner scan = new Scanner(System.in);
		int sum =0;
		int input = scan.nextInt();
		for(int i=0; i<avg.length; i++) {
			System.out.println("숫자를 입력하세요: ");
			input = avg[i];
			   if(input==0) {
				   System.out.println(avg[0]);
			   } else if (input==1) {
				   System.out.println(avg[1]);
			   } else if (input==2) {
				   System.out.println(avg[2]);
			   } else if (input==3) {
				   System.out.println(avg[3]);
			   }  else if (input==4) {
				   System.out.println(avg[4]);
			   }  else  {
				   System.out.println(avg[5]);
			   }
		}
	
		
	}

}
