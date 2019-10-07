import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { EmpLeaveHistory } from './EmpLeaveHistory';

@Injectable({
  providedIn: 'root'
})
export class EmployeeLeaveHistoryService {

  constructor(private httpClient:HttpClient) { }

getEmpLeaveHistory():Observable<EmpLeaveHistory[]>{
  return this.httpClient.get<EmpLeaveHistory[]>("assets/leavehistory.json");
}
}
