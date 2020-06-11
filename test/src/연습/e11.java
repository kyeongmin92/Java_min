package 연습;

import java.util.Scanner;

public class e11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int grade =scan.nextInt();
		int toeic =scan.nextInt();
		if(grade>=140 && toeic>=700) {
			System.out.println("졸업을 축하합니다");
		} else if(grade>=140 && toeic<=700) {
			System.out.println("아쉽지만 수료하셨습니다");
		} else {
			System.out.println("졸업이 불가합니다");
		}

	}

}
