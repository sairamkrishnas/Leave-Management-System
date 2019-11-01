package com.hexa.service;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.hexa.connection.DbConnection;
import com.hexa.model.Leave;

public class LeaveService {
	ResultSet rs = null;
	ArrayList<Leave> viewLeaveHistory = new ArrayList<Leave>();
	
	public ArrayList<Leave> ViewLeaveHistory() {
		
		DbConnection db = new DbConnection();
		viewLeaveHistory = db.ViewLeave();
		
		return viewLeaveHistory;
	}
	
	public ArrayList<Leave> EmployeeLeaveHistory(int i){
		
		DbConnection db = new DbConnection();
		viewLeaveHistory = db.Empleavehis(i);
		
		return viewLeaveHistory;
	}
	
	public ArrayList<Leave> EmployeePendingLeave() {
		
		DbConnection db = new DbConnection();
		viewLeaveHistory = db.ViewPendingLeave();
		
		return viewLeaveHistory;
	}
	
}
