import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from '../home/Employee';
import { LeaveHistory } from '../leavehistory';

@Injectable({
  providedIn: 'root'
})
export class EmployeeLeaveHistoryService {

  constructor(private httpClient:HttpClient) { }
  getEmployee(empid : any):Observable<LeaveHistory[]>{
    let url = "http://localhost:14883/LeaveManagementSystem/api/training/ViewEmployeeLeaves/"+empid;
    console.log(url);
    return this.httpClient.get<LeaveHistory[]>(url);
  }
}
