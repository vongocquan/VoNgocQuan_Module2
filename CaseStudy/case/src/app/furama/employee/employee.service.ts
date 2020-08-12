import { Injectable } from '@angular/core';
import {Employee} from './employee';
import {Customer} from '../customer/customer';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  dsNhanVien: Employee[];
  API_URL_EMPLOYEE = 'http://localhost:3000/employee';
  constructor(private httpClient: HttpClient) {}
  findAll(): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(this.API_URL_EMPLOYEE);
  }
  addEmployee(employee: Employee): Observable<void>{
    return this.httpClient.post<void>(this.API_URL_EMPLOYEE, employee);
  }
  findById(id: number): Observable<Employee>{
    return this.httpClient.get<Employee>(this.API_URL_EMPLOYEE + '/' + id);
  }
  deleteEmployee(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.API_URL_EMPLOYEE + '/' + id);
  }
  updateEmployee(employee: Employee): Observable<void>{
    return this.httpClient.patch<void>(this.API_URL_EMPLOYEE + '/' + employee.id, employee);
  }
}

