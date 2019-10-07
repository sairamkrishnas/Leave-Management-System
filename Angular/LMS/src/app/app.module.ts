import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import { AppComponent } from './app.component';
import { ManagerDashBoardComponent } from './manager-dash-board/manager-dash-board.component';
import { LeavePageComponent } from './leave-page/leave-page.component';
  import {RouterModule} from '@angular/router';
import {FormsModule} from '@angular/forms';
import {LoginComponent} from './login/login.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations'
  import { ReactiveFormsModule } from '@angular/forms'; 
  import {HeaderComponent} from "./header/header.component";
  import{FooterComponent} from "./footer/footer.component";

import {LeavepageService} from './leave-page/leavepage.service';

@NgModule({
  declarations: [
    AppComponent,
    ManagerDashBoardComponent,
    LoginComponent,
    HeaderComponent,
    LeavePageComponent,
    FooterComponent,
  
  ],
  imports: [
    RouterModule.forRoot([
      { path:'',component:LoginComponent},
       { path: 'leave-page', component:LeavePageComponent  },
       {path:'login',  component:LoginComponent},
       {path:'manager-dash-board',  component:ManagerDashBoardComponent}
    ],),
    BrowserModule,
    HttpClientModule ,
    FormsModule,
    BrowserAnimationsModule ,
    ReactiveFormsModule       
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
