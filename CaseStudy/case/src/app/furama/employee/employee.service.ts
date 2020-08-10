import { Injectable } from '@angular/core';
import {Employee} from './employee';
import {Customer} from '../customer/customer';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  dsNhanVien: Employee[];
  constructor() {
    this.dsNhanVien = [
      {maNhanVien: 'NV-1234', hoTen: 'thu loi', viTri: 'Lễ tân', trinhDo: 'Cao đẳng', boPhan: 'Hành Chính', ngaySinh: '06/09/1996',
        soCMND: '0323123891', luong: '5000000', soDienThoai: '093231313', email: 'loi@Gamil.com', diaChi: 'Hue'},
      {maNhanVien: 'NV-1212', hoTen: 'thi vi', viTri: 'Lễ tân', trinhDo: 'Cao đẳng', boPhan: 'Hành Chính', ngaySinh: '06/09/1996',
        soCMND: '0323123891', luong: '7000000', soDienThoai: '093231313', email: 'vi@Gamil.com', diaChi: 'Quang Tri'},
    ];
  }
  findAll(): Employee[]{
    return this.dsNhanVien;
  }
  addEmployee(employee: Employee): void{
    this.dsNhanVien.push(employee);
  }
  findById(maNhanVien: string): Employee{
    return this.dsNhanVien.find(employee => employee.maNhanVien === maNhanVien);
  }
  deleteEmployee(maNhanVien: string): void{
    const index = this.dsNhanVien.indexOf(this.findById(maNhanVien));
    this.dsNhanVien.splice(index, 1);
  }
  updateEmployee(employee: Employee): Employee[]{
    this.deleteEmployee(employee.maNhanVien);
    this.dsNhanVien.push(employee);
    return this.findAll();
  }
}

