import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {AdminholidayaddService} from './adminholidayadd.service';
@Component({
  selector: 'app-adminholidayadd',
  templateUrl: './adminholidayadd.component.html',
  styleUrls: ['./adminholidayadd.component.css']
})
export class AdminholidayaddComponent implements OnInit {
 
  a:any;
  message : any;
  model:holiday={
    holiday_Name:null,
    holiday_Type:null,
    holiday_Date:null,
    holiday_Day:null
  };

  constructor(private router:Router,public formService : AdminholidayaddService) { }

  ngOnInit() {
  }
 
  onSubmit(value){
    const md:holiday={holiday_Name:value.name,
                      holiday_Type:value.Ltype,
                      holiday_Date:value.date,
                      holiday_Day:value.day};
    this.a=this.formService.inserData(md).subscribe((value=>{alert(value);}));
    
    this.router.navigate(["admindashboard"]);
  }
}




// import { Component, OnInit } from '@angular/core';
// import { Router } from '@angular/router';
// import {AdminholidayaddService} from './adminholidayadd.service';
// @Component({
//   selector: 'app-adminholidayadd',
//   templateUrl: './adminholidayadd.component.html',
//   styleUrls: ['./adminholidayadd.component.css']
// })
// export class AdminholidayaddComponent implements OnInit {
// /*   topics : any  = ["java","Angular","SQL"]; 
//   constructor(private adminholidayaddService :AdminholidayaddService) { }
 
//   ngOnInit() {
//   }
 
//   onSubmit(value:any){
//     console.log(value);
//     this.adminholidayaddService.inserData(value);
//   } */
// ngOnInit(): void {
//     throw new Error("Method not implemented.");
//   }
//   //hol : any = {};
//   //hol : Holiday[];
//   constructor(private router: Router,private adminholidayaddService :AdminholidayaddService){

//   }
//   onSubmit(hol : any) {
//    /*  this.hol.Holiday_Name = this.model.Name;
//     this.hol.Holiday_Type = this.model.Ltype;
//     this.hol.Holiday_Date = this.model.date;
//     this.hol.Holiday_Day = this.model.Day;*/
//     alert('SUCCESS:-)\n\n');
//     console.log(hol);
//     this.adminholidayaddService.addHoliday(hol);
//     //this.router.navigate(["admindashboard"]);
//   }
// }