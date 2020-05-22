package com.hk.app;

public class LoopB4 {

	public static void main(String[] args) {
		/*(반복을 하다가 break하는 예)
          1~100까지 누적함
                    합이 100 이 넘는 순간 멈추고
                    결과값, 넘는 순간? */
		int sum =0; // 최종합계 저장
		int x=1; // 1->계속갑니다 +1
		System.out.println(x+"-"+sum+"시작값");
		System.out.println("------------------");
		while(true) { // 참이면 무한루프
						
			sum += x;			
			System.out.println(x+"-"+sum);
			if(sum>=100) {
				break;
			}
			x++;
		}
		

	}

}
