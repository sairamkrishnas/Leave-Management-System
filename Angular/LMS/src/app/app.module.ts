import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ManagerDashBoardComponent } from './manager-dash-board/manager-dash-board.component';

@NgModule({
  declarations: [
    AppComponent,
    ManagerDashBoardComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
