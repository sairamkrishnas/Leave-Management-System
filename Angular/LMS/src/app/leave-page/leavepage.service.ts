import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { LeaveHistory } from '../leavehistory';
@Injectable({
  providedIn: 'root'
})
export class LeavepageService {

  constructor(private httpClient:HttpClient) { }

  getLeaveHis():Observable<LeaveHistory[]>{
    let url = "http://localhost:14883/LeaveManagementSystem/api/training/ViewAllLeaves"
    return this.httpClient.get<LeaveHistory[]>(url);
  }
/*   getpending() :Observable<pending[]>{
 
   return this.httpClient.get<pending[]>("assets/pendingleave.json");
 } */
}
