package com.hexa;

import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.hexa.model.Employee;
import com.hexa.model.Holiday;
import com.hexa.model.Leave;
import com.hexa.service.EmployeeService;
import com.hexa.service.HolidayService;
import com.hexa.service.LeaveService;

public class App 
{
	public static void main(String[] args)throws Exception {
		
		Leave leave = new Leave();
		Employee emp = new Employee();
		Holiday hol = new Holiday();
		EmployeeService es = new EmployeeService();
		LeaveService ls = new LeaveService();
		HolidayService hs = new HolidayService();
		ResultSet rs = null;
		ArrayList<Holiday> result = new ArrayList<Holiday>();
		
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("1.Login");
			System.out.println("2.Exit");
			System.out.println();
			System.out.println("Enter your choice::");
			int outerchoice = scan.nextInt();

			switch(outerchoice){
			case 1: 
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your username: ");
				String username = sc.nextLine();
				System.out.println("Enter your Password: ");
				String password = sc.nextLine();
				emp = es.Login(username,password);
				if (emp.getEmployee_Role().equals("Employee")) {
					System.out.print("Welcome\t");
					System.out.print(emp.getEmployee_LastName()+",");
					System.out.print(emp.getEmployee_FirstName());
					System.out.println();
					System.out.println("Id : "+emp.getEmployee_Id());
					System.out.println("Manager Id : "+emp.getManager_Id());
					System.out.println("Address : "+emp.getEmployee_Address());
					System.out.println("Email Id : "+emp.getEmployee_Email());
					System.out.println("Active since : "+emp.getEmployee_Joining());
					System.out.println();
					boolean inner = true;
					while(inner){
						System.out.println("1. View Manager Details");
						System.out.println("2. Apply Leave");
						System.out.println("3. View My Leave History");
						System.out.println("4. Logout");
						System.out.println();
						System.out.println("Enter your choice::");
						int innerchoice = scan.nextInt();

						switch(innerchoice){
						case 1:
							Employee e = new Employee();
							e = es.ViewManagerDetails(emp.getEmployee_Id());
							System.out.println("Manager Details:");
							System.out.println("Id : "+e.getEmployee_Id());
							System.out.println("Name : "+e.getEmployee_LastName()+",");
							System.out.print(e.getEmployee_FirstName());
							System.out.println();
							System.out.println("Contact number : "+e.getEmployee_Phone());
							System.out.println("Address : "+e.getEmployee_Address());
							System.out.println("Email : "+e.getEmployee_Email());
							System.out.println();
							break;
						case 2: 
							System.out.println();
							//System.out.println("These are the number of leaves left:");
							Scanner s = new Scanner(System.in);
							System.out.println("Leave type: (Please enter EL:)");
							String type = s.nextLine();
							System.out.println("Reason for Leave:");
							String reason = s.nextLine();
							System.out.println("From Date:  (Please enter in this YYYY-MM-DD Format)");
							String fdate = s.nextLine();
							System.out.println("To Date:  (Please enter in this YYYY-MM-DD Format)");
							String tdate = s.nextLine();
							String msg = es.ApplyLeave(emp.getEmployee_Id(),type,reason,fdate,tdate);
							System.out.println(msg);
							break;
						case 3: 
							rs = ls.EmployeeLeaveHistory(emp.getEmployee_Id());
							while(rs.next()){
								System.out.println(rs.getInt("Employee_Id"));
								System.out.println(rs.getInt("Leave_Id"));
								System.out.println(rs.getString("Leave_Type"));
								System.out.println(rs.getString("Leave_Reason"));
								System.out.println(rs.getString("From_Date"));
								System.out.println(rs.getString("To_Date"));
								System.out.println(rs.getString("Leave_Status"));
							}
							rs.close();
							break;
						case 4: 
							System.out.println("Employee Logout");
							inner = false;
							break;
						default: 
							System.out.println("Incorrect input!!! Please re-enter choice");
						}
					}
					
				}
				else if (emp.getEmployee_Role().equals("Manager")) {
					System.out.println("Welcome Manager");
					System.out.println(emp.getEmployee_Id());
					System.out.println(emp.getEmployee_LastName());
					System.out.println(emp.getEmployee_FirstName());
					System.out.println(emp.getEmployee_Phone());
					System.out.println(emp.getEmployee_Address());
					System.out.println(emp.getEmployee_Email());
					System.out.println(emp.getEmployee_Joining());
					boolean inner = true;
					while(inner){
						System.out.println("1. View Leaves to Accept / Reject:");
						System.out.println("2. View All Leave History");
						System.out.println("3. Logout");
						System.out.println();
						System.out.println("Enter your choice::");
						int innerchoice = scan.nextInt();

						switch(innerchoice){
						case 1:
							rs = ls.EmployeePendingLeave();
							while(rs.next()){
								System.out.println(rs.getInt("Employee_Id"));
								System.out.println(rs.getInt("Leave_Id"));
								System.out.println(rs.getString("Leave_Type"));
								System.out.println(rs.getString("Leave_Reason"));
								System.out.println(rs.getString("From_Date"));
								System.out.println(rs.getString("To_Date"));
							}
							rs.close();
							Scanner s = new Scanner(System.in);
							System.out.println("Enter Employee Id");
							int id = s.nextInt();
							System.out.println("Are you Approving or Rejecting: Please take action based on these values(Approved Or Rejected)");
							String action = s.nextLine();
							String msg = es.AcceptOrReject(id,action);
							System.out.println(msg);
							break;
						case 2: 
							rs = ls.ViewLeaveHistory();
							while(rs.next()){
								System.out.println(rs.getInt("Employee_Id"));
								System.out.println(rs.getInt("Leave_Id"));
								System.out.println(rs.getString("Leave_Type"));
								System.out.println(rs.getString("Leave_Reason"));
								System.out.println(rs.getString("From_Date"));
								System.out.println(rs.getString("To_Date"));
								System.out.println(rs.getString("Leave_Status"));
							}
							rs.close();
							break;
						case 3: 
							System.out.println("Employee Logout");
							inner = false;
							break;
						default: 
							System.out.println("Incorrect input!!! Please re-enter choice");
						}
					}
				}
				else if (emp.getEmployee_Role().equals("Admin"))
				{
					System.out.println("Welcome Admin");
					System.out.println(emp.getEmployee_Id());
					System.out.println(emp.getEmployee_LastName());
					System.out.println(emp.getEmployee_FirstName());
					System.out.println(emp.getEmployee_Address());
					System.out.println(emp.getEmployee_Email());
					System.out.println(emp.getEmployee_Joining());
					boolean inner = true;
					while(inner){
						System.out.println("1. Add Holiday");
						System.out.println("2. View Holidays");
						System.out.println("3. View Employee Leave History");
						System.out.println("4. Logout");
						System.out.println();
						System.out.println("Enter your choice::");
						int innerchoice = scan.nextInt();

						switch(innerchoice){
						case 1: 
							Scanner s = new Scanner(System.in);
							System.out.println("Enter Holiday Name: ");
							String holidayname = s.nextLine();
							System.out.println("Type of Holiday:");
							String type = s.nextLine();
							System.out.println("Holiday Date:");
							String date = s.nextLine();
							System.out.println("Holiday Day: (Please enter in this YYYY-MM-DD Format)");
							String day = s.nextLine();
							String msg = es.AddHoliday(holidayname,type,date,day);
							System.out.println(msg);
							break;
						case 2: 
							result = hs.ViewHoliday();
							for(int i = 0; i< result.size() ; i++) {
								
								System.out.println(result.get(i).getHoliday_Id());
								System.out.println(result.get(i).getHoliday_Name());
								System.out.println(result.get(i).getHoliday_Type());
								System.out.println(result.get(i).getHoliday_Date());
								System.out.println(result.get(i).getHoliday_Day());
							}
							break;
						case 3: 
							rs = ls.ViewLeaveHistory();
							while(rs.next()){
								System.out.println(rs.getInt("Employee_Id"));
								System.out.println(rs.getInt("Leave_Id"));
								System.out.println(rs.getString("Leave_Type"));
								System.out.println(rs.getString("Leave_Reason"));
								System.out.println(rs.getString("From_Date"));
								System.out.println(rs.getString("To_Date"));
								System.out.println(rs.getString("Leave_Status"));
							}
							rs.close();
							break;
						case 4: 
							System.out.println("Admin Logout");
							inner = false;
							break;
						default: 
							System.out.println("Incorrect input!!! Please re-enter choice");
						}
					}
				}
				else {
					System.out.println("Invalid Details!!!");
				}
				break;
			case 2: 
				System.exit(0);
				break;
			default: 
				System.out.println("Incorrect input!!! Please re-enter choice");
			}
		}
		
		
		//    Apply Leave 
		//String msg = es.ApplyLeave(1,"EL","Sick","2019-10-17","2019-10-20");
		//System.out.println(msg);
		
		
		//  Reject or Accept
		//es.AcceptOrReject(1,"Approved");
		
		
		/*   View All Leaves
		rs = ls.ViewLeaveHistory();
		while(rs.next()){
			System.out.println(rs.getInt("Employee_Id"));
			System.out.println(rs.getInt("Leave_Id"));
			System.out.println(rs.getString("Leave_Type"));
			System.out.println(rs.getString("Leave_Reason"));
			System.out.println(rs.getString("From_Date"));
			System.out.println(rs.getString("To_Date"));
			System.out.println(rs.getString("Leave_Status"));
		}
		rs.close();*/
		
		
		/*  View Emp Leaves
		rs = ls.EmployeeLeaveHistory(1);
		while(rs.next()){
			System.out.println(rs.getInt("Employee_Id"));
			System.out.println(rs.getInt("Leave_Id"));
			System.out.println(rs.getString("Leave_Type"));
			System.out.println(rs.getString("Leave_Reason"));
			System.out.println(rs.getString("From_Date"));
			System.out.println(rs.getString("To_Date"));
			System.out.println(rs.getString("Leave_Status"));
		}
		rs.close();*/
		
		
		/*    Pending Leaves
		rs = ls.EmployeePendingLeave();
		while(rs.next()){
			System.out.println(rs.getInt("Employee_Id"));
			System.out.println(rs.getInt("Leave_Id"));
			System.out.println(rs.getString("Leave_Type"));
			System.out.println(rs.getString("Leave_Reason"));
			System.out.println(rs.getString("From_Date"));
			System.out.println(rs.getString("To_Date"));
		}
		rs.close();*/
		
		
		/*    View Employee Details
		emp = es.ViewEmployeeDetails(1);
		System.out.println(emp.getEmployee_Id());
		System.out.println(emp.getEmployee_LastName());
		System.out.println(emp.getEmployee_FirstName());
		System.out.println(emp.getEmployee_Address());
		System.out.println(emp.getEmployee_Email());
		System.out.println(emp.getEmployee_Joining());*/
		
		
		/*   View Manager Details
		emp = es.ViewManagerDetails(1);
		System.out.println(emp.getEmployee_Id());
		System.out.println(emp.getEmployee_LastName());
		System.out.println(emp.getEmployee_FirstName());
		System.out.println(emp.getEmployee_Phone());
		System.out.println(emp.getEmployee_Address());
		System.out.println(emp.getEmployee_Email());*/
		
		
		/*  Login
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username: ");
		String username = sc.nextLine();
		System.out.println("Enter your Password: ");
		String password = sc.nextLine();
		es.Login(username,password);*/
		//leave = ls.ViewLeaveHistory();
		
		
		/*  View Holiday
		result = hs.ViewHoliday();
		for(int i = 0; i< result.size() ; i++) {
			
			System.out.println(result.get(i).getHoliday_Id());
		}*/
		
		
		/*  Add Holiday
		String msg = es.AddHoliday("Sankranthi","Optional","2019-01-26","Monday");
		System.out.println(msg);*/
		
		
	}
}
