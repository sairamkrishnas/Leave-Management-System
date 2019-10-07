import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-manager-details',
  templateUrl: './manager-details.component.html',
  styleUrls: ['./manager-details.component.css']
})
export class ManagerDetailsComponent implements OnInit {
  ManagerID:number;
  FirstName: String;
  LastName:String;
  EmailAddress:String;
  Mobile:number;
  
  constructor() { 
  this.ManagerID=39873;
  this.FirstName="Selva Kumar";
  this.LastName="Daniel";
  this.EmailAddress="selvakumars@hexaware.com";
  this.Mobile=2034089876;
  
  }
  

  ngOnInit() {
  }

}
