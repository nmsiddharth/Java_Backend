package com.java.jdbc;

import java.sql.SQLException;

public class DeleteData {

		public static String deleteStudent(int id) throws SQLException{
			String sql = "delete from student where studentId ="+id;
			int i = JDBCConnection.getConnection().createStatement().executeUpdate(sql);
			System.out.println(i);
			if(i>0) {
				return "Data deleted successfully";
			}
			return "Something went wrong";
		}
	public static void main(String[] args) throws SQLException {
		System.out.println(deleteStudent(2));
		ReadData.readAll();

	}

}
