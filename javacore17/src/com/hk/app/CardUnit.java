package com.hk.app;

import java.util.*;

public class CardUnit {

	public static void main(String[] args) {
		// 2~10  k q j a joker : 14장 
		// arraylist<>에 담아서 랜덤 2장 출력
		Random zen = new Random();
		ArrayList <String> a = new ArrayList<>();
		ArrayList <String> b = new ArrayList<>();
		String[] arr = {"2","3","4","5","6","7","8","9","10","k","q","j","a","joker"};
		for(int i=0; i<arr.length; i++) {
			a.add(arr[i]);
			b.add(arr[i]);			
		}
		int ran = zen.nextInt(14);
		int ran2 = zen.nextInt(14);
		String get_card = a.get(ran);
		String get_card2 = b.get(ran2);
		System.out.println(get_card+" "+get_card2);
		
		
		
		

	}

}
