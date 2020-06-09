package com.hk.app;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		
		//선언
		HashMap map = new HashMap();
		
		//category - 키값(내용값)
		map.put(10, "의류");
		map.put(20, "스포츠");
		map.put(30, "가전");
		map.put(40, "가구");
		map.put(40, "컴퓨터"); // key 중복 
			
		for(int i=0; i<4; i++) {
			System.out.println(map.get((i+1)*10));
		}
		

	}

}
