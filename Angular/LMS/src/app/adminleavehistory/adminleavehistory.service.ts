import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { LeaveHistory } from '../leavehistory';

@Injectable({
  providedIn: 'root'
})
export class AdminleavehistoryService {
  constructor(private httpClient:HttpClient) { }

  getLeaveHis():Observable<LeaveHistory[]>{
    let url = "http://localhost:14883/LeaveManagementSystem/api/training/ViewAllLeaves"
    return this.httpClient.get<LeaveHistory[]>(url);
  }
 /*  getLeaveHis() :Observable<leavehistory[]>{
    return this.httpClient.get<leavehistory[]>("assets/adminleavehistory.json");
  } */
}
