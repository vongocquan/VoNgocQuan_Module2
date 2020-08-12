import { Injectable } from '@angular/core';
import {Service} from './service';
import {Employee} from '../employee/employee';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  dsDichVu: Service[];
  IPA_URL_SERVICE = 'http://localhost:3000/service';
  constructor(private httpClient: HttpClient) {}
  findAll(): Observable<Service[]>{
    return this.httpClient.get<Service[]>(this.IPA_URL_SERVICE);
  }
  addService(service: Service): Observable<void>{
    return this.httpClient.post<void>(this.IPA_URL_SERVICE, service);
  }
  findById(id: number): Observable<Service>{
    return this.httpClient.get<Service>(this.IPA_URL_SERVICE + '/' + id);
  }
  deleteService(id: number): Observable<any>{
    return this.httpClient.delete<void>(this.IPA_URL_SERVICE + '/' + id);
  }
  updateService(dichVu: Service): Observable<void>{
    return this.httpClient.patch<void>(this.IPA_URL_SERVICE + '/' + dichVu.id, dichVu);
  }
}
