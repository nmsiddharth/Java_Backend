package com.practise.practice;

import java.sql.SQLException;

public class Delete {

	public static String delete(int id) throws SQLException {
		String sql = "delete from employees where empId = "+id;
		int i = JDBCConnectionPractise.getConnection().createStatement().executeUpdate(sql);
		if(i>0) {
			return "deleted";
		}
		return "Something went wrong";
	}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println(delete(3));
		Read.readAll();

	}

}
