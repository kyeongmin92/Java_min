package Exam;

import java.util.*;

public class TripleGame2 {

	public static void main(String[] args) {
		String g ="", com="";
		
		System.out.println("***AI 모드***");
		System.out.println("----------(어지, 니, 쌈 )선택----------");
		Scanner scan = new Scanner(System.in);
	    System.out.print("나의 선택: ");
		String me = scan.nextLine();   // 나의 선택 어지, 니, 쌈 중 하나 입력
		
		Random ran = new Random();
		
		
		int c = ran.nextInt(3);  // 컴퓨터의 선택 어지, 니, 쌈 3개 중 랜덤 선택
		
		if (c ==0) { // 컴퓨터가 0을 뽑으면 '어지'
			com="어지";
		} else if (c==1) { // 컴퓨터가 1을 뽑으면 '니'
			com="니";
		} else if (c==2) { // 컴퓨터가 2를 뽑으면 '쌈' aa
			com="쌈";
		}
		System.out.println("컴퓨터의 선택: " + com);
		
		Random random = new Random();
		System.out.println("----------결 과----------");
		System.out.print("구슬의 갯수: ");
		int Guseul = random.nextInt(50)+1;      // 구슬갯수 1~50개 중 랜덤 선택
		
		System.out.println(Guseul + "개");
		
		

if (Guseul%3==1) { 
			g = "어지";
		} else if (Guseul%3==2) { 
			g = "니";
		} else  { 
			g= "쌈";
		}   // 구슬갯수(시스템) 3으로 나눳을때 나머지가 1이면 '어지', 2이면 '니', 그 이외는 '쌈' 출력
		System.out.println("시스템 결과 : "+ g);
		
		if ( com.equals(me)) { // 컴퓨터와 내가 선택한 결과가 같으면 "시스템 에러" 출력
			System.out.println("시스템 에러!!");
		} else if ( me.equals(g)) { // 내가 선택한 값과 시스템의 결과가 같으면 "나의 승리" 출력
			System.out.println("나의 승리!!");
		} else if(com.equals(g)){ // 컴퓨터와 시스템의 결과값이 같으면 "컴퓨터 승리" 출력
			System.out.println("컴퓨터 승리!!");
		} else { // 그 이외의 값이 나오면 "무승부" 출력
			System.out.println("무승부!!");
		}  
		
		

	}

}
