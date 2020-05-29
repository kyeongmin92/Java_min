package com.hk.app;

public class GraphRandom {

	public static void main(String[] args) {
		
		int[] number = new int[100]; // 100개 발생
		int[] counter = new int[10]; // 카운트
		// counter[0] = 12
		
		// 숫자 100개 발생
		for (int i=0; i<number.length; i++) {
			System.out.print(number[i] = (int)(Math.random()*10));
			// 0.883853 -> 8.83853 -> 8
		}
		System.out.println();
		
		// 0~9 가 몇번씩 나왔는지 카운트 증가
		for (int i=0; i<number.length; i++) {
			counter[number[i]]++;
			// counter[3]++;
		}
		
		// 화면에 그래프 출력
		for (int i=0; i<counter.length; i++) {
			System.out.println(i+"의 개수 :"+ printGraph('■', counter[i]) + " "+ counter[i]);
		}	

	}
	
	
	public static String printGraph(char ch, int value) {
		String result = "";
		for(int i=0; i<value; i++) {
			result += ch;  // 입력한 문자를 입력한 수만큼 합쳐서 = 문자열
		}
		return result;
	}
}
