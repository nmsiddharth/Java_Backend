package com.practise.practice;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnectionPractise {

	private static final String driverClass = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/practice";
	private static final String userName = "root";
	private static final String password = "MySQL@2024";
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driverClass);
			if(con==null) {
				con = DriverManager.getConnection(url,userName,password);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		System.out.println(getConnection());

	}

}
