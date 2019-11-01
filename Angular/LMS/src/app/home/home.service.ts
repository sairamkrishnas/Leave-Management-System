import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Employee } from './Employee';

@Injectable({
  providedIn: 'root'
})
export class HomeService {

  constructor(private httpClient:HttpClient) { }

  getEmployee(name:any,password:any):Observable<Employee[]>{
    let url = "http://localhost:14883/LeaveManagementSystem/api/training/Login/"+name+"/"+password;
    console.log(url);
    return this.httpClient.get<Employee[]>(url);
  }
}
