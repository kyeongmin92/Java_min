package Exam;

import java.util.Scanner;

public class Exam_반복문04 {

	public static void main(String[] args) {
		/*4. 다음과 같이 구구단을 출력하는 프로그램을 작성하시오
		 * (단을 입력하면 입력한 단만 출력하도록)
		 */
		System.out.print("몇단 입니까?");
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		
		for(int x =dan; x<=dan; x++) { System.out.println("*** "+x+"단  ***");
			for(int y=1; y<10; y++) { 
				
				System.out.println(x+"x"+y+"="+(x*y)); 
			}
			
		}
           
	}

}
