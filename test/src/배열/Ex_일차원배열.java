package 배열;

import java.util.Scanner;

public class Ex_일차원배열 {

	public static void main(String[] args) {
		/*	1. 1반부터 6반까지의 int[] avg 평균점수를 저장한 후 
		(반별 평균점수는 초기값으로 1반부터 차례로 85 79 83 80 78 75로 초기화)

		두 반의 반 번호를 입력받아
		두 반 평균점수의 합을 출력하는 프로그램을 작성하시오

		[키보드 입력예]
		첫번째반 : 1
		두번째반 : 3
		(주의점: 반번호, 배열번호 다름)
		두반의 평균점수 합은:168 
		--while문 사용*/
		
		int[] avg = { 85, 79, 83, 80, 78, 75};
		Scanner scan = new Scanner(System.in);
				
		while(true) {
			System.out.print("첫번째 반 입력: ");
			int input = scan.nextInt();
			System.out.print("두번째 반 입력: ");
			int input2 = scan.nextInt();
			if(input!=input2) {
				input= avg[input-1];
				input2= avg[input2-1];
				System.out.println("평균 합 :"+(input+input2));
				break;
			} else {
				System.out.println("입력된 반 번호가 같습니다. 다시 입력하세요");
			}
		}

	}

}
