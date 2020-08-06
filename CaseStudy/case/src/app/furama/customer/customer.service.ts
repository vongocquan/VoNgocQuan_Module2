import { Injectable } from '@angular/core';
import {Customer} from './customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  dsKhachHang: Customer[];
  constructor() {
    this.dsKhachHang = [
      {maKhachHang: 'KH-1234', loaiKhachHang: 'vip', hoTen: 'Thanh Cong', ngaySinh: '04/02/1997',
        soCMND: '206109631', soDienThoai: '0345443380', email: 'cong4297@gmail.com', diaChi: 'Quang Nam'},
      {maKhachHang: 'KH-0000', loaiKhachHang: 'vip', hoTen: 'ngoc quan', ngaySinh: '04/02/1997',
        soCMND: '206109631', soDienThoai: '0845443380', email: 'quanv4297@gmail.com', diaChi: 'Quang Nam'}
    ];
  }
  findAll(): Customer[]{
    return this.dsKhachHang;
  }
  // tslint:disable-next-line:max-line-length
  add(customer: Customer): void{
    this.dsKhachHang.push(customer);
  }
  findById(maKhachHang: string): Customer{
    return this.dsKhachHang.find(customer => customer.maKhachHang === maKhachHang);
  }
  deleteCustomer(maKhachHang: string): void{
    this.dsKhachHang.splice(this.dsKhachHang.indexOf(this.findById(maKhachHang), 1));
  }
  updateCustomer(customer: Customer): void{
    this.deleteCustomer(customer.maKhachHang);
    this.dsKhachHang.push(customer);
  }
}
