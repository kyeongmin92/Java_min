package com.hk.app;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListEx3 {

	public static void main(String[] args) {
		// 카테고리 값을 저장해서
		LinkedList cate = new LinkedList();
		cate.add("의류");
		cate.add("스포츠");
		cate.add("가전");
		cate.add("가구");
		// 반복자로 출력해보시오
		Iterator itr = cate.iterator();
		String test ="";
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
	}
	

}
