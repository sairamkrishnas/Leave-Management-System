import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from '../home/Employee';

@Injectable({
  providedIn: 'root'
})
export class ManagerDetailsService {

  constructor(private httpClient:HttpClient) { }
  getEmployee(managerid : any):Observable<Employee[]>{
    let url = "http://localhost:14883/LeaveManagementSystem/api/training/ViewManager/"+managerid;
    console.log(url);
    return this.httpClient.get<Employee[]>(url);
  }
}
