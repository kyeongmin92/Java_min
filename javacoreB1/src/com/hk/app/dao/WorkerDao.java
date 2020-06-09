package com.hk.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hk.app.vo.*;

public class WorkerDao {
	
	//상태-변수(id, pw, connection ...)
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String user ="java";
	static String password = "1234";
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;	
	
	//동작-메소드
	// getconnect(), sql수행 메소드, dbclose()
	static void getconnect() {
	      if (conn == null) { // conn이 null이면
	         try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            conn = DriverManager.getConnection(url, user, password);
	         } catch(ClassNotFoundException e1) {
	             System.out.println("드라이버 에러는 ?"+e1.getMessage());
	         }
	         catch(SQLException e2) {
	             System.out.println("접속 에러는 ?"+e2.getMessage());
	         }
	      }
	   }
	static void dbclose() {
		
		if(conn!=null) {
			try{conn.close(); conn=null;} catch(SQLException e) {} }
		if(rs!=null) {
			try{rs.close(); rs=null;} catch(SQLException e) {} }
		if(stmt!=null) {
			try{stmt.close(); stmt=null;} catch(SQLException e) {} }
		if(pstmt!=null) {
			try{pstmt.close(); pstmt=null;} catch(SQLException e) {} }
		
		}
	
	public int getTotalWorker() {
		int rst=0;
		getconnect();//디비접속
		try {
			stmt = conn.createStatement();
			String sql = "SELECT COUNT(*) AS TOTAL FROM WORKER";
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				rst=rs.getInt("TOTAL");
			}
					
		} catch(SQLException e) {
			System.out.println("쿼리에러는?="+e.getMessage());
		}
		dbclose(); //디비종료
		return rst;			
	}
	
	public int checkLogin(String id, String pw) {
		int rst=0;
		getconnect();//디비접속
		try {
			
			String sql = "SELECT COUNT(*) AS CNT FROM WORKER WHERE ID=? AND PWD=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				rst=rs.getInt("CNT");
			}
					
		} catch(SQLException e) {
			System.out.println("쿼리에러는?="+e.getMessage());
		}
		dbclose(); //디비종료
		return rst;
	}
	
	public int updatePhone(String id, String phone) {
		int rst=0;
		getconnect();
        try {
        	
			String sql = "UPDATE WORKER SET PHONE =? WHERE ID= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setString(2, id);
			rst= pstmt.executeUpdate();
					
		} catch(SQLException e) {
			System.out.println("쿼리에러는?="+e.getMessage());
		}
		dbclose(); //디비종료
		return rst;
	}
	
	public WorkerVo getWorkerById(String id) {
		WorkerVo temp = new WorkerVo();
		
		getconnect();
		
		try {
			String sql="SELECT ID, PWD, NAME, PHONE FROM WORKER WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				temp.setId(rs.getString("ID"));
				temp.setPwd(rs.getString("PWD"));
				temp.setName(rs.getString("NAME"));
				temp.setPhone(rs.getString("PHONE"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		dbclose();		
		return temp;
	}

}
