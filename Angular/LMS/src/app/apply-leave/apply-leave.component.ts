import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { ApplyLeaveService } from './apply-leave.service';
import { Employee } from '../home/Employee';
import { CommonService } from '../common.service';
@Component({
  selector: 'app-apply-leave',
  templateUrl: './apply-leave.component.html',
  styleUrls: ['./apply-leave.component.css']
})
export class ApplyLeaveComponent implements OnInit {
  a:any;
  message : any;
  model:leave={
    employee_Id :null,
    leave_Type :null,
    leave_Reason :null,
    from_Date :null,
    to_Date:null,
  };
  emp :Employee[];
  errorMsg: any;
  
  constructor(private router:Router,public applyLeaveService : ApplyLeaveService,public commonService : CommonService) { 

    this.emp = this.commonService.getEmployee();
  }

  ngOnInit() {
  }
 
  onSubmit(value){
    const md:leave={
                    employee_Id:this.emp[0].employee_Id,
                    leave_Type:value.Ltype,
                    leave_Reason:value.reason,
                    from_Date:value.sdate,
                    to_Date:value.edate};
    this.a=this.applyLeaveService.inserData(md).subscribe((value=>{alert(value);}));
    
  }
/* onSubmit(){
  alert("Leave Applied Successfully"  + JSON.stringify(this.model));
  this.router.navigate(["employeeleavehistory"]);
} */
  
  }


