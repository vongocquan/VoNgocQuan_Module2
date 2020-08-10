import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from './furama/home/home.component';
import {ListCustomerComponent} from './furama/customer/list-customer/list-customer.component';
import {AddCustomerComponent} from './furama/customer/add-customer/add-customer.component';
import {ListCustomerBookingComponent} from './furama/customer/list-customer-booking/list-customer-booking.component';
import {AddContractComponent} from './furama/contract/add-contract/add-contract.component';
import {AddContractDetailComponent} from './furama/contract/add-contract-detail/add-contract-detail.component';
import {ListEmployeeComponent} from './furama/employee/list-employee/list-employee.component';
import {AddEmployeeComponent} from './furama/employee/add-employee/add-employee.component';
import {ListServiceComponent} from './furama/service/list-service/list-service.component';
import {AddServiceComponent} from './furama/service/add-service/add-service.component';
import {UpdateCustomerComponent} from './furama/customer/update-customer/update-customer.component';
import {UpdateEmployeeComponent} from './furama/employee/update-employee/update-employee.component';
import {UpdateServiceComponent} from './furama/service/update-service/update-service.component';

const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path: 'home',
    children: [
      {path: '', component: HomeComponent},
      {path: 'list-customer', component: ListCustomerComponent},
      {path: 'add-customer', component: AddCustomerComponent},
      {path: 'list-customer-booking', component: ListCustomerBookingComponent},
      {path: 'add-contract', component: AddContractComponent},
      {path: 'add-contract-detail', component: AddContractDetailComponent},
      {path: 'list-employee', component: ListEmployeeComponent},
      {path: 'add-employee', component: AddEmployeeComponent},
      {path: 'list-service', component: ListServiceComponent},
      {path: 'add-service', component: AddServiceComponent},
      {path: 'update-customer/:maKhachHang', component: UpdateCustomerComponent},
      {path: 'update-employee/:maNhanVien', component: UpdateEmployeeComponent},
        {path: 'update-service/:maDichVu', component: UpdateServiceComponent},
    ]}
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ]
})
export class FaramaRoutingModule { }
