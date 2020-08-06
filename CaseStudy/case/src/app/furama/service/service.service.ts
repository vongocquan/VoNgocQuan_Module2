import { Injectable } from '@angular/core';
import {Service} from './service';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  dsDichVu: Service[];
  constructor() {
    this.dsDichVu = [
      {maDichVu: 'DV-0001', tenDichVu: 'dich vu 1', dienTich: '32', soTang: '3', soNguoiToiDa: '6', chiPhiThue: '500000', kieuThue: 'theo theo nam', trangThai: 'da thue'},
      {maDichVu: 'DV-0002', tenDichVu: 'dich vu 2', dienTich: '40', soTang: '2', soNguoiToiDa: '4', chiPhiThue: '600000', kieuThue: 'theo thang', trangThai: 'chua thue'}
    ];
  }
  findAll(): Service[]{
    return this.dsDichVu;
  }
  addService(service: Service): void{
    this.dsDichVu.push(service);
  }
}
