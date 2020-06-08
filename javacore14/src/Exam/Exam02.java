package Exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {	
		
		while(true) {
			try {			
		    Scanner scan = new Scanner(System.in);
			System.out.print("정수를 입력하세요:");	
		    int n = scan.nextInt();
			System.out.println("입력한 값은:"+n);
			break;
		   }catch(InputMismatchException e) {
			   System.out.println("입력한 값은 정수가 아닙니다.");
			   continue;
		   }
		}
		

	}

}
