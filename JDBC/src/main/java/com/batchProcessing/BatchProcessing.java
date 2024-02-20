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
		
		ps.setString(1, "jjfj534");
		ps.setInt(2, 5556);
		ps.setString(3, "Dhoni");
		
		ps.addBatch();
		
		ps.setString(1, "iojgjg45466");
		ps.setInt(2, 7666);
		ps.setString(3, "ABD");
		
		ps.addBatch();
		
		ps.setString(1, "lggjf705");
		ps.setInt(2, 8594);
		ps.setString(3, "Jimmy");
		
		ps.addBatch();
		
		int[] i = ps.executeBatch();
		System.out.println(i.length+" rows affected");
	}
	public static void main(String[] args) throws SQLException {
		addCars();
	

	}

}
