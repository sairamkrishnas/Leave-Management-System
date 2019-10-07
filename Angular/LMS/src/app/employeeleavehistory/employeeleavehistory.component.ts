import { Component, OnInit } from '@angular/core';
import {EmployeeLeaveHistoryService} from './employeeleavehistory.service'
import { EmpLeaveHistory } from './EmpLeaveHistory';

@Component({
  selector: 'app-employeeleavehistory',
  templateUrl: './employeeleavehistory.component.html',
  styleUrls: ['./employeeleavehistory.component.css']
})
export class EmployeeLeaveHistoryComponent implements OnInit {
leave :EmpLeaveHistory[];
errorMsg: any;
  constructor(public employeeleavehistoryService: EmployeeLeaveHistoryService) { }

  ngOnInit() {
    this.employeeleavehistoryService.getEmpLeaveHistory().subscribe(
      data=>this.leave=data,
      error=>this.errorMsg=error
    );
  }
  
  //applyleaveemp() {
    //alert("Applied leave successfully!");
  //}
}
