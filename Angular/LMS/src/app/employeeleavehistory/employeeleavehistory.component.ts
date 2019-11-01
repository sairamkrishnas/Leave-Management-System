import { Component, OnInit } from '@angular/core';
import {EmployeeLeaveHistoryService} from './employeeleavehistory.service'
import { CommonService } from '../common.service';
import { Employee } from '../home/Employee';
import { EmployeeDetailsDisplayService } from '../employee-details-display/employee-details-display.service';
import { LeaveHistory } from '../leavehistory';
//import { EmpLeaveHistory } from './EmpLeaveHistory';

@Component({
  selector: 'app-employeeleavehistory',
  templateUrl: './employeeleavehistory.component.html',
  styleUrls: ['./employeeleavehistory.component.css']
})
export class EmployeeLeaveHistoryComponent implements OnInit {
/* leave :EmpLeaveHistory[]; */
errorMsg: any;
  emp: Employee[];
  leave : LeaveHistory[];
  constructor(public commonService : CommonService,public employeeleavehistoryService: EmployeeLeaveHistoryService) { 
    this.emp = this.commonService.getEmployee();
  }

  ngOnInit() {
    this.employeeleavehistoryService.getEmployee(this.emp[0].employee_Id).subscribe({
      next: data => {
        this.leave = data},
        error: error => this.errorMsg = error
      })
    /* this.employeeleavehistoryService.getEmpLeaveHistory().subscribe(
      data=>this.leave=data,
      error=>this.errorMsg=error
    ); */
  }
  
  //applyleaveemp() {
    //alert("Applied leave successfully!");
  //}
}
