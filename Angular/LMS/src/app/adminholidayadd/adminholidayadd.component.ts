import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {AdminholidayaddService} from './adminholidayadd.service';
@Component({
  selector: 'app-adminholidayadd',
  templateUrl: './adminholidayadd.component.html',
  styleUrls: ['./adminholidayadd.component.css']
})
export class AdminholidayaddComponent implements OnInit {
/*   topics : any  = ["java","Angular","SQL"]; 
  constructor(private adminholidayaddService :AdminholidayaddService) { }
 
  ngOnInit() {
  }
 
  onSubmit(value:any){
    console.log(value);
    this.adminholidayaddService.inserData(value);
  } */
ngOnInit(): void {
    throw new Error("Method not implemented.");
  }
  model: any = {};
  hol : Holidays[];
  constructor(private router: Router,private adminholidayaddService :AdminholidayaddService){

  }
  onSubmit() {
    this.hol.Holiday_Name = this.model.Name;
    this.hol.Holiday_Type = this.model.Ltype;
    this.hol.Holiday_Date = this.model.date;
    this.hol.Holiday_Day = this.model.Day;
    alert('SUCCESS:-)\n\n');
    this.adminholidayaddService.addHoliday(this.hol);
    //this.router.navigate(["admindashboard"]);
  }
}