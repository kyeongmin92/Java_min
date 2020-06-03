package com.hk.app.exam_java;

public class TestCalc {

	public static void main(String[] args) {
		
		CalcUtils c1 = new CalcUtils();
		c1.setOprands(10,20);
		c1.sum(); 
		c1.avg(); // 제대로 안나옴
		c1.setOprands(10,20,30);
		c1.sum();
		c1.avg();
	} 

}

