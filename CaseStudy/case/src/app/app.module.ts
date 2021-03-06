import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AddContractComponent } from './furama/contract/add-contract/add-contract.component';
import { AddContractDetailComponent } from './furama/contract/add-contract-detail/add-contract-detail.component';
import { AddCustomerComponent } from './furama/customer/add-customer/add-customer.component';
import { ListCustomerComponent } from './furama/customer/list-customer/list-customer.component';
import { ListCustomerBookingComponent } from './furama/customer/list-customer-booking/list-customer-booking.component';
import { ListEmployeeComponent } from './furama/employee/list-employee/list-employee.component';
import { AddEmployeeComponent } from './furama/employee/add-employee/add-employee.component';
import { AddServiceComponent } from './furama/service/add-service/add-service.component';
import { ListServiceComponent } from './furama/service/list-service/list-service.component';
import {FaramaRoutingModule} from './farama-routing.module';
import { HomeComponent } from './furama/home/home.component';
import {RouterModule} from '@angular/router';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {UpdateEmployeeComponent} from './furama/employee/update-employee/update-employee.component';
import {UpdateCustomerComponent} from './furama/customer/update-customer/update-customer.component';
import { UpdateServiceComponent } from './furama/service/update-service/update-service.component';
import {HttpClientModule} from '@angular/common/http';
import { ListContractComponent } from './furama/contract/list-contract/list-contract.component';


@NgModule({
  declarations: [
    AppComponent,
    AddContractComponent,
    AddContractDetailComponent,
    AddCustomerComponent,
    ListCustomerComponent,
    ListCustomerBookingComponent,
    ListEmployeeComponent,
    AddEmployeeComponent,
    AddServiceComponent,
    ListServiceComponent,
    HomeComponent,
    UpdateEmployeeComponent,
    UpdateCustomerComponent,
    UpdateServiceComponent,
    ListContractComponent,
  ],
  imports: [
    BrowserModule,
    FaramaRoutingModule,
    RouterModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
