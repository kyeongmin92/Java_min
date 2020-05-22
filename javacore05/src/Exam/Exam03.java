package Exam;

public class Exam03 {

	public static void main(String[] args) {
		/* 구구단 출력
		 * x = 1 3 5 7 9
		 * y = 2 4 6 8 10
		 * z = x * y (5x5)
		 * 반복구문 외부 i변수 = 1,2,3,4,5
				내부 k변수 = 1,2,3,4,5
				25번이 반복
				k 1 0 0 0  0    --> i
				  0 4 0 0  0
				  0 0 9 0  0
				  0 0 0 16 0
				  0 0 0 0  25 

				i k를 반복하면 i=k 같으면 곱을 출력
				아니면 0을 출력 */
		int result = 0;
		
		for(int i=1; i<=5; i++) {
			
			for(int k=1; k<=5; k++) {
				
				if(i==k) {
					result=i*k;
				} else {
					result=0;
				}
				System.out.print(result+" ");
			}
			System.out.println(" ");
		}
		
	}

}
