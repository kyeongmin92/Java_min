package com.hk.app.exam_java;

public class NewCalcUtils extends CalcUtils{
	
	void avg() {
		System.out.println((double)(left+right)/2);
	}
	void substract() {
		System.out.println(left-right);
	}
	
	
	
public static void main(String[] args) {
		
		NewCalcUtils c1 = new NewCalcUtils();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();		
	} 

}
