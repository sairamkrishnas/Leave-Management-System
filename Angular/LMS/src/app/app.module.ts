import { BrowserModule } from '@angular/platform-browser';
import { NgModule, ErrorHandler } from '@angular/core';
import { FormsModule }   from '@angular/forms';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { AdminholidayaddComponent } from './adminholidayadd/adminholidayadd.component';
import { AdminholidayviewComponent } from './adminholidayview/adminholidayview.component';
import { HttpClientModule } from '@angular/common/http';
import { AdminleavehistoryComponent } from './adminleavehistory/adminleavehistory.component';
import { AdminleavehistoryPipe } from './adminleavehistory/adminleavehistory.pipe';
import { RouterModule } from '@angular/router';
import { NavbarComponent } from './navbar/navbar.component';
import { AdminholidayhistoryPipe } from './adminholidayview/adminholidayhistory.pipe';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { AgmCoreModule } from '@agm/core';
import { MatDialogModule } from '@angular/material';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
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
  imports: [
    RouterModule.forRoot([
      {path:'', component: HomeComponent},
      {path:'*', component: ErrorHandler},
      {path: 'adminleavehistory', component: AdminleavehistoryComponent },
      { path: 'login',      component: LoginComponent },
      { path: 'home',      component: HomeComponent },
      { path: 'adminholidayadd',      component: AdminholidayaddComponent },
      { path: 'admindashboard',      component: AdmindashboardComponent },
      { path: 'adminholidayview', component: AdminholidayviewComponent }],),
    FormsModule, 
    HttpClientModule,
    BrowserAnimationsModule,
    MatDialogModule,
    BrowserModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyA3jd636bBrRo6a8IZ5LnHtKpjE1aFnmQM'
    })
  ],
  providers: [],
  bootstrap: [AppComponent],
  entryComponents:[AdminholidayaddComponent]
})
export class AppModule { }
