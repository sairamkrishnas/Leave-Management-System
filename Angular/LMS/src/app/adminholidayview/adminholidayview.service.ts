import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class AdminholidayviewService {
  
  constructor(private httpClient:HttpClient) { }

  /* getEmp():Observable<employee[]>{
    let url = "http://dummy.restapiexample.com/api/v1/employees"
    return this.httpClient.get<employee[]>(url);
  } */
  getHolidayHis() :Observable<holidays[]>{
    return this.httpClient.get<holidays[]>("assets/holidays.json");
  }
}
