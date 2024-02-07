package com.practise.practice;

import java.sql.SQLException;

public class Insert {

	public static String insertData() throws SQLException {
		String sql = "insert into employees(empName, empAge) values('Virat',35)";
		int i = JDBCConnectionPractise.getConnection().createStatement().executeUpdate(sql);
		if(i>0) {
			return "Data inserted";
		}
		return "SOmethng Went wrong";
	}
	public static void main(String[] args) throws SQLException {
	System.out.println(insertData());

	}

}
