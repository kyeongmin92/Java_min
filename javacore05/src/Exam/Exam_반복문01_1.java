package Exam;

public class Exam_반복문01_1 {

	public static void main(String[] args) {
		// 1~100
		// 짝수 이거나 3의배수면 합해보시오 (둘중에 하나라도 참 (||))
		int sum = 0;
		int x =1;		
		for (int i=0; i<100; i++) {
			if (x%2==0 || x%3==0) {
			sum += x;			
			} 
			x++;
		}
	 	 System.out.println(sum);
	}

}
