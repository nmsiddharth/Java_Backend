package com.java.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class TableCreation {

	public static String createTable() {
		try {
			String sql = "create table student(studentId int(10) primary key auto_increment,"
		+"studentName varchar(10) not null, courseEnrolled varchar(20) not null)";
			
			Connection con = JDBCConnection.getConnection();
			if(con!=null) {
				Statement stmt = con.createStatement();
				stmt.execute(sql);
				return "Table created successfully";
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "Something went wrong";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(createTable());
	}

}
