import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule, HttpClient } from '@angular/common/http'
import { AppComponent } from './app.component';
import { ManagerDashBoardComponent } from './manager-dash-board/manager-dash-board.component';
import { EmployeeDetailsDisplayComponent } from './employee-details-display/employee-details-display.component';
import { EmployeeDashboardComponent } from './employee-dashboard/employee-dashboard.component';
import { ManagerDetailsComponent } from './manager-details/manager-details.component';
import { ApplyLeaveComponent } from './apply-leave/apply-leave.component';
import { EmployeeLeaveHistoryComponent } from './employeeleavehistory/employeeleavehistory.component';
import { NavigationComponent } from './navigation/navigation.component';
import { NgModule, ErrorHandler } from '@angular/core';
import { FormsModule }   from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { AdminholidayaddComponent } from './adminholidayadd/adminholidayadd.component';
import { AdminholidayviewComponent } from './adminholidayview/adminholidayview.component';
import { AdminleavehistoryComponent } from './adminleavehistory/adminleavehistory.component';
import { AdminleavehistoryPipe } from './adminleavehistory/adminleavehistory.pipe';
import { RouterModule } from '@angular/router';
import { NavbarComponent } from './navbar/navbar.component';
import { AdminholidayhistoryPipe } from './adminholidayview/adminholidayhistory.pipe';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    ManagerDashBoardComponent,
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
      {path:'', component: HomeComponent},
      {path:'*', component: ErrorHandler},
      {path: 'adminleavehistory', component: AdminleavehistoryComponent },
      { path: 'login',      component: LoginComponent },
      { path: 'home',      component: HomeComponent },
      { path: 'adminholidayadd',      component: AdminholidayaddComponent },
      { path: 'admindashboard',      component: AdmindashboardComponent },
      { path: 'adminholidayview', component: AdminholidayviewComponent }],),
    
    BrowserModule,
    HttpClientModule,
    FormsModule,
    LoginComponent,
    AdmindashboardComponent,
    AdminholidayaddComponent,
    AdminholidayviewComponent,
    AdminleavehistoryComponent,
    AdminleavehistoryPipe,
    NavbarComponent,
    AdminholidayhistoryPipe,
    HomeComponent,
    HeaderComponent,
    FooterComponent,
  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
