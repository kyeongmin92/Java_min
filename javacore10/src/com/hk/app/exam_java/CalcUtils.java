package com.hk.app.exam_java;

public class CalcUtils {
	
	//필드
	int left;
	int right;
	int third;
	
	//메소드
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
		 
		 if (third==0) {
			 System.out.println((left+right)/2);
		 } else {
			 System.out.println((left+right+third)/3);
		 }		
	}	 
	


}
