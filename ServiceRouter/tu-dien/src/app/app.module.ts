import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { DsTuComponent } from './ds-tu/ds-tu.component';
import { TraCuuComponent } from './tra-cuu/tra-cuu.component';
import {TuDienRoutingModule} from './tu-dien-routing.module';
import {RouterModule} from '@angular/router';

@NgModule({
  declarations: [
    AppComponent,
    DsTuComponent,
    TraCuuComponent
  ],
  imports: [
    BrowserModule,
    TuDienRoutingModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
