package com.hk.app.exam;

import java.util.*;

public class Student {
   static String name = null;
   static int eng;
   static int chn;
   
   
   static Scanner scan = new Scanner(System.in);
   static ArrayList<String> list = new ArrayList<String>();
   static ArrayList<Integer> list2 = new ArrayList<Integer>();
   static ArrayList<Integer> list3 = new ArrayList<Integer>();
   
   static void in() {
	   for(int i=0; i<3; i++) {
		   System.out.print("이름을 입력하세요: ");
		   name = scan.next();
		   System.out.print("영어 점수를 입력하세요: ");
		   eng = scan.nextInt();
		   System.out.print("중국어 점수를 입력하세요: ");
		   chn = scan.nextInt();
		   list.add(name);
		   list2.add(eng);
		   list3.add(chn);		   
	   }   
   }
   
   static void print() {
	   for(int i=0; i<3; i++) {
		   int sum = list2.get(i) + list3.get(i);
		   double avg = (list2.get(i) + list3.get(i))/2;
		   System.out.println("이름: "+list.get(i));
		   System.out.println("총점: "+sum);
		   System.out.println("평균: "+avg);
	   }
   }
   
   public static void main(String[] args) {
	in();
	print();
}
} 

