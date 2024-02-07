package com.java.jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {

	public static String updateStudent( int id) throws SQLException{
		String sql = "update student set studentName = 'Cristiano' where studentId ="+id;
		int i = JDBCConnection.getConnection().createStatement().executeUpdate(sql);
		if(i>0) {
			return "Data updated successfully";
		}
		return "Something went wrong";
	}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println(updateStudent(2));
		ReadData.readAll();

	}

}
