package com.hk.app;

import java.sql.*;

public class DbConnect4 {
	
	    static String url = "jdbc:oracle:thin:@localhost:1521:xe";
		static String user = "java";
		static String password = "1234";
		
		static Connection conn = null;
		static Statement stmt = null;
		static PreparedStatement pstmt = null;
		

	public static void main(String[] args) {
		
		// delete문
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, user, password);
			// 접속 성공시 conn = 접속결과 객체값
			String sql ="DELETE FROM WORKER WHERE ID=?";   // 1
			String id = "design";		
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id); // 1부터시작 : DB ==? 다넣으면 sql 완성 
			int success = pstmt.executeUpdate();
			
					
			System.out.println("성공값 = "+success);			
			System.out.println("드라이버 로딩성공, 접속성공");
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩실패");
			e.printStackTrace();
		} catch (SQLException e2) {			
			System.out.println("드라이버 접속실패");
			e2.printStackTrace();
		}
		
		

	}

}
