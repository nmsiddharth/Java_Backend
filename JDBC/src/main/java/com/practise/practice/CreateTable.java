package com.practise.practice;

import java.sql.Connection;
import java.sql.SQLException;

public class CreateTable {

	public static String createTable() throws SQLException {
		String sql = "create table employees(empId int(10) primary key auto_increment , empName varchar(20) not null, empAge int(10) not null)";
		Connection con = JDBCConnectionPractise.getConnection();
		
		if(con!=null) {
			con.createStatement().execute(sql);
			return "Table is Created";
		}else {
			return "SOmethng Went wrong";
		}
		
	}
	public static void main(String[] args) throws SQLException {
		System.out.println(createTable());

	}

}
