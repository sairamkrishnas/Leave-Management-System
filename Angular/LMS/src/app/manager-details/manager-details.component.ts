import { Component, OnInit } from '@angular/core';
import { CommonService } from '../common.service';
import { Employee } from '../home/Employee';
import { ManagerDetailsService } from './manager-details.service';

@Component({
  selector: 'app-manager-details',
  templateUrl: './manager-details.component.html',
  styleUrls: ['./manager-details.component.css']
})
export class ManagerDetailsComponent implements OnInit {
  emp : Employee[];
  emp1 : Employee[];
  errorMsg: any;
  constructor(public commonService : CommonService,public managerDetailsService : ManagerDetailsService) { 
    this.emp = this.commonService.getEmployee();
  }
  

  ngOnInit() {
    this.managerDetailsService.getEmployee(this.emp[0].manager_Id).subscribe({
      next: data => {
        this.emp1 = data},
        error: error => this.errorMsg = error
      })
  }

}
