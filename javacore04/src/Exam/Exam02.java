package Exam;

import java.util.Random;

public class Exam02 {

	public static void main(String[] args) {
		// 임의의 숫자(음수~양수)
		// 조건문을 써서 짝수인지 홀수인지 판별해서 출력
		Random ran = new Random();
		int anynum = 0;
		String result = "";
		anynum = ran.nextInt();
		
		if(anynum % 2 == 0) {
			result = "짝수";
		} else { result = "홀수";}
		
	System.out.println(anynum + "는 " + result + "입니다");
		
		
		
	

	}

}
