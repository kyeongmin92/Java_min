package com.hk.app.exam_java;

public class Shape2dVo {
	
	static int x;
	static int y;
	//생성자
	void Shape2dVo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public static void main(String[] args) {
		
		Shape2dVo circle = new Shape2dVo();
		circle.Shape2dVo(10,5);
		System.out.println("x = "+circle.x+" y = "+circle.y);
		
		
	}
	

}



/* package com.hk.app.exam_java;

public class Shape2dVo {
	
	static int x;
	static int y;
	void Shape2dVo(int x, int y) {
		this.x = x;
	    this.y = y;

	}
	
	void Shape2dVo() {
		Shape2dVo(0,0);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public static void main(String[] args) {
		
		Shape2dVo circle = new Shape2dVo();
		circle.Shape2dVo(10,5);
		System.out.println("("+x+","+y+")");
		
		
	}
	

}  */

