import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApplyLeaveService {
  constructor(private http:HttpClient) { }
 
  inserData(value:leave):Observable<any>{
    return this.http.post('http://localhost:14883/LeaveManagementSystem/api/training/ApplyLeave',
                            value/* ,{ headers: Headers,responseType:'text'} */);
}
}
