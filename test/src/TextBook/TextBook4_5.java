package TextBook;

import java.util.Scanner;

public class TextBook4_5 {

	public static void main(String[] args) {
	  /*while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로
		예금,출금,조회,종료 기능을 제공하는 코드를 작성해보세요 */
		boolean run = true;
		
		int balance =0;
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			int num = scanner.nextInt(); // 키보드 입력
		   
			if(num==1) { // num가 1이면 예금액> 출력
				System.out.print("예금액> ");
				balance += scanner.nextInt(); // balance는 balance + 입력값
				System.out.println("");
			} else if (num==2) { //num가 2면 출금액> 출력
				System.out.print("출금액> ");
				balance -= scanner.nextInt(); // balance는 balance - 입력값
				System.out.println("");
			} else if (num==3) { //num가 3이면 잔고> 출력
				System.out.print("잔고> "+balance); // 예금액 - 출금액
				System.out.println("");
				
			} else if(num==4){ 
			
				run=false;
			}
			  
		}
		System.out.println("프로그램 종료");
	}

}
