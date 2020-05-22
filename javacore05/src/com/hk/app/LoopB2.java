package com.hk.app;

public class LoopB2 {

	public static void main(String[] args) {

         int sum=0;
         int x=1; //1~100
         while(x<=100) {
        	 if(x%3==0) {
        		 sum += x;
        	 }
        	 x++;
         }
        	 System.out.println("1~100까지 3배수의 합= "+sum);

	}

}
