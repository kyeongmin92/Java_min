package com.hk.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberMod {
	    static String url = "jdbc:oracle:thin:@localhost:1521:xe";
        static String user = "java";
        static String password = "1234";

        static Connection conn = null;
        static Statement stmt = null;

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDr"
					+ "iver");
			
			conn = DriverManager.getConnection(url, user, password);
			// 접속 성공시 conn = 접속결과 객체값
			stmt = conn.createStatement();
			// 1개 회원정보 INSERT로 추가
			String sql ="INSERT INTO MEMBER (ID, PWD, GENDER, BIRTHDAY, PHONE,  EMAIL)\r\n" + 
					"VALUES ('WOMAN2', 3333, '여', '1996-05-11', '010-3215-4546', 'IOP@DEF.COM')";
			// WOMAN2 회원정보  생일, 전화번호, 이메일 수정 
			String newBirth = "1996-01-01";
			String newPhone = "010-1111-1111";
			String newEmail = "111@DEF.COM";
			String sql2 ="UPDATE MEMBER SET BIRTHDAY='" + newBirth + "', PHONE='" + newPhone + "', EMAIL ='" + newEmail + "' WHERE ID ='WOMAN2'";
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
