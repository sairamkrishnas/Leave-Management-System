package com.hexa.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	
	Connection conn = null;
	public Connection getConnection() throws ClassNotFoundException {
		
		String dbURL = "jdbc:mysql://localhost:3306/lms?useSSL=false";
		String username = "root";
		String password = "Hexaware123";
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, username, password);
		} 
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		return conn;
	}

}