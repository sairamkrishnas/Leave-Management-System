import { Component, OnInit } from '@angular/core';
import { LeavepageService } from './leavepage.service';

@Component({
  selector: 'app-leave-page',
  templateUrl: './leave-page.component.html',
  styleUrls: ['./leave-page.component.css']
})
export class LeavePageComponent implements OnInit {
  holidays: pending[];
  errorMsg: any;
 
  constructor(public leavepageService : LeavepageService) {
    
   }

  ngOnInit() {
     
    this.leavepageService.getpending().subscribe(
      
      data => this.holidays = data,
      error => this.errorMsg = error
      );
    

    }
}
