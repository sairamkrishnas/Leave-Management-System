package com.hexa.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.hexa.model.Employee;
import com.hexa.model.Holiday;
import com.hexa.model.Leave;

import java.sql.Date;

public class DbConnection {
	static DAO dao;
	static Connection con;
	ResultSet rs = null;
	ArrayList<Holiday> viewHolidays = new ArrayList<Holiday>();
	ArrayList<Leave> viewLeaveHistory = new ArrayList<Leave>();
	ArrayList<Employee> employee = new ArrayList<Employee>();
	
	public ArrayList<Leave> ViewLeave() {
		try {
			dao = new DAO();
			con = dao.getConnection();
			String sql = "select * from employee_leave";
			PreparedStatement statement = con.prepareStatement(sql);
			rs = statement.executeQuery(sql);
			while(rs.next()){
				 Leave l = new Leave(); 
				 l.setEmployee_Id(rs.getInt("Employee_Id"));
				 l.setLeave_Type(rs.getString("Leave_Type"));
				 l.setLeave_Reason(rs.getString("Leave_Reason"));
				 l.setLeave_Id(rs.getInt("Leave_Id"));
		         l.setFrom_Date(rs.getString("From_Date"));
		         l.setTo_Date(rs.getString("To_Date"));
				 l.setLeave_Status(rs.getString("Leave_Status"));
				 viewLeaveHistory.add(l);
		      }
		      rs.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		return viewLeaveHistory;
	}
	
	
	public ArrayList<Leave> ViewPendingLeave() {
		try {
			dao = new DAO();
			con = dao.getConnection();
			String sql = "select * from employee_leave where Leave_Status='Pending'";
			PreparedStatement statement = con.prepareStatement(sql);
			rs = statement.executeQuery(sql);
			while(rs.next()){
				 Leave l = new Leave(); 
				 l.setEmployee_Id(rs.getInt("Employee_Id"));
				 l.setLeave_Type(rs.getString("Leave_Type"));
				 l.setLeave_Reason(rs.getString("Leave_Reason"));
				 l.setLeave_Id(rs.getInt("Leave_Id"));
		         l.setFrom_Date(rs.getString("From_Date"));
		         l.setTo_Date(rs.getString("To_Date"));
				 l.setLeave_Status(rs.getString("Leave_Status"));
				 viewLeaveHistory.add(l);
		      }
		      rs.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		return viewLeaveHistory;
	}
	
	
	public ArrayList<Leave> Empleavehis(int i) {
		
		try {
			
			dao = new DAO();
			con = dao.getConnection();
			String sql = "select * from employee_Leave where Employee_Id = '"+i+"'";
			PreparedStatement statement = con.prepareStatement(sql);
			rs = statement.executeQuery(sql);
			 while(rs.next()){
				 Leave l = new Leave(); 
				 l.setEmployee_Id(rs.getInt("Employee_Id"));
				 l.setLeave_Type(rs.getString("Leave_Type"));
				 l.setLeave_Reason(rs.getString("Leave_Reason"));
				 l.setLeave_Id(rs.getInt("Leave_Id"));
		         l.setFrom_Date(rs.getString("From_Date"));
		         l.setTo_Date(rs.getString("To_Date"));
				 l.setLeave_Status(rs.getString("Leave_Status"));
				 viewLeaveHistory.add(l);
		      }
		      rs.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		return viewLeaveHistory;
	}
	
	
	public ArrayList<Employee> login(String name) {
		
		try {
		dao = new DAO();
		con = dao.getConnection();
		String sql = "select * from employee_details where Employee_User_Name = '"+name+"'";
		PreparedStatement statement = con.prepareStatement(sql);
		ResultSet rs = statement.executeQuery(sql);
		 while(rs.next()){
			 Employee emp = new Employee();
			 emp.setEmployee_Id(rs.getInt("Employee_Id"));
			 emp.setEmployee_LastName(rs.getString("Employee_LastName"));
			 emp.setEmployee_FirstName(rs.getString("Employee_FirstName"));
			 emp.setManager_Id(rs.getInt("Manager_Id"));
	         emp.setEmployee_Phone(rs.getLong("Employee_Phone"));
	         emp.setEmployee_Address(rs.getString("Employee_Address"));
			 emp.setEmployee_Email(rs.getString("Employee_Email"));
			 emp.setEmployee_Role(rs.getString("Employee_Role"));
			 emp.setEmployee_User_Name(rs.getString("Employee_User_Name"));
			 emp.setEmployee_Password(rs.getString("Employee_Password"));
			 emp.setEmployee_Joining(rs.getString("Employee_Joining_Date"));
			 emp.setNo_of_Leaves_Applied(rs.getInt("No_of_Leaves_Applied"));
			 emp.setImage(rs.getString("Image"));
			 employee.add(emp);
	      }
	      rs.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return employee;
	}
	
	
	public void UpdateLeaveBalanceColumn(int id,int i) {
		try {
			dao = new DAO();
			con = dao.getConnection();
				String sql = "update employee_details set No_of_Leaves_Applied = '"+i+"' where Employee_Id='"+id+"'";
				PreparedStatement statement = con.prepareStatement(sql);
				statement.executeUpdate();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		
	}
	
	public ArrayList<Employee> viewemp(int i) {
		try {
			dao = new DAO();
			con = dao.getConnection();
			String sql = "select * from employee_details where Employee_Id = '"+i+"'";
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				 Employee emp = new Employee();
				 emp.setEmployee_Id(rs.getInt("Employee_Id"));
				 emp.setEmployee_LastName(rs.getString("Employee_LastName"));
				 emp.setEmployee_FirstName(rs.getString("Employee_FirstName"));
				 emp.setManager_Id(rs.getInt("Manager_Id"));
		         emp.setEmployee_Phone(rs.getLong("Employee_Phone"));
		         emp.setEmployee_Address(rs.getString("Employee_Address"));
				 emp.setEmployee_Email(rs.getString("Employee_Email"));
				 emp.setEmployee_Role(rs.getString("Employee_Role"));
				 emp.setEmployee_User_Name(rs.getString("Employee_User_Name"));
				 emp.setEmployee_Password(rs.getString("Employee_Password"));
				 emp.setEmployee_Joining(rs.getString("Employee_Joining_Date"));
				 emp.setNo_of_Leaves_Applied(rs.getInt("No_of_Leaves_Applied"));
				 emp.setImage(rs.getString("Image"));
				 employee.add(emp);
		      }
		      rs.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		return employee;
	}
	
	
	public ArrayList<Employee> viewman(int i) {
		try {
			dao = new DAO();
			con = dao.getConnection();
			String sql = "select * from employee_details d where d.Employee_Id = (select Manager_Id from employee_details where Employee_Id='"+i+"')";
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery(sql);
			 while(rs.next()){
				 Employee emp = new Employee();
				 emp.setEmployee_Id(rs.getInt("Employee_Id"));
				 emp.setEmployee_LastName(rs.getString("Employee_LastName"));
				 emp.setEmployee_FirstName(rs.getString("Employee_FirstName"));
				 emp.setManager_Id(rs.getInt("Manager_Id"));
		         emp.setEmployee_Phone(rs.getLong("Employee_Phone"));
		         emp.setEmployee_Address(rs.getString("Employee_Address"));
				 emp.setEmployee_Email(rs.getString("Employee_Email"));
				 emp.setEmployee_Role(rs.getString("Employee_Role"));
				 emp.setEmployee_User_Name(rs.getString("Employee_User_Name"));
				 emp.setEmployee_Password(rs.getString("Employee_Password"));
				 emp.setEmployee_Joining(rs.getString("Employee_Joining_Date"));
				 emp.setNo_of_Leaves_Applied(rs.getInt("No_of_Leaves_Applied"));
				 emp.setImage(rs.getString("Image"));
				 employee.add(emp);
		      }
		      rs.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		return employee;
	}
	
	
	public String AcceptReject(int i, String m) {
		try {
			dao = new DAO();
			con = dao.getConnection();
				String sql = "update employee_leave set Leave_Status = '"+m+"' where Leave_Id='"+i+"'";
				PreparedStatement statement = con.prepareStatement(sql);
				statement.executeUpdate();
				return "Successfully  "+m;
			}
			catch(Exception e) {
				System.out.println(e);
				return " Error while updating ";
			}
	}
	
	
	public ArrayList<Holiday> ViewHolidays() {
		
		try {
			dao = new DAO();
			con = dao.getConnection();
			String sql = "select * from holiday";
			PreparedStatement statement = con.prepareStatement(sql);
			rs = statement.executeQuery(sql);
			while(rs.next()) {
				Holiday hol = new Holiday();
				hol.setHoliday_Id(rs.getInt("Holiday_Id"));
				hol.setHoliday_Name(rs.getString("Holiday_Name"));
				hol.setHoliday_Type(rs.getString("Holiday_Type"));
				hol.setHoliday_Date(rs.getString("Holiday_Date"));
				hol.setHoliday_Day(rs.getString("Holiday_Day"));
				viewHolidays.add(hol);
			}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		return viewHolidays;
	}
	
	
	public String applyLeave(int id,String type,String reason,String from,String to) {
		try {
			dao = new DAO();
			con = dao.getConnection();
			String sql = "insert into employee_leave (Employee_Id,Leave_Type,Leave_Reason,From_Date,To_Date)\r\n" + 
					"values (?,?,?,?,?)";
			PreparedStatement statement = con.prepareStatement(sql);
			Date fromdate =Date.valueOf(from);
			Date todate =Date.valueOf(to);
			
			statement.setLong(1, id);
			statement.setString(2, type);
			statement.setString(3, reason);
			statement.setDate(4, fromdate);
			statement.setDate(5, todate);
			statement.executeUpdate();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		return "Successfully Applied";
	}
	
	
	
	public String addhol(String n,String t,String d,String day) {
		try {
			dao = new DAO();
			con = dao.getConnection();
			String sql = "insert into holiday (Holiday_Name,Holiday_Type,Holiday_Date,Holiday_Day) values (?,?,?,?)";
			PreparedStatement statement = con.prepareStatement(sql);
			Date date =Date.valueOf(d);
			
			statement.setString(1, n);
			statement.setString(2, t);
			statement.setDate(3, date);
			statement.setString(4, day);
			statement.executeUpdate();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			return "Holiday Successfully added";		
	}
	
	
}