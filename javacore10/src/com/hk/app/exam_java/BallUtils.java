package com.hk.app.exam_java;

public class BallUtils extends Shape3dVo{
	int r;	
	double v;
	
	BallUtils(int x, int y, int z, int r) {
		this.x =x;
		this.y =y;
		this.z =z;
		this.r =r;
	}
	
	int getRadius() {
		return r;
	}
	
	double CalcVolume() {
		
		return v = (x / y) *(Math.PI*Math.pow(r, 3));
	}
	
	public static void main(String[] args) {
		BallUtils ball = new BallUtils(4,3,5,10);
		ball.CalcVolume();
		System.out.println("좌표x ="+ball.x);
		System.out.println("좌표y ="+ball.y);
		System.out.println("좌표z ="+ball.z);
		System.out.println("반지름r ="+ball.r);
		System.out.println("부피 ="+ball.v);
	}

}
