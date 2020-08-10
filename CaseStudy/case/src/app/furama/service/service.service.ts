import { Injectable } from '@angular/core';
import {Service} from './service';
import {Employee} from '../employee/employee';

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
  findById(maDichVu: string): Service{
    return this.dsDichVu.find(service => service.maDichVu === maDichVu);
  }
  deleteService(maDichVu: string): void{
    const index = this.dsDichVu.indexOf(this.findById(maDichVu));
    this.dsDichVu.splice(index, 1);
  }
  updateService(dichVu: Service): void{
    this.deleteService(dichVu.maDichVu);
    this.dsDichVu.push(dichVu);
  }
}
