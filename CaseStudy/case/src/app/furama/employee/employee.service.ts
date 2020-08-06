import { Injectable } from '@angular/core';
import {Employee} from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  dsNhanVien: Employee[];
  constructor() {
    this.dsNhanVien = [
      {maNhanVien: 'NV-1234', hoTen: 'thu loi', viTri: 'Nha Hang', trinhDo: 'Cao Dang', boPhan: 'Nhan Hang', ngaySinh: '06/09/1996',
        soCMND: '0323123891', luong: '5000000', soDienThoai: '093231313', email: 'loi@Gamil.com', diaChi: 'Hue'},
      {maNhanVien: 'NV1212', hoTen: 'thi vi', viTri: 'Nha Hang', trinhDo: 'Dai Hoc', boPhan: 'Nhan Hang', ngaySinh: '06/09/1996',
        soCMND: '0323123891', luong: '7000000', soDienThoai: '093231313', email: 'vi@Gamil.com', diaChi: 'Quang Tri'},
    ];
  }
  findAll(): Employee[]{
    return this.dsNhanVien;
  }
  addEmployee(employee: Employee): void{
    this.dsNhanVien.push(employee);
  }
}

