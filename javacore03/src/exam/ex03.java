package exam;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		/* 삼항 연산자를 사용하여 키보드 입력한 값이 
		 * 양수인지 음수인지 출력하는 프로그램 작성
		 * 단 0 은 양수라고 가정
		 */
       Scanner scan = new Scanner(System.in);
       System.out.print("숫자를 입력하시오:");
       int i = scan.nextInt();
       String a = (i>=0)? "양수" : "음수";
       System.out.println(i+" "+'='+" "+a);
       
	}

}
