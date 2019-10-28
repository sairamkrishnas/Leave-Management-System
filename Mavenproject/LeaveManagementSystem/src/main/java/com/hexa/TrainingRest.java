package com.hexa;

//package com.mycompany.appTraining;

//import com.mycompany.appTraining.Training;

import javax.ws.rs.GET;


import javax.ws.rs.POST;

import javax.ws.rs.NotFoundException;

import javax.ws.rs.Path;

import javax.ws.rs.PathParam;

import javax.ws.rs.Produces;

import java.util.ArrayList;

import javax.ws.rs.Consumes;

import javax.ws.rs.core.MediaType;

import com.hexa.model.Employee;
import com.hexa.model.Holiday;
import com.hexa.service.EmployeeService;
import com.hexa.service.HolidayService;

@Path("/training")

public class TrainingRest{

    @GET
    @Path("/displayHolidays")
    @Produces(MediaType.APPLICATION_JSON)

    public ArrayList<Holiday> displayHolidays(){
    	ArrayList<Holiday> result = new ArrayList<Holiday>();
        System.out.println("GOODDD");
        HolidayService hs = new HolidayService();
        
        result = hs.ViewHoliday();

        return result;

    }
    
    @POST

    @Path("/AddHoliday")

    @Produces(MediaType.APPLICATION_JSON)

    @Consumes(MediaType.APPLICATION_JSON)

    public String AddHoliday(final Holiday hol){
    	
    	EmployeeService e = new EmployeeService();
    	
//        String msg=e.AddHoliday(hol.getHoliday_Name(), hol.getHoliday_Type(), hol.getHoliday_Date(), hol.getHoliday_Day());
        		
        return "Print the values";

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