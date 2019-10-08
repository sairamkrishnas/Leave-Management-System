import { Component, OnInit } from '@angular/core';
import {AdminleavehistoryService} from './adminleavehistory.service'
@Component({
  selector: 'app-adminleavehistory',
  templateUrl: './adminleavehistory.component.html',
  styleUrls: ['./adminleavehistory.component.css']
})
export class AdminleavehistoryComponent implements OnInit {
  leave: leavehistory[];
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
