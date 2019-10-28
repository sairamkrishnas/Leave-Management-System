import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminholidayaddService {
  constructor(private http:HttpClient) { }
 hol : Holidays[];
  addHoliday(value){

    this.hol.Holiday_Name = value.Name;
    this.hol.Holiday_Type = value.Ltype;
    this.hol.Holiday_Date = value.date;
    this.hol.Holiday_Day = value.Day;
  console.log("From Service layer");
  console.log("userName"+this.hol.Holiday_Name);
  console.log("email"+this.hol.Holiday_Type);
  console.log("phone"+this.hol.Holiday_Date);
  console.log("topic"+this.hol.Holiday_Day);
    
     //return this.http.post("http://localhost:14883/LeaveManagementSystem/api/training/");
       return ;  
 
  }
}
