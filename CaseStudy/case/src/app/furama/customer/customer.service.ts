import { Injectable } from '@angular/core';
import {Customer} from './customer';
import {ContractService} from '../contract/contract.service';
import {Contract} from '../contract/contract';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  dsHopDong: Contract[];
  dsKhachHang: Customer[];
  dsKhachHangBooking: Customer[];
  constructor(private contractService: ContractService) {
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
    this.dsKhachHang.splice(this.dsKhachHang.indexOf(this.findById(maKhachHang)), 1);
  }
  updateCustomer(customer: Customer): Customer[]{
    this.deleteCustomer(customer.maKhachHang);
    this.dsKhachHang.push(customer);
    return this.findAll();
  }
  findAllCustomerBooking(): Customer[]{
    this.dsHopDong = this.contractService.findAll();
    this.dsKhachHangBooking = [];
    const arr = [];
    // tslint:disable-next-line:prefer-for-of
    for (let i = 0; i < this.dsHopDong.length; i++){
      arr.push(this.dsHopDong[i].khachHang);
    }
    for (let i = 0; i < this.dsHopDong.length; i++ ){
      if (arr.indexOf(this.dsHopDong[i].khachHang) === i){
        this.dsKhachHangBooking.push(this.findById(this.dsHopDong[i].khachHang));
      }
    }
    return this.dsKhachHangBooking;
  }
}
