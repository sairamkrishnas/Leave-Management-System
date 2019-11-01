import { Injectable } from '@angular/core';
import { Employee } from './home/Employee';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CommonService {
  emp : Employee[];
  constructor() { }

  employeedetails(e : Employee[]): void{
    this.emp = e;
    console.log(this.emp);
  }

  getEmployee(){
    return this.emp;
  }
  
}
