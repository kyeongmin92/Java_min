package Exam;

import java.util.*;

public class TripleGame {

	public static void main(String[] args) {
		
		System.out.println("----------(어지, 니, 쌈 )선택----------");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("상대방 선택: " );
		String you = scan.nextLine(); // 상대방 선택 어지, 니, 쌈 중 하나 입력
		
		System.out.print("본인 선택: ");
		String me = scan.nextLine(); // 나의 선택 어지, 니, 쌈 중 하나 입력
		
		System.out.println("----------결 과----------");
		Random ran = new Random();
		
		System.out.print("구슬의 갯수: ");
		int Guseul = ran.nextInt(50)+1; // 구슬갯수 1~50개 중 랜덤 선택
		
		String g ="";
	
		System.out.println(Guseul + "개");
		
		
		if (Guseul%3==1) {
			g = "어지";
		} else if (Guseul%3==2) {
			g = "니";
		} else if(Guseul%3==0) {
			g= "쌈";
		} // 구슬갯수(시스템) 3으로 나눳을때 나머지가 1이면 '어지', 2이면 '니', 그 이외는 '쌈' 출력
		System.out.println("시스템 결과 : "+ g);
		
		if ( you.equals(me)) { // 컴퓨터와 내가 선택한 결과가 같으면 "시스템 에러" 출력
			System.out.println("시스템 에러!!");
		} else if ( me.equals(g)) { // 내가 선택한 값과 시스템의 결과가 같으면 "나의 승리" 출력
			System.out.println("나의 승리!!");
		} else if( you.equals(g)){ // 컴퓨터와 시스템의 결과값이 같으면 "컴퓨터 승리" 출력
			System.out.println("상대방 승리!!");
		} else { // 그 이외의 값이 나오면 "무승부" 출력 aa
			System.out.println("무승부!!");
		} 
		
			
	}

}
