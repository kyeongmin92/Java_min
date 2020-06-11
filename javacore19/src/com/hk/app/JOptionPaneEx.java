package com.hk.app;

import java.util.*;

import javax.swing.*;

public class JOptionPaneEx {

	public static void main(String[] args) {
		
		// 랜덤숫자 맞추기 1~10까지 랜덤값 발생
		int guess, target;
		String guessStr, message="";
		int again =1;  //1이면 다시 입력 정의 
		Random zen = new Random();
		target = zen.nextInt(10)+1; //1~10
		//System.out.println(target);
		// joptionpane 값을 입력받음
		do {
		guessStr = JOptionPane.showInputDialog("추측숫자를 입력하시오");
		System.out.println(guessStr);
		guess=Integer.valueOf(guessStr);
		// 비교처리
		if(guess > target) {
			message = "입력값이 랜덤값보다 큽니다";
		} else if(guess < target) {
			message = "입력값이 랜덤값보다 작습니다";
		} else {
			message = "정답입니다.";
			again=0;
		}
		// joptionpane 결과 출력
		JOptionPane.showMessageDialog(null, message);
	}while(again==1);

	}

}
