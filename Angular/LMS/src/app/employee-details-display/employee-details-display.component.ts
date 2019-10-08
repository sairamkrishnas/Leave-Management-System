import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee-details-display',
  templateUrl: './employee-details-display.component.html',
  styleUrls: ['./employee-details-display.component.css']
})
export class EmployeeDetailsDisplayComponent implements OnInit {
  EmployeeID:number;
  FirstName: String;
  LastName:String;
  EmailAddress:String;
  Mobile:number;
  Department:String;
  Address:String;
  City:String;
  State: string;
  PostalCode:String;
  constructor() { 
  this.EmployeeID=49443124;
  this.FirstName="Sunishma Reddy";
  this.LastName="Suram";
  this.EmailAddress="sunishma@hexaware.com";
  this.Mobile=2034009876;
  this.Department="Software Development"; 
  this.Address="6097 Barfield Road";
  this.City="Atlanta";
  this.State="GA";
  this.PostalCode="09876";
  }

  ngOnInit() {
  }

}
