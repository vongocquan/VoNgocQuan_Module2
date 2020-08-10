import { Injectable } from '@angular/core';
import {Contract} from './contract';

@Injectable({
  providedIn: 'root'
})
export class ContractService {
  dsHopDong: Contract[];
  constructor() {
    this.dsHopDong = [
      // tslint:disable-next-line:max-line-length
      {maHopDong: 'HD-0001', nhanVien: 'sad', khachHang: 'KH-1234', dichVu: 'dshads', ngayLamHopDong: '02/12/2020', ngayKetThucHopDong: '12/12/2020',
        tienDatCoc: '40000', tongTien: '200000'},
      // tslint:disable-next-line:max-line-length
      {maHopDong: 'HD-0002', nhanVien: 'sad', khachHang: 'KH-1234', dichVu: 'dshads', ngayLamHopDong: '02/12/2020', ngayKetThucHopDong: '12/12/2020',
        tienDatCoc: '40000', tongTien: '200000'}
    ];
  }
  findAll(): Contract[]{
    return this.dsHopDong;
  }
  addContract(contract: Contract): void{
    this.dsHopDong.push(contract);
  }
}
