package com.hk.app;

public class ExceptMethod {

	public static void main(String[] args) {
		
		ExceptMethod test = new ExceptMethod();
		try {
			test.loadJDBC();
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		

	}
	
	//드라이버로딩
	public void loadJDBC() throws ClassNotFoundException {
		
		// 예외 발생 예측 가능
		getClass().forName("oracle.jdbc.driver.OracleDriver");
	}

}
