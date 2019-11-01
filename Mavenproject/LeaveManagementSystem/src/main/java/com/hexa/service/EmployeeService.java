package com.hexa.service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;

import com.hexa.connection.DbConnection;
import com.hexa.model.Employee;

public class EmployeeService {
	Employee e = new Employee();
	ArrayList<Employee> employee = new ArrayList<Employee>();
	
	public static int getDaysBetweenTwoDates(Date startDate, Date endDate) {
	    Calendar startCal = Calendar.getInstance();
	    startCal.setTime(startDate);        

	    Calendar endCal = Calendar.getInstance();
	    endCal.setTime(endDate);
	    
	    Calendar C = Calendar.getInstance();
	    Date date1 = java.sql.Date.valueOf("2019-10-18");
	    C.setTime(date1);
	    int Days = 1;

	    //Return 0 if start and end are the same
	    if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
	        return 0;
	    }

	    if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
	        startCal.setTime(endDate);
	        endCal.setTime(startDate);
	    }
	    
	    do {
	       //excluding start date
	    	startCal.add(Calendar.DAY_OF_MONTH, 1);
	        if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && startCal.compareTo(C) != 0) {
	            ++Days;
	        }
	    } while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date

	    return Days;
	}
	
	
	public String ApplyLeave(int id,String type,String reason,String from,String to){
		
		DbConnection db = new DbConnection();
		
		//String dateBeforeString = "2017-05-24";
		//String dateAfterString = "2017-07-29";
		employee=db.viewemp(id);
		//Parsing the date
		LocalDate dateBefore = LocalDate.parse(from);
		LocalDate dateAfter = LocalDate.parse(to);
		Date date1 = java.sql.Date.valueOf(dateBefore);
		Date date2 = java.sql.Date.valueOf(dateAfter);
		
		LocalDate joiningdate = LocalDate.parse(employee.get(0).getEmployee_Joining());
		if (dateBefore.isAfter(java.time.LocalDate.now())) {
		//calculating number of days in between
		//long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, java.time.LocalDate.now());
			
		int noOfDaysBetween = getDaysBetweenTwoDates(date1,date2);
		int noOfDaysAfterJoining = (int)(ChronoUnit.MONTHS.between(joiningdate, java.time.LocalDate.now())*2-employee.get(0).getNo_of_Leaves_Applied());
		int noOfDaysCanApply = noOfDaysAfterJoining-employee.get(0).getNo_of_Leaves_Applied();
		//displaying the number of days
		System.out.println(noOfDaysBetween);
		//System.out.println(noOfDaysAfterJoining);
		//System.out.println(java.time.LocalDate.now()); 
		
		if(noOfDaysBetween <= noOfDaysCanApply) {
			int no = Math.abs(employee.get(0).getNo_of_Leaves_Applied() - noOfDaysBetween);
			db.UpdateLeaveBalanceColumn(id,no);
			String i = db.applyLeave(id, type, reason, from, to);
			return i;
		}
		else {
			return "Sorry, You Can't Apply Leave";
		}
		
		}
		else
		{
			return "Sorry, You cant apply leave for prier to today";
		}
		
	}
	public String AddHoliday(String n,String t,String d,String day) {
		
		DbConnection db = new DbConnection();
		String i = db.addhol(n,t,d,day);
		
		return i;
	}
	public ArrayList<Employee> Login(String n, String p) {
		
		DbConnection db = new DbConnection();
		employee = db.login(n);
		
		if (employee.get(0).getEmployee_User_Name().equals(n)&& employee.get(0).getEmployee_Password().equals(p)) {
			return employee;
		}
		else {
			System.out.println("Invalid Details");
			return null;
		}
		
	}
	public String AcceptOrReject(int i,String m) {
		
		DbConnection db = new DbConnection();
		String msg = db.AcceptReject(i,m);
		return msg;
	}
	
	public ArrayList<Employee> ViewEmployeeDetails(int i) {
		
		DbConnection db = new DbConnection();
		employee = db.viewemp(i);
		
		return employee;
	}
	public ArrayList<Employee> ViewManagerDetails(int i) {
		
		DbConnection db = new DbConnection();
		employee = db.viewman(i);
		
		return employee;
	}
}
