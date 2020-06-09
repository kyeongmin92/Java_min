package com.hk.app;

import java.util.ArrayList;

public class GenericEx {

	public static void main(String[] args) {
		
		ArrayList<String> arrbox = new ArrayList<String>();
		arrbox.add("테니스");
		arrbox.add("야구");

		ArrayList arrbox2 = new ArrayList();
		arrbox.add("테니스");
		arrbox.add("야구");
		
		// 가져올 때
		String sports = arrbox.get(0);
		
		String sports2 = (String) arrbox2.get(0);

	}

}
