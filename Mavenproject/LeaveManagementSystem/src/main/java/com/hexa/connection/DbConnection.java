package com.hexa.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;

public class DbConnection {
	static DAO dao;
	static Connection con;
	
	public String insertData(int id,String name,String hdate){
		try {
		dao = new DAO();
		con = dao.getConnection();
		String sql = "INSERT INTO employee (id, name, hdate) VALUES (?, ?, ?)";
		PreparedStatement statement = con.prepareStatement(sql);
		Date d =Date.valueOf(hdate);
		
		statement.setInt(1, id);
		statement.setString(2, name);
		statement.setDate(3, d);
		statement.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return "Data inserted";		
		}
	public void ViewHolidays() {
		try {
			dao = new DAO();
			con = dao.getConnection();
			String sql = "select * from holiday";
			PreparedStatement statement = con.prepareStatement(sql);
			System.out.println(statement);
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}
	
	

}