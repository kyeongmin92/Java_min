package Exam;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
	/*	5. 5개의 문자를 입력받아서 1번째 3번째 5번쨰 입력받은 문자를
		차례로 출력하는 프로그램을 작성 (단, 입력받은 문자는 문자형 배열에 저장) */
		Scanner scan = new Scanner(System.in);
		
		String[] str = new String[5];
		
		for(int i=0; i<5; i++) {
			System.out.print("문자를 입력하세요: ");
		String str1 = scan.nextLine();
		
		     str[i] = str1;
		}
		System.out.println("입력받은 문자는"+str[0]+str[2]+str[4]+"입니다.");	
		
		
		
	
		
	
		

	}

}
