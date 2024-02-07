package com.batchProcessing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.jdbc.JDBCConnection;

public class BatchProcessing {

	public static void addCars() throws SQLException {
		Connection con = JDBCConnection.getConnection();
		String sql = "insert into car(registrationNumber,ModalNumber,user) values(?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, "abcd1234");
		ps.setInt(2, 1234);
		ps.setString(3, "Siddu");
		
		ps.addBatch();
		
		ps.setString(1, "wxyz1234");
		ps.setInt(2, 4567);
		ps.setString(3, "Virat");
		
		ps.addBatch();
		
		ps.setString(1, "sdgh7890");
		ps.setInt(2, 7890);
		ps.setString(3, "Somu");
		
		ps.addBatch();
		
		int[] i = ps.executeBatch();
		System.out.println(i.length+" rows affected");
	}
	public static void main(String[] args) throws SQLException {
		addCars();
	

	}

}
