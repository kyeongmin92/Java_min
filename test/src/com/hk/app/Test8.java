package com.hk.app;

import java.util.Random;

public class Test8 {
	
	public static String printGraph(char ch, int value) {
		String result = "";
		for(int i=0; i<value; i++) {
			result += ch;  // 입력한 문자를 입력한 수만큼 합쳐서 = 문자열
		}
		return result;
	}
	

	public static void main(String[] args) {
		
		int[] lotto = new int[8];
		System.out.println("로또번호출력");
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] =(int)(Math.random()*50)+1;			
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		System.out.println("--------------------");
		
		// 입력번호 100개 발생 
		int[] plyer = new int[100];	
		int count = 0;
		
	      for (int i = 0; i < plyer.length; i++) {
	         for (int j = 0; j < 8; j++) {
	        	 plyer[j] = (int)(Math.random()*50)+1;
	        	 System.out.print(" " + plyer[j]);
	            if(lotto[j] == plyer[j]) {
	            	count++;
	            }	            
	         }
	         System.out.println();	         
	      }
			

	}

}
