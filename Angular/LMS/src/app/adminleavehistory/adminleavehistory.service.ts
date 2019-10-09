import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminleavehistoryService {
  constructor(private httpClient:HttpClient) { }

  /* getEmp():Observable<employee[]>{
    let url = "http://dummy.restapiexample.com/api/v1/employees"
    return this.httpClient.get<employee[]>(url);
  } */
  getLeaveHis() :Observable<leavehistory[]>{
    return this.httpClient.get<leavehistory[]>("assets/adminleavehistory.json");
  }
}
