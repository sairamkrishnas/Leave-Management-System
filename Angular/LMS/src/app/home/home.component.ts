import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, NgForm } from '@angular/forms';
import { Router, NavigationEnd } from '@angular/router';
import { HomeService } from './home.service';
import { NgForOf } from '@angular/common';
import { Employee } from './Employee';
import {CommonService} from '../common.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  registerForm: FormGroup;
  submitted = false;
  name:string;
  password:string;
  manager = "Manager";
  employee = "Employee";
  admin = "Admin";
  emp : Employee[];

  errorMsg: any;
  stateService: any;
  
mySubscription: any;
  constructor(private router:Router, private formBuilder: FormBuilder,public homeService : HomeService,public commonService : CommonService) { 
    this.router.routeReuseStrategy.shouldReuseRoute = function () {
      return false;
    };
    this.mySubscription = this.router.events.subscribe((event) => {
      if (event instanceof NavigationEnd) {
        // Trick the Router into believing it's last link wasn't previously loaded
        this.router.navigated = false;
      }
    });


  }
  ngOnDestroy() {
    if (this.mySubscription) {
      this.mySubscription.unsubscribe();
    }
  }
  ngOnInit() { this.registerForm = this.formBuilder.group({
    email: ['', [Validators.required, Validators.email]],
    password: ['', [Validators.required, Validators.minLength(6)]]
});
  }
  get f() { return this.registerForm.controls; }

  onSubmit() {
      this.submitted = true;
      
      if (this.registerForm.valid) {
        this.homeService.getEmployee(this.name,this.password).subscribe({
            next: data => {
              this.emp = data;
              if( this.emp != null ){
                if(this.emp[0].employee_Role == this.manager){
                  this.commonService.employeedetails(this.emp);
                  this.router.navigate(["manager-dash-board"]);
                }
                else if(this.emp[0].employee_Role == this.employee){
                  this.commonService.employeedetails(this.emp);
                  this.router.navigate(["employee-dashboard"]);
                }
                else{
                  this.commonService.employeedetails(this.emp);
                  this.router.navigate(["admindashboard"]);
                }
              }
              else{
                alert("Invalid credentials\n Please try again");
                this.router.navigate(["home"]);
              }
          },
          error: error => this.errorMsg = error
        });
          
        /* if(this.emp.employee_Role.localeCompare(this.manager)){
          this.router.navigate(["manager-dash-board"]);
         }else {
           alert("Invalid credentials");
           this.router.navigate(['home']);
         } */
       }
      
      else{
        return;
      }
  }


}