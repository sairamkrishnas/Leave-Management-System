import { Component, OnInit } from '@angular/core';
import { AdmindashboardService } from './admindashboard.service';
import { Employee } from '../home/Employee';
import { CommonService } from '../common.service';

@Component({
  selector: 'app-admindashboard',
  templateUrl: './admindashboard.component.html',
  styleUrls: ['./admindashboard.component.css']
})
export class AdmindashboardComponent implements OnInit {
   public searchText : any;
   emp :Employee[];
   errorMsg: any;
   constructor(public admindashboardService : AdmindashboardService,public commonService : CommonService) { 
    this.emp = this.commonService.getEmployee();
   }
 
   ngOnInit() {
    
     /* this.admindashboardService.getAdmin().subscribe(
       data => this.admin = data,
       error => this.errorMsg = error
     ); */
   }
 
 }
 