package com.hk.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberReg {
	    static String url = "jdbc:oracle:thin:@localhost:1521:xe";
		static String user = "java";
		static String password = "1234";
		static ResultSet rs = null;
		static Connection conn = null;
		static Statement stmt = null;
		
		
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, user, password);
			// 접속 성공시 conn = 접속결과 객체값
			stmt = conn.createStatement();
			//String sql = "SELECT COUN(*) AS TOTAL FROM WORKER";
			String sql ="SELECT * FROM MEMBER WHERE BIRTHDAY LIKE '%6%'";
			
			// SQL문에 ";"는 제거
			rs = stmt.executeQuery(sql);
			String tempId ="";
			String tempPwd ="";
			String tempName = "";
			String tempGender = "";
			String tempBirth ="";
			String tempPhone ="";
			String tempRdate ="";
			String tempEmail ="";
			
			if(rs.next()) { // 다음행에 로우값있으면 true - 값이 있나요?
				//System.out.println("리턴값 ="+rs.getInt("TOTAL"));
				//System.out.println("리턴값 ="+rs.getString("ID"));
				tempId = rs.getString(1);				
				tempPwd = rs.getString(2);
				tempGender = rs.getString(3);
				tempBirth = rs.getString(4);
				tempRdate = rs.getString("REGDATE");
				tempEmail = rs.getString(7);
			}			
			System.out.println("ID = "+tempId);
			System.out.println("PASSWORD = "+tempPwd);
			System.out.println("GENDER= "+tempGender);
			System.out.println("BIRTHDAY= "+tempBirth);
			System.out.println("REGDATE= "+tempRdate);
			System.out.println("EMAIL= "+tempEmail);
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
