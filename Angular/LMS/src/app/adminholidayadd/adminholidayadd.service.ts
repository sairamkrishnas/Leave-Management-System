import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminholidayaddService {
  constructor(private http:HttpClient) { }
 
  inserData(value):Observable<Student>{
    let userName = value.userName;
    let email = value.email;
    let phone = value.phone;
    let topic= value.topic;
    let tf = value.tf;
  console.log("From Service layer");
  console.log("userName"+userName);
  console.log("email"+email);
  console.log("phone"+phone);
  console.log("topic"+topic);
  console.log("tf"+tf);
    
     return this.http.post<Student>("http://localhost:8080/ftp11-0.0.1-SNAPSHOT/api/xxx/xxx/"+userName+"/"+email+"/"+phone+"/"+topic+"/"+tf,{"userName":userName,"email":email,"phone":phone,"topic":topic,"tf":tf});
         
 
  }
}
