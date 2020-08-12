import { Injectable } from '@angular/core';
import {Contract} from './contract';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Customer} from '../customer/customer';

@Injectable({
  providedIn: 'root'
})
export class ContractService {
  dsHopDong: Contract[];
  IPA_URL_CONTRACT = 'http://localhost:3000/contract';
  constructor(private httpClient: HttpClient) {
  }
  findAll(): Observable<Contract[]>{
    return this.httpClient.get<Contract[]>(this.IPA_URL_CONTRACT);
  }
  addContract(contract: Contract): Observable<void>{
    return this.httpClient.post<void>(this.IPA_URL_CONTRACT, contract);
  }
}
