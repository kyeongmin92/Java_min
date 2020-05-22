package com.hk.app;

public class LoopA1 {

	public static void main(String[] args) {
		// 1~10 누적합
		/*전역변수 (변수선언시 반드시 초기화 필수)
		 * int x 정수변수 (더해줄 숫자)
		 * int sum 정수 (결과 기억 공간)
		 * [초기값 설정] 반복횟수 i=0 (0부터 시작)
		 * 초기값 0에서 시작 i<10까지 (조건)
		 * sum 변수에 x값을 더해줌 (반복)
		 * i값 증가
		 *  -> sum 출력
		 */
		/*int x = 1; // 합에 더해줄 숫자
		int sum = 0; // 누적 결과
		for(int i=0; i<10; i++) {
		sum = sum + x;
		x++;
		} */
		int sum = 0; // 누적 결과
		for(int i=0; i<10; i++) {
		sum = sum + (i+1); // x;
		
		}
		System.out.println("누적합은(1~10)"+sum);
	}

}
