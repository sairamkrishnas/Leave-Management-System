import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
@Component({
  selector: 'app-apply-leave',
  templateUrl: './apply-leave.component.html',
  styleUrls: ['./apply-leave.component.css']
})
export class ApplyLeaveComponent implements OnInit {
 
  ngOnInit(): void{
    throw new Error("not implemented");
  }
 model : any={};
 
 constructor(private router: Router) { 

    
}
onSubmit(){
  alert("Leave Applied Successfully"  + JSON.stringify(this.model));
  this.router.navigate(["employeeleavehistory"]);
}
  
  }


