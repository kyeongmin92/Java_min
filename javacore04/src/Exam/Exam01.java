package Exam;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*1. 점수를 입력하세요
          90이상 A -> 95점이상 A+
          80이상 B -> 85점이상 B+
          70이상 C -> 75점이상 C+
          60이상 D -> 65점이상 D+
          3. 결과를 출력하시오 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = scan.nextInt();
		System.out.print("등급은 ");
		if(score>=90) { if(score>=95) {	System.out.println("A+ 입니다.");}
		else {System.out.println("A 입니다.");}}
		else if(score>=80){ if(score>=85) {System.out.println("B+ 입니다.");}
		else {System.out.println("B 입니다.");}}
		else if(score>=70) { if(score>=75) {System.out.println("C+ 입니다.");}
		else {System.out.println("C 입니다.");}}
		else if(score>=60){ if(score>=65) {System.out.println("D+ 입니다.");}
		else {System.out.println("D 입니다.");}} 
}
}