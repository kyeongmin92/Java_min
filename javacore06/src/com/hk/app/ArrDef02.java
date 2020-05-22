package com.hk.app;

public class ArrDef02 {

	public static void main(String[] args) {
		
		// 가상 동물원
		// 사자 한마리 (다리갯수, 이름, 몸무게, 성별)
		int  legOfLion =4;
		String nameOfLion = "g";
		double weightOfLion = 300.0d; //kg
		char gen = 'm';
		
		// 원숭이 3마리 (다리갯수(팔+다리), 이름, 몸무게, 성별)
		int[] legOfMonks = new int[3];
		String[] nameOfMonks = new String[3];
		double[] weiOfMonks = new double[3];
		char[] genOfMonks = new char[3];
		
		// 초기화1
		legOfMonks[0] = legOfMonks[1] = legOfMonks[0] =2;
		nameOfMonks[0] = "몽1";
		nameOfMonks[1] = "몽2";
		nameOfMonks[2] = "몽3";		
		// legOfMonks, genOfMonks
		
		// 독수리2마리 (날개갯수), 이름, 몸무게, 성별
		double[] wingOfEagles = {2,2}; // 0, 1 - 2개
		char[] genOfEagles = {'m', 'f'};
		
		// 반복문을 사용한 방법
		int[] number = new int[5];
		for(int i=0; i<5; i++) {
			number[i] = i+1; // 1 2 3 4 5
		}
		
		// 짝수배열 1~20까지 짝수값을 대입 (총 10개)
		int[] even = new int[10];
		for (int i =0; i<10; i++) {
			even[i] = (i+1)*2; 
			System.out.println(even[i]);
		}
	
		
		
		
		
				
	}

}
