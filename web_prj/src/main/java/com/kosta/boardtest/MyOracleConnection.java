package com.kosta.boardtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;

public class MyOracleConnection {

	private static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static final String DB_ID = "it";
	private static final String DB_PW = "0000";
	
	public DataSource myOracleDataSource() { //커넥션풀에 접근할수있는 메서드
		OracleConnectionPoolDataSource ds = null;
		try { 
			ds = new OracleConnectionPoolDataSource();
			ds.setURL(DB_URL);
			ds.setUser(DB_ID);
			ds.setPassword(DB_PW);
		} catch( SQLException e) {
			e.printStackTrace();
		}
		return ds;			
	}	
	
	
	public Connection oracleConn () { //직접적으로 받는 형태다. 본인이 클래스 로드해서 겟커넥션 하는 형태다. 이 형태보다는 위의 datasorce형식을 추천한다.

		Connection conn = null;
		PreparedStatement pstmt  = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			if(conn != null) {
				System.out.println("conn ok");
			} else {
				System.out.println("faild");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return conn;
	}


	public void oracleClose(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs!=null) rs.close();
			if (pstmt!=null) pstmt.close();
			if (conn!=null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void oracleClose(Connection conn, PreparedStatement pstmt) {
		try {
			if (pstmt!=null) pstmt.close();
			if (conn!=null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
