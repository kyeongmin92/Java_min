package com.hk.app.exam_java;

public class CalcUtils {
	
	
	int left;
	int right;
	int third;
	
	 void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	 
	 void setOprands(int left, int right, int third) {
		this.left = left;
		this.right = right;
		this.third = third;
	}

	 void sum() {		
		System.out.println(left+right+third);
	}
	
	
	 void avg() {
		
		System.out.println((left+right+third)/3);		
	}	
	


}
