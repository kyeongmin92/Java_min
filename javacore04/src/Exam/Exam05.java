package Exam;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		/* 총 이수학점이 140점 이상이고, 토익점수가 700점 이상이면 졸업
		 * "졸업을 축하합니다"
		 * 총 이수학점이 140점 이상이나, 토익점수가 700점 미만이면 수료
		 * "아쉽지만 수료하셨습니다"
		 * 총 이수학점이 140점 미만이면 졸업도 안되고 수료도 안되므로
		 * "졸업이 불가합니다"
		 */
      Scanner scan = new Scanner(System.in);
      System.out.print("이수학점 : ");
      int score = scan.nextInt();
      System.out.print("토익점수: ");
      int toeic = scan.nextInt();
      
      if (score >= 140 && toeic>=700) {
    	  System.out.println("졸업을 축하합니다");
      } else if (score >= 140 && toeic<700) {
    	  System.out.println("아쉽지만 수료하셨습니다");
      } else if (score <140) {
    	  System.out.println("졸업이 불가합니다");
      }
	}

}
