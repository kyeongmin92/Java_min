package Exam_H;

public class ex01_h {

	public static void main(String[] args) {
	 	// 필요한 변수 선언
		//int apple, int basket, int caOfBas, int mod
    // 처리1 -사과총갯수/바구니용량 : 바구니수	
    //	처리2 -사과총갯수%바구니용량 : 남은갯수
		// 사과가 남은 경우 - 바구니갯수 1 증가
		
		System.out.println("사과담을 바구니 갯수 구하기!!");
		int apple, basket, capOfBas, mod=0;
		apple = 123; // basket가 얼마?
		capOfBas=10; // 한바구니에 10개 가능
		
		basket=apple/capOfBas; // 바구니 초기 갯수
		mod=apple%capOfBas; // 사과 남은 갯수
		
		if(mod!=0) {
			basket++;
		}
		System.out.println("최종바구니갯수="+basket);
	}

}
