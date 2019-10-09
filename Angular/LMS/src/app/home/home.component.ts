import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  latitude = 33.911702;
  longitude =-84.350697;
  locationChosen = false;

  onChoseLocation(event) {
    this.latitude = event.coords.lat;
    this.longitude = event.coords.lng;
    this.locationChosen = true;
  }
  registerForm: FormGroup;
  submitted = false;
  name:string;
  password:string;
  constructor(private router:Router, private formBuilder: FormBuilder) { }
  
  ngOnInit() { this.registerForm = this.formBuilder.group({
    email: ['', [Validators.required, Validators.email]],
    password: ['', [Validators.required, Validators.minLength(6)]]
});
  }
  get f() { return this.registerForm.controls; }

  onSubmit() {
      this.submitted = true;

      // stop here if form is invalid
      if (this.registerForm.valid) {
        if(this.name == 'vicky@gmail.com' && this.password == 'vignesh'){
          this.router.navigate(["manager-dash-board"]);
         }
         else if(this.name == 'sairam@gmail.com' && this.password == 'sairam1234' ){
          this.router.navigate(["admindashboard"]);
         }
         else if(this.name == 'sunishma@gmail.com' && this.password == 'sunishma' ){
          this.router.navigate(["employee-dashboard"]);
         }
         else {
           alert("Invalid credentials");
           this.router.navigate(['home']);
         }
       }
      
      else{
        return;
      }
       

  }
}
