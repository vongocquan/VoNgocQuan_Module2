import { Injectable } from '@angular/core';
import {Customer} from './customer';
import {ContractService} from '../contract/contract.service';
import {Contract} from '../contract/contract';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  khachHang: Customer = new Customer();
  dsHopDong: Contract[];
  dsKhachHang: Customer[];
  dsKhachHangBooking: Customer[];
  IPA_URL_CUSTOMER = 'http://localhost:3000/customer';
  constructor(private contractService: ContractService, private httpClient: HttpClient) {}
  findAll(): Observable<Customer[]>{
    return this.httpClient.get<Customer[]>(this.IPA_URL_CUSTOMER);
  }
  addCustomer(customer: Customer): Observable<void>{
    return this.httpClient.post<void>(this.IPA_URL_CUSTOMER, customer);
  }
  findById(id: number): Observable<Customer>{
    return this.httpClient.get<Customer>(this.IPA_URL_CUSTOMER + '/' + id);
  }
  deleteCustomer(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.IPA_URL_CUSTOMER + '/' + id);
  }
  updateCustomer(customer: Customer): Observable<void>{
    return this.httpClient.patch<void>(this.IPA_URL_CUSTOMER + '/' + customer.id, customer);
  }
}
