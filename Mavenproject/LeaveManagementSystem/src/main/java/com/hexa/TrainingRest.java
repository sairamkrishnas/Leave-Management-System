package com.hexa;

//package com.mycompany.appTraining;

//import com.mycompany.appTraining.Training;

import javax.ws.rs.GET;


import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.NotFoundException;

import javax.ws.rs.Path;

import javax.ws.rs.PathParam;

import javax.ws.rs.Produces;

import java.sql.ResultSet;
import java.util.ArrayList;

import javax.ws.rs.Consumes;

import javax.ws.rs.core.MediaType;

import com.hexa.model.Employee;
import com.hexa.model.Holiday;
import com.hexa.model.Leave;
import com.hexa.service.EmployeeService;
import com.hexa.service.HolidayService;
import com.hexa.service.LeaveService;

@Path("/training")

public class TrainingRest{

	
    @GET
    @Path("/displayHolidays")
    @Produces(MediaType.APPLICATION_JSON)
    
    public ArrayList<Holiday> displayHolidays(){
    	
    	ArrayList<Holiday> result = new ArrayList<Holiday>();
        HolidayService hs = new HolidayService();
        
        result = hs.ViewHoliday();

        return result;
    }
    
    
    @GET
    @Path("/Login/{name}/{password}")
    @Produces(MediaType.APPLICATION_JSON)
    
    public ArrayList<Employee> Login(@PathParam("name")final String name,@PathParam("password")final String password){
    	
    	ArrayList<Employee> e = new ArrayList<Employee>();
        EmployeeService hs = new EmployeeService();
        
        e = hs.Login(name,password);
        if (e != null)
        	return e;
        else
        	return null;
    }
    

    @GET
    @Path("/ViewEmployeeLeaves/{Empid}")
    @Produces(MediaType.APPLICATION_JSON)
    
    public ArrayList<Leave> ViewEmployeeLeaves(@PathParam("Empid")final int Empid){
    	
    	LeaveService ls = new LeaveService();
    	ArrayList<Leave> viewEmpLeaveHistory = new ArrayList<Leave>();
        
    	viewEmpLeaveHistory = ls.EmployeeLeaveHistory(Empid);
    	
        return viewEmpLeaveHistory;
    }
    
    
    @GET
    @Path("/ViewEmployee/{Empid}")
    @Produces(MediaType.APPLICATION_JSON)
    
    public ArrayList<Employee> ViewEmployee(@PathParam("Empid")final int Empid){
    	
    	EmployeeService es = new EmployeeService();
    	ArrayList<Employee> e = new ArrayList<Employee>();
    	e = es.ViewEmployeeDetails(Empid);
    	
        return e;
    }
    
    
    @GET
    @Path("/ViewManager/{Empid}")
    @Produces(MediaType.APPLICATION_JSON)
    
    public ArrayList<Employee> ViewManager(@PathParam("Empid")final int Empid){
    	
    	EmployeeService es = new EmployeeService();
    	ArrayList<Employee> e = new ArrayList<Employee>();
        
    	e = es.ViewManagerDetails(Empid);
    	
        return e;
    }
    
    
    @GET
    @Path("/ViewAllLeaves")
    @Produces(MediaType.APPLICATION_JSON)
    
    public ArrayList<Leave> ViewAllLeaves(){
    	
    	LeaveService ls = new LeaveService();
    	ArrayList<Leave> viewAllLeave = new ArrayList<Leave>();
        
    	viewAllLeave = ls.ViewLeaveHistory();
    	
        return viewAllLeave;
    }
    
    
    @GET
    @Path("/ViewPendingLeaves")
    @Produces(MediaType.APPLICATION_JSON)
    
    public ArrayList<Leave> ViewPendingLeaves(){
    	
    	LeaveService ls = new LeaveService();
    	ArrayList<Leave> viewPendingLeave = new ArrayList<Leave>();
        
    	viewPendingLeave = ls.EmployeePendingLeave();
    	
        return viewPendingLeave;
    }
    
    
    @POST
    @Path("/AddHoliday")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)

    public String AddHoliday(final Holiday hol){
    	
    	EmployeeService e = new EmployeeService();

    	String msg=e.AddHoliday(hol.getHoliday_Name(), hol.getHoliday_Type(), hol.getHoliday_Date(), hol.getHoliday_Day());

        return msg;
    } 
    
    
    @POST
    @Path("/ApplyLeave")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)

    public String ApplyLeave(final Leave l){
    	
    	EmployeeService e = new EmployeeService();

    	String msg = e.ApplyLeave(l.getEmployee_Id(),l.getLeave_Type(),l.getLeave_Reason(),l.getFrom_Date(),l.getTo_Date());

        return msg;
    } 
    
    @PUT
    @Path("/AcceptorReject")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)

    public ArrayList<Leave> AcceptorReject(Leave l){
    	EmployeeService e = new EmployeeService();
    	ArrayList<Leave> viewPendingLeave = new ArrayList<Leave>();
    	
    	String msg1 = e.AcceptOrReject(l.getLeave_Id(),l.getLeave_Status());
    	viewPendingLeave = ViewPendingLeaves();
        return viewPendingLeave;
    } 
/*
    @GET

    @Path("{tid}")

    @Produces(MediaType.APPLICATION_JSON)

    public Training trainingList(@PathParam("tid")final int tid){

        Training t=new Training();

        Training tg=t.dataFetch(tid);

        return tg;

    }

    @POST

    @Produces(MediaType.APPLICATION_JSON)

    //@Consumes(MediaType.APPLICATION_JSON)

    public String postString(){

        return "post method is done";

    }

    @POST

    @Path("{tid}/update")

    @Produces(MediaType.APPLICATION_JSON)

    @Consumes(MediaType.APPLICATION_JSON)

    public String trainingUpdate(@PathParam("tid")final int tid,Training trg ){

        Training t=new Training();

        String msg=t.dataUpdate(tid,trg.getTrainingName());

        return msg;

    }

    @POST

    @Path("/{tid}/insert")

    @Produces(MediaType.APPLICATION_JSON)

    @Consumes(MediaType.APPLICATION_JSON)

    public String trainingInsert(@PathParam("tid") final int tid, Training trg){

        Training t=new Training();

        String msg=t.dataInsertion(tid,trg.getTrainingName(),trg.getTrainingDate());

        return msg;

    }   */

}