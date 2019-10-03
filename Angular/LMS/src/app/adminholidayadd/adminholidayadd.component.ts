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
  constructor(private router: Router){

  }
  onSubmit() {
    alert('SUCCESS:-)\n\n' + JSON.stringify(this.model))
    this.router.navigate(["admindashboard"]);
  } 
}