package com.hk.app;

public class OldBox {
	
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		
		OldBox box1 = new OldBox();
		box1.setData("문자열데이터가 왔습니다");
		
		OldBox box2 = new OldBox();
		box2.setData(10000);
		
		OldBox box3 = new OldBox();
		Lion King = new Lion();
		box3.setData(King);
		
		//가져오기
		String temp1 = (String)box1.getData();
		int temp2 = (int)box2.getData();
		Lion guess = (Lion)box3.getData();
		System.out.println(temp1 + "-" + temp2);
	}

}
