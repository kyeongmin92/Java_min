package com.hk.app;

import java.util.*;

public class LinkListEx2 {

	public static void main(String[] args) {
		
		//선언
		LinkedList lil = new LinkedList();
		//초기데이터 입력하기
		lil.add("농구화");
		lil.add("슬리퍼");
		lil.add("배낭");
		lil.add("점퍼");
		lil.add("밴드");
		//데이터 추가하기
		lil.addFirst("탁구채");
		
    /*	for(int i=0; i<lil.size(); i++) {
			System.out.print(lil.get(i)+", ");
		}  */
		printlist(lil);
		
		//데이터 삭제하기(배낭)
		
		lil.remove(3);
	/*	for(int i=0; i<lil.size(); i++) {
			System.out.print(lil.get(i)+", ");
		}   */
		printlist(lil);
		
		//마지막 데이터 삭제
		lil.removeLast();
		printlist(lil);
		
		// 슬리퍼와 농구화 사이 모자
		// 맨처음 데이터를 삭제하시오
		lil.add(2, "모자");
		lil.removeFirst();
		printlist(lil);
		//저장값으로 삭제
		lil.remove("점퍼");
		printlist(lil);

	}
	
	public static void printlist(LinkedList lil2) {
		Iterator itr = lil2.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+", ");
		}
		System.out.println();
	}

}
