import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ManagerDashBoardService {

  constructor(private httpClient:HttpClient) {
   
   }
   getLeave() :Observable<Leave[]>{
    
    return this.httpClient.get<Leave[]>("assets/leavehistory.json");
  }
}
