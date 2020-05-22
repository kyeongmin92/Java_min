package test1;

import java.util.Scanner;

public class Test_Tri2 {

	public static void main(String[] args) {
		int x=0; String result="";
		   Scanner scan = new Scanner(System.in);
		   System.out.print("점수를 입력하시오?");
		   x=scan.nextInt();
		   result =(x>=60)? "pass" : "false";
		   System.out.print("시험결과는?"+result);

	}

}
