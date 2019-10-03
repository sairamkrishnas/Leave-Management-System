import { Component, OnInit } from '@angular/core';
import { AdminholidayviewService } from './adminholidayview.service'
@Component({
  selector: 'app-adminholidayview',
  templateUrl: './adminholidayview.component.html',
  styleUrls: ['./adminholidayview.component.css']
})
export class AdminholidayviewComponent implements OnInit {
  holidays: holidays[];
  public searchText : any;
  errorMsg: any;
  constructor(public adminholidayviewService : AdminholidayviewService) { }

  ngOnInit() {
    this.adminholidayviewService.getHolidayHis().subscribe( 
    data => this.holidays = data,
    error => this.errorMsg = error
    );
  }

}
