import { Component, OnInit } from '@angular/core';
import { AdmindashboardService } from './admindashboard.service';

@Component({
  selector: 'app-admindashboard',
  templateUrl: './admindashboard.component.html',
  styleUrls: ['./admindashboard.component.css']
})
export class AdmindashboardComponent implements OnInit {
   admin: Admin[];
   public searchText : any;
   errorMsg: any;
   constructor(public admindashboardService : AdmindashboardService) { }
 
   ngOnInit() {
     this.admindashboardService.getAdmin().subscribe(
       data => this.admin = data,
       error => this.errorMsg = error
     );
   }
 
 }
 