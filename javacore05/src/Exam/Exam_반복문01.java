package Exam;

public class Exam_반복문01 {

	public static void main(String[] args) {
		/* 1. 1부터 100까지의 모든 짝수들의 합을 계산하는 자바 프로그램
		 * 코드를 작성하되 for문을 사용하시오
		 */
        int sum=0;
        int a = 0;
        for(int i=0; i<50; i++) {
        	a= (i+1)*2;
        	sum = sum + a;        
        }
        System.out.println(sum);
	}

}
