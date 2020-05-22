package test1;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// Auto-generatred method stub
		// 영문아이디 입력 저장
		// 토익점수(정수) 입력 저장
		// 출력형태
		// 아이디 토익점수
		// --------------
		// rose 678
		Scanner scan = new Scanner(System.in);
		String id;
		int score;
		System.out.print("영문아이디 입력:");
		id = scan.nextLine();
		System.out.print("토익점수 입력:");
		score = scan.nextInt();
		
		System.out.println("아이디\t토익점수");
		System.out.println("--------------");
		System.out.println(id+"\t"+score);
		
	}

}
