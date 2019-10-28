package com.hexa.service;

import java.sql.ResultSet;

import com.hexa.connection.DbConnection;
import com.hexa.model.Leave;

public class LeaveService {
	ResultSet rs = null;
	
	public ResultSet ViewLeaveHistory() {
		
		DbConnection db = new DbConnection();
		rs = db.ViewLeave();
		
		return rs;
	}
	
	public ResultSet EmployeeLeaveHistory(int i){
		
		DbConnection db = new DbConnection();
		rs = db.Empleavehis(i);
		
		return rs;
	}
	
	public ResultSet EmployeePendingLeave() {
		
		DbConnection db = new DbConnection();
		rs = db.ViewPendingLeave();
		
		return rs;
	}
	
}
