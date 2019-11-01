import { BrowserModule } from '@angular/platform-browser';
import { EmployeeDetailsDisplayComponent } from './employee-details-display/employee-details-display.component';
import { EmployeeDashboardComponent } from './employee-dashboard/employee-dashboard.component';
import { ManagerDetailsComponent } from './manager-details/manager-details.component';
import { ApplyLeaveComponent } from './apply-leave/apply-leave.component';
import { EmployeeLeaveHistoryComponent } from './employeeleavehistory/employeeleavehistory.component';
import { NavigationComponent } from './navigation/navigation.component';
import { NgModule, ErrorHandler } from '@angular/core';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { AdminholidayaddComponent } from './adminholidayadd/adminholidayadd.component';
import { AdminholidayviewComponent } from './adminholidayview/adminholidayview.component';
import { AdminleavehistoryComponent } from './adminleavehistory/adminleavehistory.component';
import { AdminleavehistoryPipe } from './adminleavehistory/adminleavehistory.pipe';
import { NavbarComponent } from './navbar/navbar.component';
import { AdminholidayhistoryPipe } from './adminholidayview/adminholidayhistory.pipe';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { AgmCoreModule } from '@agm/core';
import { MatDialogModule } from '@angular/material';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {HttpClientModule} from '@angular/common/http';
import { AppComponent } from './app.component';
import { ManagerDashBoardComponent } from './manager-dash-board/manager-dash-board.component';
import { LeavePageComponent } from './leave-page/leave-page.component';
import {RouterModule} from '@angular/router';
import {FormsModule} from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms'; 
import {LeavepageService} from './leave-page/leavepage.service';
import {HomeService} from './home/home.service';
import {CommonService} from './common.service';

@NgModule({
  declarations: [
    AppComponent,
    ManagerDashBoardComponent,
    EmployeeDetailsDisplayComponent,
    EmployeeDashboardComponent,
    ManagerDetailsComponent,
    ApplyLeaveComponent,
    AdmindashboardComponent,
    EmployeeLeaveHistoryComponent,
    NavigationComponent,
    AdminholidayaddComponent,
    AdminholidayviewComponent,
    AdminleavehistoryComponent,
    AdminleavehistoryPipe,
    NavbarComponent,
    AdminholidayhistoryPipe,
    HomeComponent,
    HeaderComponent,
    LeavePageComponent,
    FooterComponent,
  ],
  imports: [
    RouterModule.forRoot([
        {path : 'employee-dashboard', component: EmployeeDashboardComponent},
      { path : 'employee-details-display', component: EmployeeDetailsDisplayComponent},
      { path : 'manager-details', component: ManagerDetailsComponent},
      { path : 'apply-leave', component: ApplyLeaveComponent},
      { path : 'employeeleavehistory', component: EmployeeLeaveHistoryComponent},
      { path:'', component: HomeComponent},
      { path:'*', component: ErrorHandler},
      { path: 'adminleavehistory', component: AdminleavehistoryComponent },
      { path: 'home',      component: HomeComponent },
      { path: 'adminholidayadd',      component: AdminholidayaddComponent },
      { path: 'admindashboard',      component: AdmindashboardComponent },
      { path: 'leave-page', component:LeavePageComponent  },
      { path:'manager-dash-board',  component:ManagerDashBoardComponent},
      { path: 'adminholidayview', component: AdminholidayviewComponent }],),
    MatDialogModule,
    BrowserModule,
    HttpClientModule ,
    FormsModule,
    BrowserAnimationsModule ,
    ReactiveFormsModule
  ],


  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule { }
