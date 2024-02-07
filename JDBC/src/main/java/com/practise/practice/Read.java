package com.practise.practice;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Read {

	public static void readByID(int id) throws SQLException {
		String sql = "select * from employees where empId ="+id;
		ResultSet set = JDBCConnectionPractise.getConnection().createStatement().executeQuery(sql);
		while(set.next()){
			System.out.println("Employee ID = "+set.getInt(1));
			System.out.println("Employee Name = "+set.getString(2));
			System.out.println("Employee Age = "+set.getInt(3));
			System.out.println("-----------------------------------------");
		}
	}
	
	public static void readAll() throws SQLException {
		String sql = "select * from employees";
		ResultSet set = JDBCConnectionPractise.getConnection().createStatement().executeQuery(sql);
		while(set.next()){
			System.out.println("Employee ID = "+set.getInt(1));
			System.out.println("Employee Name = "+set.getString(2));
			System.out.println("Employee Age = "+set.getInt(3));
			System.out.println("__________________________________________________________");
		}
	}
	public static void main(String[] args) throws SQLException {
		readByID(1);
		readAll();

	}

}
