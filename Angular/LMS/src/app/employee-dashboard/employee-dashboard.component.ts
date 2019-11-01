import { Component, OnInit } from '@angular/core';
import { Employee } from '../home/Employee';
import { CommonService } from '../common.service';

@Component({
  selector: 'app-employee-dashboard',
  templateUrl: './employee-dashboard.component.html',
  styleUrls: ['./employee-dashboard.component.css']
})
export class EmployeeDashboardComponent implements OnInit {
  emp : Employee[];
  errorMsg: any;
  constructor(public commonService : CommonService) {
    this.emp = commonService.getEmployee();
  }

  ngOnInit() {
  }

}
