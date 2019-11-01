import { Component, OnInit } from '@angular/core';
import { ManagerDashBoardService } from './manager-dash-board.service'
import { Employee } from '../home/Employee';
import { CommonService } from '../common.service';
import { LeaveHistory } from '../leavehistory';
import { splitClasses } from '@angular/compiler';

@Component({
  selector: 'app-manager-dash-board',
  templateUrl: './manager-dash-board.component.html',
  styleUrls: ['./manager-dash-board.component.css']
})
export class ManagerDashBoardComponent implements OnInit {
  //holidays: Leave[];
  emp : Employee[];
  leave : leave[];
  errorMsg: any;
  a:any;
  constructor(public ManagerDashBoardService : ManagerDashBoardService,public commonService : CommonService) {
    this.emp = commonService.getEmployee();
  }
  Accept(empId : any,i:any){
    const md:updateleave={
      leave_Id:empId,
    leave_Status:'Approved'};
this.a=this.ManagerDashBoardService.AcceptReject(md).subscribe((value=>{alert(value);}));
this.leave.splice(i,1);

    //this.ManagerDashBoardService.AcceptReject(empId,"Approved").subscribe((value=>{alert(value);}));
  }
  Reject(empId : any,i:any){
    const md:updateleave={
      leave_Id:empId,
    leave_Status:'Rejected'};
this.a=this.ManagerDashBoardService.AcceptReject(md).subscribe((value=>{alert(value);}));
this.leave.splice(i,1);
  }
  ngOnInit() {
    this.ManagerDashBoardService.getLeaveHis().subscribe(
      data => this.leave = data,
      error => this.errorMsg = error
    );
    /* this.ManagerDashBoardService.getLeave().subscribe( 
      data => this.holidays = data,
      error => this.errorMsg = error
      ); */
  }

}
