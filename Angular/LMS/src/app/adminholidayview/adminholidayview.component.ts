import { Component, OnInit } from '@angular/core';
import { AdminholidayviewService } from './adminholidayview.service'
import { Holidays } from '../holidays';
/* import {MatDialog,MatDialogConfig} from '@angular/material'
import { AdminholidayaddComponent } from '../adminholidayadd/adminholidayadd.component'; */
@Component({ 
  selector: 'app-adminholidayview',
  templateUrl: './adminholidayview.component.html',
  styleUrls: ['./adminholidayview.component.css']
})
export class AdminholidayviewComponent implements OnInit {
  holidays: Holidays[];
  public searchText : any;
  errorMsg: any;
  constructor(public adminholidayviewService : AdminholidayviewService) { }

  ngOnInit() {
    this.adminholidayviewService.getHolidayHis().subscribe( 
    data => this.holidays = data,
    error => this.errorMsg = error
    );
  }
/*   create(){
    const dialogConfig = new MatDialogConfig();
    dialogConfig.disableClose = true;
    dialogConfig.autoFocus = true;
    dialogConfig.width = "60%";
    this.dialog.open(AdminholidayaddComponent, dialogConfig);
  } */
/*   Remove(index){
    this.holidays.splice(index,1);
  } */

}
