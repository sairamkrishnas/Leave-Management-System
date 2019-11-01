import { Component, OnInit } from '@angular/core';
import { LeavepageService } from './leavepage.service';
import { LeaveHistory } from '../leavehistory';
import { AdminleavehistoryService } from '../adminleavehistory/adminleavehistory.service';

@Component({
  selector: 'app-leave-page',
  templateUrl: './leave-page.component.html',
  styleUrls: ['./leave-page.component.css']
})
export class LeavePageComponent implements OnInit {
  leave: LeaveHistory[];
  public searchText : any;
  errorMsg: any;
  constructor(public adminleavehistoryService : AdminleavehistoryService) { }

  ngOnInit() {
    this.adminleavehistoryService.getLeaveHis().subscribe(
      data => this.leave = data,
      error => this.errorMsg = error
    );
  }
}
