import { Component, OnInit } from '@angular/core';
import { Employee } from '../home/Employee';
import { CommonService } from '../common.service';
import { EmployeeDetailsDisplayService } from './employee-details-display.service';

@Component({
  selector: 'app-employee-details-display',
  templateUrl: './employee-details-display.component.html',
  styleUrls: ['./employee-details-display.component.css']
})
export class EmployeeDetailsDisplayComponent implements OnInit {
  public searchText : any;
  emp :Employee[];
  errorMsg: any;
  constructor(public admindashboardService : EmployeeDetailsDisplayService,public commonService : CommonService) { 
   this.emp = this.commonService.getEmployee();
  }

  ngOnInit() {
     
    /* this.admindashboardService.getAdmin().subscribe(
      data => this.admin = data,
      error => this.errorMsg = error
    ); */
  }

}
