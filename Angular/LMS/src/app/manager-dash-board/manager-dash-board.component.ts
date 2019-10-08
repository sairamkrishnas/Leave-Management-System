import { Component, OnInit } from '@angular/core';
import { ManagerDashBoardService } from './manager-dash-board.service'

@Component({
  selector: 'app-manager-dash-board',
  templateUrl: './manager-dash-board.component.html',
  styleUrls: ['./manager-dash-board.component.css']
})
export class ManagerDashBoardComponent implements OnInit {
  holidays: Leave[];
  errorMsg: any;
  constructor(public ManagerDashBoardService : ManagerDashBoardService) { }

  ngOnInit() {
    this.ManagerDashBoardService.getLeave().subscribe( 
      data => this.holidays = data,
      error => this.errorMsg = error
      );
  }

}
