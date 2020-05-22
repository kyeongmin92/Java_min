package Exam;

public class Exam_반복문01_풀이 {

	public static void main(String[] args) {
		/* 1. 1부터 100까지의 모든 짝수들의 합을 계산하는 자바 프로그램
		 * 코드를 작성하되 for문을 사용하시오
		 */
		int sum = 0; //result // 2 2 6 6
	//	int sum2 = 0;
		int x = 1; // -> 100
		for (int i=0; i<100; i++) { // 2 3 4 5
			if(x%2==0) {
				sum = sum + x;
			}  else {
			//	sum2 = sum2 + x;
			}
			x++;
		}
		System.out.println(sum);
	//	System.out.println(sum2);
	}

}
