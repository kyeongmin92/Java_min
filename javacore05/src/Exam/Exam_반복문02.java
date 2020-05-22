package Exam;

import java.util.Scanner;

public class Exam_반복문02 {

	public static void main(String[] args) {
		/*2. 사용자로부터 10개의 정수를 입력 받아
		 * 최대값을 구하는 프로그램을 작성하시오
		 */
		Scanner scan =new Scanner(System.in);
		int max = 0;
		
		for(int i =0; i<10; i++) {
			System.out.print((i+1)+"number :");
			int player = scan.nextInt();
			if(player>max) { 
				max=player;
			} 
		
    	}System.out.println("최대값은 : "+max);
     
	}

}
