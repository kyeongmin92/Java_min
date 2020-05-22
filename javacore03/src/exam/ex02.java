package exam;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		/* 1파운드는 정확히 0.45359237 킬로그램(kg)
		 * 키보드 입력 사용 하여
		 * 파운드를 Kg로 변환하는 자바프로그램 작성
    	 */
         double p = 0.45359237;
         Scanner scan = new Scanner(System.in);
         System.out.print("파운드 입력:");
         int i = scan.nextInt();
         double kg = (p*i);
         System.out.println(i+"파운드는"+" "+kg+"킬로그램 입니다.");
         
         
         
       
         
         
         
	}

}
