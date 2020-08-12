import {Customer} from '../customer/customer';
import {Employee} from '../employee/employee';
import {Service} from '../service/service';

export class Contract{
  id: number
  maHopDong: string;
  nhanVien: Employee;
  khachHang: Customer;
  dichVu: Service;
  ngayLamHopDong: string;
  ngayKetThucHopDong: string;
  tienDatCoc: string;
  tongTien: string;

  constructor() {
  }
}
