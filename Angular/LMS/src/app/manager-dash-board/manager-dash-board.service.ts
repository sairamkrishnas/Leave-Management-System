import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { LeaveHistory } from '../leavehistory';

@Injectable({
  providedIn: 'root'
})
export class ManagerDashBoardService {

  constructor(private httpClient:HttpClient) {
   
   }
   AcceptReject(md:any):Observable<any>{
    let url = "http://localhost:14883/LeaveManagementSystem/api/training/AcceptorReject/";
    return this.httpClient.put<any>(url,md,{ headers: Headers,responseType:'text'});
   }
   getLeaveHis():Observable<LeaveHistory[]>{
    let url = "http://localhost:14883/LeaveManagementSystem/api/training/ViewPendingLeaves"
    return this.httpClient.get<LeaveHistory[]>(url);
  }
}
