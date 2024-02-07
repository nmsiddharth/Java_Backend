package com.practise.practice;

import java.sql.SQLException;

public class Update {

	public static String update(int id) throws SQLException {
		String sql = "update employees set empAge = 39 where empId = "+id;
		int i = JDBCConnectionPractise.getConnection().createStatement().executeUpdate(sql);
		if(i>0) {
			return "Updated";
		}
		return "Something went wrong";
	}
	public static void main(String[] args) throws SQLException {
		System.out.println(update(2));
		Read.readAll();
	

	}

}
