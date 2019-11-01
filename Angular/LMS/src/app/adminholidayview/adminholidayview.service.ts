import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Holidays } from '../holidays';
@Injectable({
  providedIn: 'root'
})
export class AdminholidayviewService {
  
  constructor(private httpClient:HttpClient) { }

  getHolidayHis():Observable<Holidays[]>{
    let url = "http://localhost:14883/LeaveManagementSystem/api/training/displayHolidays"
    return this.httpClient.get<Holidays[]>(url);
  }
  /* getHolidayHis() :Observable<holidays[]>{
    return this.httpClient.get<holidays[]>("assets/holidays.json");
  } */
}
