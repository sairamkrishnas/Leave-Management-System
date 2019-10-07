import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { RouterModule,  Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
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
         }else {
           alert("Invalid credentials");
           this.router.navigate(['home']);
         }
       }
      
      else{
        return;
      }
       

  }
}