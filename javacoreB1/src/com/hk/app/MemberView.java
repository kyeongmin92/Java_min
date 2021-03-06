package com.hk.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberView {
	
	     static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	     static String user = "java";
	     static String password = "1234";
	 
	     static Connection conn = null;
	     static Statement stmt = null;

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, user, password);
			// 접속 성공시 conn = 접속결과 객체값
			stmt = conn.createStatement();
			
			String sql ="INSERT INTO MEMBER (ID, PWD, GENDER, BIRTHDAY, PHONE,  EMAIL)\r\n" + 
					"VALUES ('MAN1', 1234, '남', '1992-04-01', '010-1234-5678', 'ABC@DEF.COM')";
			String sql2 ="INSERT INTO MEMBER (ID, PWD, GENDER, BIRTHDAY, PHONE,  EMAIL)\r\n" + 
					"VALUES ('WOMAN1', 1111, '여', '1988-06-05', '010-2222-5678', 'QWE@DEF.COM')";
			
			int success = stmt.executeUpdate(sql);
			int success2 = stmt.executeUpdate(sql2);		
			System.out.println("성공값 = "+success);
			System.out.println("성공값 = "+success2);
			System.out.println("드라이버 로딩성공, 접속성공");
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩실패");
			e.printStackTrace();
		} catch (SQLException e2) {			
			System.out.println("드라이버 접속실패"+e2.getMessage());
			e2.printStackTrace();
		}

	}

}
