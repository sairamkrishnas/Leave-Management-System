import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule, HttpClient } from '@angular/common/http'
import { AppComponent } from './app.component';
import { EmployeeDetailsDisplayComponent } from './employee-details-display/employee-details-display.component';
import { EmployeeDashboardComponent } from './employee-dashboard/employee-dashboard.component';
import { ManagerDetailsComponent } from './manager-details/manager-details.component';
import { ApplyLeaveComponent } from './apply-leave/apply-leave.component';
import { EmployeeLeaveHistoryComponent } from './employeeleavehistory/employeeleavehistory.component';
import { RouterModule, Routes} from '@angular/router';
import { NavigationComponent } from './navigation/navigation.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeDetailsDisplayComponent,
    EmployeeDashboardComponent,
    ManagerDetailsComponent,
    ApplyLeaveComponent,
    EmployeeLeaveHistoryComponent,
    NavigationComponent
  ],
  imports: [
    RouterModule.forRoot([
      {path : 'employee-dashboard', component: EmployeeDashboardComponent},
      {path : 'employee-details-display', component: EmployeeDetailsDisplayComponent},
      {path : 'manager-details', component: ManagerDetailsComponent},
      {path : 'apply-leave', component: ApplyLeaveComponent},
      {path : 'employeeleavehistory', component: EmployeeLeaveHistoryComponent},
      

    ]),
    
    BrowserModule,
    HttpClientModule,
    FormsModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
