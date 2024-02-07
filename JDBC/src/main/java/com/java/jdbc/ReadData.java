package com.java.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData {

	public static void readById(int id) throws SQLException{
		String sql = "select * from student where studentId ="+id;
		Statement stmt = JDBCConnection.getConnection().createStatement();
		ResultSet set = stmt.executeQuery(sql);
		while(set.next()) {
			System.out.println("Student id     :"+set.getInt(1));
			System.out.println("Student Name   :"+set.getString(2));
			System.out.println("CourseEnrolled :"+set.getString(3));
			System.out.println("_____________________________________________________________________________________________");
		}
	}
	
	public static void readAll() throws SQLException{
		String sql = "select * from student";
		Statement stmt = JDBCConnection.getConnection().createStatement();
		ResultSet set = stmt.executeQuery(sql);
		while(set.next()) {
			System.out.println("Student id     :"+set.getInt(1));
			System.out.println("Student Name   :"+set.getString(2));
			System.out.println("CourseEnrolled :"+set.getString(3));
			System.out.println("---------------------------------------------");
		}
	}
	public static void main(String[] args) throws SQLException {
		readById(1);
		readAll();
		

	}

}
