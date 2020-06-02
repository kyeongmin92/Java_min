package com.hk.app.exam_java;

public class NewCalcUtils extends CalcUtils{
	
	void avg() {
		System.out.println((double)(left+right)/2);
	}
	void substract() {
		System.out.println(left-right);
	}
	
	
	
public static void main(String[] args) {
		
		NewCalcUtils c2 = new NewCalcUtils();
		c2.setOprands(10, 20);
		c2.sum();
		c2.avg();
		c2.substract();		
	} 

}
