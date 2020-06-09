package com.hk.app;

import java.util.*;

import com.hk.app.vo.CategoryVo;

public class LinkListEx40bj {	
	
	public static void main(String[] args) {
		CategoryVo[] cate = new CategoryVo[4];
		String[] data = {"의류","스포츠","가전","가구"};
		for(int i=0; i<4; i++) {
			cate[i] = new CategoryVo();
			cate[i].setKind((i+1)*10);
			cate[i].setName(data[i]);
		}
		
		// linklist 담아보자
		LinkedList cc = new LinkedList();
		for(int i=0; i<4; i++) {
			cc.add(cate[i]);
		}
		
		// 사이즈를 출력하시오
		System.out.println("링크리스트 사이즈:"+cc.size());
		Iterator itr = cc.iterator();
		while(itr.hasNext()) {
			CategoryVo temp = (CategoryVo)itr.next();
			System.out.println(temp.getKind()+"번째 카테고리는"+temp.getName());
		}
		
	}

}
