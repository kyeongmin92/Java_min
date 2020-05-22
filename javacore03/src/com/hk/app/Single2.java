package com.hk.app;

public class Single2 {

	public static void main(String[] args) {

         int x=10;
         int y=11;
         int z=12;
         int guess= x++ + --y + z++;
   
         System.out.println(guess);
         System.out.println(x);
         System.out.println(y);
         System.out.println(z);
         
	}

}
